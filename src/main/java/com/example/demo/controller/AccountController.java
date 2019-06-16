package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Account;
import com.example.demo.entity.AddressInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.protocol.Protocol;
import com.example.demo.service.AccountService;
import com.example.demo.service.AddressService;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 账号登陆控制
 */
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private AddressService addressService;

    /**
     * 登陆
     * @param account 账号和密码
     * @param model   保存在model中的账号和密码提供给thymelf使用
     * @return 登陆成功登陆后的页面或登陆失败返回登陆页面
     */
    @PostMapping("/loginAccount")
    public String login(Account account, Model model, HttpSession session) {
        int type = accountService.login(account);
        switch (type) {
            case Protocol.ERROR:
                return "back/login";
            case Protocol.USER:
                account.setType(Protocol.USER);
                model.addAttribute("account", account);
                session.setAttribute("account", account.getAccount());
                return "face/index";
            case Protocol.ADMIN:
                account.setType(Protocol.ADMIN);
                model.addAttribute("account", account);
                session.setAttribute("account", account.getAccount());
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
    public Boolean register(@RequestBody JSONObject info) {
        //  账号信息
        Account account = new Account();
        account.setAccount((String) info.get("account"));
        account.setType(Protocol.USER);
        account.setPassword((String)info.get("password"));
//        System.out.println("account = " + account);
        accountService.registerAccount(account);
        //  个人信息
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(account.getAccount());
        userInfo.setId((String)info.get("id"));
        userInfo.setAge(info.getInteger("age"));
        userInfo.setSex(info.getInteger("sex"));
        userInfo.setName((String)info.get("name"));
//        System.out.println(userInfo);
        userInfoService.registerUserInfo(userInfo);
        //  居住信息
        Boolean isHere = info.getBoolean("isHere");
        System.out.println("isHere = " + isHere);
        if (isHere) {
            AddressInfo addressInfo = new AddressInfo();
            addressInfo.setId(userInfo.getId());
            addressInfo.setApartmentId(info.getString("appartmentId"));
            addressInfo.setFloor(info.getInteger("floor"));
            addressInfo.setHomeId(info.getInteger("homeId"));
            addressService.registerAddress(addressInfo);
        }
        return true;
    }

    @PostMapping("/changePassword")
    @ResponseBody
    public boolean changePassword(@RequestBody JSONObject info) {
        Account account = new Account();
        account.setAccount(info.getString("account"));
        account.setPassword(info.getString("password"));
        String newPassword = info.getString("newPassword");
        accountService.changePassword(account, newPassword);
        return true;
    }

    @PostMapping("/admin/changePassword")
    @ResponseBody
    public boolean changeUserPassword(Account account) {
        System.out.println(account);
        accountService.changeUserPassword(account);
        return true;
    }
}
