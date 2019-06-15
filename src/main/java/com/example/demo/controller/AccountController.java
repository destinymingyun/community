package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.Account;
import com.example.demo.model.AddressInfo;
import com.example.demo.model.UserInfo;
import com.example.demo.protocol.Protocol;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
            case Protocol.ERROR:
                return "back/login";
            case Protocol.USER:
                account.setType(Protocol.USER);
                model.addAttribute("account", account);
                return "face/index";
            case Protocol.ADMIN:
                account.setType(Protocol.ADMIN);
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

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody JSONObject info) {
        //  账号信息
        Account account = new Account();
        account.setAccount((String) info.get("account"));
        account.setType(Protocol.USER);
        account.setPassword((String)info.get("password"));
        System.out.println("account = " + account);
        //  个人信息
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(account.getAccount());
        userInfo.setId((String)info.get("id"));
        userInfo.setAge((int)info.get("age"));
        userInfo.setSex((int)info.get("sex"));
        userInfo.setName((String)info.get("name"));
        //  居住信息
        Boolean isHere = info.getBoolean("isHere");
        if (isHere) {
            AddressInfo addressInfo = new AddressInfo();
            addressInfo.setApartmentId(info.getString("appartmentId"));
            addressInfo.setFloor(info.getInteger("floor"));
            addressInfo.setHomeId(info.getInteger("homeId"));
        }
        return null;
    }
}
