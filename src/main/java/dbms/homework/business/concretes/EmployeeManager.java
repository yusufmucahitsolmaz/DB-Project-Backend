package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.EmployeeService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.EmployeeDao;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Veri eklendi.");
    }
}
