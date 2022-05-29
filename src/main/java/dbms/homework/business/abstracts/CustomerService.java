package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {

    DataResult<List<Customer>> getAll();

    Result add (Customer customer);
}
