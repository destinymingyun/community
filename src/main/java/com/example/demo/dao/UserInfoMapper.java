package com.example.demo.dao;

import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    void insertUserInfo(UserInfo userInfo);
}
