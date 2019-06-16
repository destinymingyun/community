package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface IdentityService {
    void createIdentityInfo(Person person);
    void changeIdentityInfo(Person person);
    void plusIdentityInfo(Person person);
    List<Person> getPersonByOccupation(int occupation);
}
