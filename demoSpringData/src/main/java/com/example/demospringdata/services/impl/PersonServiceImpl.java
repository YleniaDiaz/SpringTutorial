package com.example.demospringdata.services.impl;

import com.example.demospringdata.dao.PersonDao;
import com.example.demospringdata.domain.Person;
import com.example.demospringdata.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public Person save(Person person) {
        return personDao.save(person);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        personDao.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Person findById(Long id) {
        return personDao.findById(id).orElse(null);
    }
}
