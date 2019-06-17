package com.example.demo.service.identityserviceimpl;

import com.example.demo.dao.IdentityMapper;
import com.example.demo.dao.UserInfoMapper;
import com.example.demo.entity.Person;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdentityServiceImpl implements IdentityService {
    @Autowired
    private IdentityMapper identityMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public void createIdentityInfo(Person person) {
        identityMapper.insertIdentity(person);
    }

    /**
     * 修改身份
     * @param person
     */
    @Override
    public void changeIdentityInfo(Person person) {
        identityMapper.updateIdentity(person);
    }

    /**
     * 追加新身份
     * @param person
     */
    @Override
    public void plusIdentityInfo(Person person) {
        Person person1 = identityMapper.selectIdentityById(person.getId());
        person1.setOccupation(person1.getOccupation() | person.getOccupation() );
        identityMapper.updateIdentity(person1);
    }

    @Override
    public List<UserInfo> getPersonByOccupation(int occupation) {
        List<Person> people = identityMapper.selectAllIdentity();
        List<UserInfo> occcupationPeople = new ArrayList<>();
        for (Person person : people) {
            if ((person.getOccupation() & occupation) == occupation) {
                occcupationPeople.add(userInfoMapper.selectUserInfoById(person.getId()));
            }
        }
        return occcupationPeople;
    }
}
