package com.example.demo.service;

import com.example.demo.entity.DisputeInfo;

import java.util.List;

public interface DisputeService {
    void addDisputeInfo(DisputeInfo disputeInfo);
    List<DisputeInfo> getAllSecurityLog();
}
