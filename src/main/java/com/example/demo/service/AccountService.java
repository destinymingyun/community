package com.example.demo.service;

import com.example.demo.entity.Account;

/**
 * 账号服务接口
 */
public interface AccountService {
    int login(Account account);
    void registerAccount(Account account);
    void changePassword(Account account, String newPassword);
    void changeUserPassword(Account account);
}
