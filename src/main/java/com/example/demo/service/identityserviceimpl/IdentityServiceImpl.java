package com.example.demo.service.identityserviceimpl;

import com.example.demo.dao.IdentityMapper;
import com.example.demo.entity.Person;
import com.example.demo.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;

public class IdentityServiceImpl implements IdentityService {
    @Autowired
    private IdentityMapper identityMapper;
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
        Person person1 = identityMapper.selecltIdentityById(person.getId());
        person1.setOccupation(person1.getOccupation() | person.getOccupation() );
        identityMapper.updateIdentity(person1);
    }
}
