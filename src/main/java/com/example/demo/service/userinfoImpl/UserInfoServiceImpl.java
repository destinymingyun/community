package com.example.demo.service.userinfoImpl;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public void registerUserInfo(UserInfo userInfo) {
        userInfoMapper.insertUserInfo(userInfo);
    }
}
