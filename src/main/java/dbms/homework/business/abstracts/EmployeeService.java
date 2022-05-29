package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult<List<Employee>> getAll();

    Result add (Employee employee);
}
