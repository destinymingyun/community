package com.example.demo.service.identityserviceimpl;

import com.example.demo.dao.IdentityMapper;
import com.example.demo.entity.Person;
import com.example.demo.protocol.Protocol;
import com.example.demo.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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

    @Override
    public List<Person> getPersonByOccupation(int occupation) {
        List<Person> people = identityMapper.selectAllIdentity();
        List<Person> occcupationPeople = new ArrayList<>();
        for (Person person : people) {
            if ((person.getOccupation() & occupation) == occupation) {
                occcupationPeople.add(person);
            }
        }
        return occcupationPeople;
    }
}
