package com.example.demospringdata.dao;

import com.example.demospringdata.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long> {
}
