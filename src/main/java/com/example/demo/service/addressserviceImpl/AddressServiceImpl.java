package com.example.demo.service.addressserviceImpl;

import com.example.demo.dao.AddressInfoMapper;
import com.example.demo.entity.AddressInfo;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressInfoMapper addressInfoMapper;
    @Override
    public void registerAddress(AddressInfo addressInfo) {
        addressInfoMapper.insertAddressInfo(addressInfo);
    }
}
