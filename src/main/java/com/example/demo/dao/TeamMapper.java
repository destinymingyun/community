package com.example.demo.dao;

import com.example.demo.entity.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamMapper {
    List<Team> selectAll();
}
