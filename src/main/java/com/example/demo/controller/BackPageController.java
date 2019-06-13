package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 后台页面映射
 */
@Controller
public class BackPageController {
    @GetMapping("/login")
    public String goLogin(){ return "back/login"; }

    @GetMapping("/register")
    public String register() {
        return "back/register";
    }
}
