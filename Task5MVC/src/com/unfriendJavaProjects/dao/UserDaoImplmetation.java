package com.unfriendJavaProjects.dao;

import com.unfriendJavaProjects.models.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;
@Component
public class UserDaoImplmetation  implements  UserDAO{
    @Value("${db.url}")
String url;
    @Value("${db.username}")
String username;
    @Value("${db.password}")
String password;
Connection con;
    @PostConstruct
    private   void BeginConnecting() throws SQLException, ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection(url ,username,password);
        System.out.println("connected to database");
    }

    @Override
    public void save(User user) throws SQLException {
        String query = "insert  into users (first_name,last_name, email, date , city) values(?,?,?,?,?)";

        PreparedStatement st = con.prepareStatement(query);
        st.setString(1,user.getFirstname());
        st.setString(2,user.getLastname());
        st.setString(3,user.getEmail());
        st.setDate(4, Date.valueOf(user.getDate()));
        st.setString(5,user.getCity());
        st.executeUpdate();
        System.out.println("saved");
    }
}
