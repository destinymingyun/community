package com.example.demo.service.teamserviceImpl;

import com.example.demo.dao.TeamMapper;
import com.example.demo.entity.Team;
import com.example.demo.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;
    @Override
    public List<Team> getAllTeam() {
        return teamMapper.selectAll();
    }
}
