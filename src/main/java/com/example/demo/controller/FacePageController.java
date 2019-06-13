package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 前端页面跳转控制器
 */
@Controller
public class FacePageController {

    /**
     * 跳转到关于我们页面
     * @return 返回关于我们页面映射
     */
    @GetMapping("/about")
    public String goAbout() {
        return "face/about";
    }

    /**
     * 跳转到主页
     * @return 返回主页映射
     */
    @GetMapping({"/index", "/"})
    public String goIndex() {
        return "face/index";
    }

    /**
     * 跳转到服务页面
     * @return 服务页面映射
     */
    @GetMapping("/services")
    public String goServices() {
        return "face/services";
    }

    /**
     * 跳转到调节纠纷内容
     * @return 返回调节纠纷内容
     */
    @GetMapping("/contact")
    public String goContact() {
        return "face/contact";
    }

    @GetMapping("/gallery")
    public String goGallery() {
        return "face/gallery";
    }

}
