package com.rassul.simpleWebApplication.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "Login Page..";
    }
}
