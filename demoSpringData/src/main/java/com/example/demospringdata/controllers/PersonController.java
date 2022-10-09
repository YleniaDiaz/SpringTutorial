package com.example.demospringdata.controllers;

import com.example.demospringdata.dao.PersonDao;
import com.example.demospringdata.domain.Person;
import com.example.demospringdata.services.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public List<Person> getAll() {
        log.info("People Controller");
        return personService.findAll();
    }

    @PostMapping("/person/save")
    public Person save(@RequestBody Person person) {
        log.info("People save");
        return personService.save(person);
    }

    @PostMapping("/person/edit")
    public Person edit(@RequestBody Person person) {
        log.info("People edit");
        return personService.save(person);
    }

    @DeleteMapping("/person/delete/{id}")
    public void delete(@PathVariable Long id) {
        log.info("People delete");
        personService.delete(id);
    }
}
