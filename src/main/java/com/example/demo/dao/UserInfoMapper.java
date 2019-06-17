package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    void insertUserInfo(UserInfo userInfo);
    UserInfo selectUserInfoById(String id);
}
