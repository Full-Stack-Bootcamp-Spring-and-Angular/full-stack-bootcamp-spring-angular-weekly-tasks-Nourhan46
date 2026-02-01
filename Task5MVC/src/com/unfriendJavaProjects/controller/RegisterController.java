package com.unfriendJavaProjects.controller;

import com.unfriendJavaProjects.dao.UserDaoImplmetation;
import com.unfriendJavaProjects.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.SQLException;
import java.time.LocalDate;

@Controller
public class RegisterController {
    @Autowired
private UserDaoImplmetation userdao;
   @RequestMapping ("/")
   public String register_form(Model model)
   {
       model.addAttribute("user", new User());
       return "formPage";
   }
@RequestMapping("/process_data")
   public String process_data(@Valid  @ModelAttribute("user") User user, BindingResult bindingResult, Model model) throws SQLException {
    if (bindingResult.hasErrors()) {
        return "formPage";
    } else {

        model.addAttribute("user", user);
        userdao.save(user);
        return "resultPage";
    }
}
}
