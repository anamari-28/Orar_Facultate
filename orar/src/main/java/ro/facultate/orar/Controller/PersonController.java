package ro.facultate.orar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.facultate.orar.Entity.Person;
import ro.facultate.orar.Service.ServicePerson;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private ServicePerson servicePerson;

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person)
    {
        return servicePerson.addPerson(person);
    }
}