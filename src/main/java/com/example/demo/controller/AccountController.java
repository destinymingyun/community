package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.protocol.AccountProtocol;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * 账号登陆控制
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 登陆
     * @param account 账号和密码
     * @param model   保存在model中的账号和密码提供给thymelf使用
     * @return 登陆成功登陆后的页面或登陆失败返回登陆页面
     */
    @PostMapping("/loginAccount")
    public String login(Account account, Model model) {
        int type = accountService.login(account);
        switch (type) {
            case AccountProtocol.ERROR:
                return "back/login";
            case AccountProtocol.USER:
                account.setType(AccountProtocol.USER);
                model.addAttribute("account", account);
                return "face/index";
            case AccountProtocol.ADMIN:
                account.setType(AccountProtocol.ADMIN);
                model.addAttribute("account", account);
                return "back/index";
            default:
                return "back/login";
        }
    }

    /**
     * 登出
     */
    @GetMapping("/logout")
    public String logout() {
        return "/back/login";
    }

}
