package com.example.demo.dao;

import com.example.demo.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    int selectAccount(Account account);
    void insertAccount(Account account);
    void updatePassword(Account account);
}
