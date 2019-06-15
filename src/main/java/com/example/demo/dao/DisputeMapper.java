package com.example.demo.dao;

import com.example.demo.entity.DisputeInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DisputeMapper {
    void insertDisputeInfo(DisputeInfo disputeInfo);
}
