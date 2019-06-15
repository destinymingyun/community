package com.example.demo.service.accountimpl;

import com.example.demo.dao.AccountMapper;
import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int login(Account account) {
        int type;
        try {
            type = accountMapper.selectAccount(account);
        } catch (Exception e) {
            type = 0;
        }
        return type;
    }

    @Override
    public void registerAccount(Account account) {
        accountMapper.insertAccount(account);
    }

    @Override
    public void changePassword(Account account, String newPassword) {
        accountMapper.selectAccount(account);
        account.setPassword(newPassword);
        accountMapper.updatePassword(account);
    }

    @Override
    public void changeUserPassword(Account account) {
        accountMapper.updatePassword(account);
    }
}
