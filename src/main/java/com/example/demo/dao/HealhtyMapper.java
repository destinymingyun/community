package com.example.demo.dao;

import com.example.demo.entity.Healthy;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealhtyMapper {
    void insertHealthyMapper(Healthy healthy);
}
