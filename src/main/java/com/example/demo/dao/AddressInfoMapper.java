package com.example.demo.dao;

import com.example.demo.entity.AddressInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressInfoMapper {
    void insertAddressInfo(AddressInfo addressInfo);
    List<AddressInfo> selectAllAddress();
}
