package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.CustomerService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.CustomerDao;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;

    @Autowired
    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public DataResult<List<Customer>> getAll() {
        return new SuccessDataResult<List<Customer>>(this.customerDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(Customer customer) {
        this.customerDao.save(customer);
        return new SuccessResult("Veri eklendi.");
    }
}
