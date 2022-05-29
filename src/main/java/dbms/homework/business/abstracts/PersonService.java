package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Person;

import java.util.List;

public interface PersonService {

    DataResult<List<Person>> getAll();

    Result add (Person person);
}
