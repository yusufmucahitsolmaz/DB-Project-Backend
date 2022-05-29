package dbms.homework.api.controllers;

import dbms.homework.business.abstracts.PersonService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/persons")
public class PersonsController {

    private PersonService personService;

    @Autowired
    public PersonsController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/getall")
    public DataResult<List<Person>> getAll(){
        return this.personService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Person person){
        return this.personService.add(person);
    }
}
