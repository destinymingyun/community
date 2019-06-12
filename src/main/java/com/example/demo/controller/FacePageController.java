package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 前端页面跳转控制器
 */
@Controller
public class FacePageController {

    @GetMapping("/about")
    public String goAbout() {
        return "face/about";
    }

    @GetMapping({"/index", "/"})
    public String goIndex() {
        return "face/index";
    }
}
