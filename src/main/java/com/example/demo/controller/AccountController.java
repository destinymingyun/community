package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 账号登陆控制
 */
@Controller
public class AccountController {
    @PostMapping("/loginAccount")
    public String login() {
        return null;
    }
}
