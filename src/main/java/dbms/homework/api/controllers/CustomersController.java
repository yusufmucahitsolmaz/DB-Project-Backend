package dbms.homework.api.controllers;


import dbms.homework.business.abstracts.CustomerService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    private CustomerService customerService;

    @Autowired
    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public DataResult<List<Customer>> getAll(){
        return this.customerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Customer customer){
        return this.customerService.add(customer);
    }
}
