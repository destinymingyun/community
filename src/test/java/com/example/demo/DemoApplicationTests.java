package com.example.demo;

import com.example.demo.dao.AccountMapper;
import com.example.demo.dao.DisputeMapper;
import com.example.demo.dao.HealthyMapper;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.Account;
import com.example.demo.entity.DisputeInfo;
import com.example.demo.entity.Healthy;
import com.example.demo.entity.UserInfo;
import com.example.demo.protocol.Protocol;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
        disputeInfo.setSummary("两人与其打架，不如跳舞");
        disputeMapper.insertDisputeInfo(disputeInfo);
    }

    @Autowired
    HealthyMapper healthyMapper;
    @Test
    public void testHealthy() {
        Healthy healthy = new Healthy();
        healthy.setHeight(174);
        healthy.setWeight(70);
        healthy.setResidentId("123456789012345678");
        healthy.setVision(5.2);
//      healthyMapper.insertHealthyMapper(healthy);
        healthy = healthyMapper.selectHealthyById("123456789012345678");
        System.out.println("healthy = " + healthy);
    }

    @Test
    public void testChangePassowrd() {
        Account account = new Account();
        account.setAccount("admin@qq.com");
        account.setPassword("123456");
        accountMapper.selectAccount(account);
        account.setPassword("12345678");

        accountMapper.updatePassword(account);
    }

    @Test
    public void testStatus() {
        //  失业 和 志愿者 和应该为3
        System.out.println(Protocol.VOLUNTEER | Protocol.POOLED);
        System.out.println(Protocol.POOLED & 31);
    }

    @Test
    public void testHealthy2() {
        List<Healthy> healthies = healthyMapper.selectAll();
        for (Healthy healthy : healthies) {
            System.out.println(healthy);
        }
    }
}
