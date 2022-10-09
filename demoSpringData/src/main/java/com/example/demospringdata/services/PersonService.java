package com.example.demospringdata.services;

import com.example.demospringdata.domain.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person save(Person person);

    void delete(Long id);

    Person findById(Long id);
}
