package com.example.demo.service.healthyserviceimpl;

import com.example.demo.dao.HealthyMapper;
import com.example.demo.entity.Healthy;
import com.example.demo.service.HealthyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthyServiceImpl implements HealthyService {
    @Autowired
    private HealthyMapper healhtyMapper;
    @Override
    public void addHealhtyInfo(Healthy healthy) {
        healhtyMapper.insertHealthyMapper(healthy);
    }

    @Override
    public List<Healthy> getAllHealthyInfo() {
        return healhtyMapper.selectAll();
    }
}
