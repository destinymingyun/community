package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IdentityMapper {
    void insertIdentity(Person person);
}
