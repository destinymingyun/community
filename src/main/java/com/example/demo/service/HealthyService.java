package com.example.demo.service;

import com.example.demo.entity.Healthy;

import java.util.List;

public interface HealthyService {
    void addHealhtyInfo(Healthy healthy);
    List<Healthy> getAllHealthyInfo();
}
