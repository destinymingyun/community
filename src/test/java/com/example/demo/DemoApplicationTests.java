package com.example.demo;

import com.example.demo.dao.AccountMapper;
import com.example.demo.dao.DisputeMapper;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.Account;
import com.example.demo.entity.DisputeInfo;
import com.example.demo.entity.UserInfo;
import com.example.demo.protocol.Protocol;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired AccountMapper accountMapper;
    @Autowired UserInfoMapper userInfoMapper;
    @Autowired DisputeMapper disputeMapper;
    @Test
    public void contextLoads() {
        System.out.println("状态:"+ (Protocol.USER | Protocol.SUCCESS));
    }

    @Test
    public void testAccountRegisterMapper() {
        Account account = new Account();
        account.setAccount("admin@qq.com");
        account.setPassword("123456");
        System.out.println("状态"+accountMapper.selectAccount(account));

        account.setType(3);
        account.setAccount("abc123@qq.com");
        account.setPassword("123456");
        accountMapper.insertAccount(account);
    }

    @Test
    public void testUserInfoInsertUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("1234567890");
        userInfo.setAccount("123@qq.com");
        userInfo.setSex(1);
        userInfo.setAge(10);
        userInfoMapper.insertUserInfo(userInfo);
    }

    @Test
    public void testDisputeInfo() {
        DisputeInfo disputeInfo = new DisputeInfo();
        disputeInfo.setAdminAccount("123@qq.com");
        disputeInfo.setSummary("两人当众打架，不如跳舞");
        disputeMapper.insertDisputeInfo(disputeInfo);
    }
}
