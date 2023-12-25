package com.se2102.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "sign-in";
    }

    @GetMapping("/signup")
    public String showSignupPage() {
        return "sign-up";
    }

}
