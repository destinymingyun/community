package com.example.demo.controller;

import com.example.demo.entity.Healthy;
import com.example.demo.entity.Person;
import com.example.demo.service.HealthyService;
import com.example.demo.service.IdentityService;
import com.example.demo.service.healthyserviceimpl.HealthyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/getAllHealthy")
    @ResponseBody
    public List<Healthy> getAllHealthy() {
        return healthyService.getAllHealthyInfo();
    }

    @GetMapping("/getVolunteer")
    @ResponseBody
    public List<Person> getVolunteer() {
        identityService
    }
}
