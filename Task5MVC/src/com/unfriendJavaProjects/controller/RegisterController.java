package com.unfriendJavaProjects.controller;

import com.unfriendJavaProjects.dao.UserDaoImplmetation;
import com.unfriendJavaProjects.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.time.LocalDate;

@Controller
public class RegisterController {
    @Autowired
private UserDaoImplmetation userdao;
   @RequestMapping ("/")
   public String register_form()
   {
       return "formPage";
   }
@RequestMapping("/process_data")
   public String process_data(HttpServletRequest request , Model model) throws SQLException {
String firstName= request.getParameter("firstName");
String lastName = request.getParameter("lastName");
String email = request.getParameter("email");
LocalDate date = LocalDate.parse(request.getParameter("dateOfBirth"));
String city=request.getParameter("city");
User user = new User(firstName,lastName,email,date,city);
model.addAttribute("user",user);
userdao.save(user);
       return "resultPage";
   }
}
