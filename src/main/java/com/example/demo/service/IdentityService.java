package com.example.demo.service;

import com.example.demo.entity.Person;

public interface IdentityService {
    void createIdentityInfo(Person person);
    void changeIdentityInfo(Person person);
    void plusIdentityInfo(Person person);
}
