package com.example.demo.service;

import com.example.demo.entity.AddressInfo;

import java.util.List;

public interface AddressService {
    void registerAddress(AddressInfo addressInfo);
    List<AddressInfo> getAllAddress();
}
