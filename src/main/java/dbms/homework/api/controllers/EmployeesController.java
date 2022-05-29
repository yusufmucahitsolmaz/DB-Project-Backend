package dbms.homework.api.controllers;


import dbms.homework.business.abstracts.EmployeeService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getall")
    public DataResult<List<Employee>> getAll(){
        return this.employeeService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employee employee){
        return this.employeeService.add(employee);
    }

}
