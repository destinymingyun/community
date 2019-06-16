package com.example.demo.controller;

import com.example.demo.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * 后台页面映射
 */
@Controller
public class BackPageController {

    @GetMapping("/login")
    public String goLogin() {
        return "back/login";
    }

    @GetMapping("/register")
    public String register() {
        return "back/register";
    }

    @GetMapping("/changePassword")
    public String changePassword() {
        return "/back/change-password";
    }

    @GetMapping("/changeUserPassword")
    private String changeUserPassword() {
        return "/back/change-user-password";
    }

    /**
     * 获取居民信息
     *
     * @return
     */
    @GetMapping("/ResidentInfo")
    public String ResidentInfo() {
        return "back/resident-info";
    }

    /**
     * 纠纷调解记录
     *
     * @return
     */
    @GetMapping("/securityInfo")
    public String securityInfo() {
        return "back/security-info";
    }

    /**
     * 健康档案管理
     */
    @GetMapping("/healthyInfo")
    public String healthyInfo() {
        return "back/healthy-info";
    }

    /**
     * 志愿者信息
     */
    @GetMapping("/Volunteer")
    public String Volunteer() {
        return "back/volunteer";
    }

    /**
     * 下岗职工档案
     */
    @GetMapping("/laidOff")
    public String laidOff() {
        return "back/laid-off";
    }

    /**
     * 再就业培训
     * @return
     */
    @GetMapping("/tranWork")
    public String tranWork() {
        return "back/trunWork";
    }

    /**
     * 保障金
     */
    @GetMapping("/subsistenceAllowances")
    public String subsistenceAllowances() {
        return "back/subsistenceAllowances";
    }
}
