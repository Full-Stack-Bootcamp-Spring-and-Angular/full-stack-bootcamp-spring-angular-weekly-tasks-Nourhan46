package com.unfriendJavaProjects.controller;

import com.unfriendJavaProjects.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
@Controller
public class HelloController {

    @GetMapping("/")

    public String process_form(Model model)
    {
        model.addAttribute("user",new User());
        return  "index";
    }
@RequestMapping("/hello")
    public String getView(@ModelAttribute("user") User user , Model model)
    {
        System.out.println("i am here");
user.setName(user.getName().toUpperCase());
        return "hello";
    }
}
