package com.example.demo.service.disputeservice;

import com.example.demo.dao.DisputeMapper;
import com.example.demo.entity.DisputeInfo;
import com.example.demo.service.DisputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisputeServiceImpl implements DisputeService {
    @Autowired
    private DisputeMapper disputeMapper;
    @Override
    public void addDisputeInfo(DisputeInfo disputeInfo) {
        disputeMapper.insertDisputeInfo(disputeInfo);
    }
}
