package com.example.demo.service.accountImpl;

import com.example.demo.dao.AccountMapper;
import com.example.demo.model.Account;
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
}
