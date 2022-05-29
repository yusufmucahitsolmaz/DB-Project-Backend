package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.PersonService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.PersonDao;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonManager implements PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonManager(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public DataResult<List<Person>> getAll() {
        return new SuccessDataResult<List<Person>>(this.personDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(Person person) {
        this.personDao.save(person);
        return new SuccessResult("Veri eklendi.");
    }
}
