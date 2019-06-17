package com.example.demo.dao;

import com.example.demo.entity.DisputeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DisputeMapper {
    void insertDisputeInfo(DisputeInfo disputeInfo);
    List<DisputeInfo> selectAll();
}
