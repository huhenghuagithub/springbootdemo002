package com.offcn.springbootdemo002.service.impl;

import com.offcn.springbootdemo002.dao.PersonDao;
import com.offcn.springbootdemo002.po.Person;
import com.offcn.springbootdemo002.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void add(Person person) {
        personDao.save(person);
    }

    @Override
    public void update(Person person) {
     personDao.saveAndFlush(person);
    }

    @Override
    public void delete(Long id) {
     personDao.deleteById(id);
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person findOne(Long id) {
        return personDao.findById(id).get();
    }
}
