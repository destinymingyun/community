package com.example.demo.dao;

import com.example.demo.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    int selectAccount(Account account);
    int insertAccount(Account account);
}
