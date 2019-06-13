package com.example.demo.dao;

import com.example.demo.model.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    int selectAccount(Account account);
}
