package com.speque.sboot3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
        personRepository.save(person);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getPersons(){
        return personRepository.findAll();
    }
}
