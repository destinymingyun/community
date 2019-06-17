package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.entity.UserInfo;

import java.util.List;

public interface IdentityService {
    void createIdentityInfo(Person person);
    void changeIdentityInfo(Person person);
    void plusIdentityInfo(Person person);
    List<UserInfo> getPersonByOccupation(int occupation);
}
