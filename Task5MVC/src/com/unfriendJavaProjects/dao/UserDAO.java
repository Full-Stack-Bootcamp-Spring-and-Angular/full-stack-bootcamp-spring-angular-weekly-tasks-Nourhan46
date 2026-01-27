package com.unfriendJavaProjects.dao;

import com.unfriendJavaProjects.models.User;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
@Component
public interface UserDAO {
    public void save(User user) throws SQLException;
}
