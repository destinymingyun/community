package com.example.demo.dao;

import com.example.demo.entity.Healthy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HealthyMapper {
    void insertHealthyMapper(Healthy healthy);
    Healthy selectHealthyById(String id);
    List<Healthy> selectAll();
}
