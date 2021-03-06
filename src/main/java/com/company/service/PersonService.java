package com.company.service;

import com.company.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person) {
        return person;
    }

    public Person update(Person person) {
        return person;
    }

    public void delete(String id) {

    }

    public Person findById(String id) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Céline");
        person.setLastName("Villain");
        person.setAddress("Göteborg");
        person.setGender("Female");
        return person;
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for(int i = 0; i < 8; i++) {
            persons.add(mockPerson(i));
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("First name" + i);
        person.setLastName("Last name" + i);
        person.setAddress("Some address in Sweden" + i);
        person.setGender("Female" + i);
        return person;
    }

}
