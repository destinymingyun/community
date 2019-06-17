package com.example.demo.dao;

import com.example.demo.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdentityMapper {
    void insertIdentity(Person person);
    void updateIdentity(Person person);
    Person selectIdentityById(String id);
    List<Person> selectAllIdentity();
}
