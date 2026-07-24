package ro.facultate.orar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.facultate.orar.Entity.Person;
import ro.facultate.orar.Repository.RepoPerson;

@Service
public class ServicePerson {

    @Autowired
    private RepoPerson repoPerson;

    public Person addPerson(Person person) {
        return repoPerson.save(person);
    }
}