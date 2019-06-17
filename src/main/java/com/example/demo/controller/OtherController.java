package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.TeamMapper;
import com.example.demo.entity.*;
import com.example.demo.protocol.Protocol;
import com.example.demo.service.*;
import com.example.demo.service.healthyserviceimpl.HealthyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 健康，社团数据控制权
 */
@Controller
public class OtherController {
    @Autowired
    private HealthyService healthyService;
    @Autowired
    private IdentityService identityService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private DisputeService disputeService;
    @Autowired
    private TeamService teamService;

    @GetMapping("/getAllHealthy")
    @ResponseBody
    public List<Healthy> getAllHealthy() {
        return healthyService.getAllHealthyInfo();
    }

    @GetMapping("/getOccupation")
    @ResponseBody
    public List<UserInfo> getVolunteers(int occupation) {
        List<UserInfo> userInfos = identityService.getPersonByOccupation(occupation);
        for (UserInfo userInfo : userInfos) {
        }
        return userInfos;
    }

    @GetMapping("getResidentInfo")
    @ResponseBody
    public List<AddressInfo> getResidentInfo() {
        return addressService.getAllAddress();
    }

    @GetMapping("getAllSecurityLog")
    @ResponseBody
    public List<DisputeInfo> getAllSecurityLog() {
        return disputeService.getAllSecurityLog();
    }

    @GetMapping("getAllTeam")
    @ResponseBody
    public List<Team> getAllTeam() {
        return teamService.getAllTeam();
    }

    @PostMapping("/changeIdentity")
    @ResponseBody
    public boolean changeIdentity(Person person) {
        identityService.changeIdentityInfo(person);
        return true;
    }
}
