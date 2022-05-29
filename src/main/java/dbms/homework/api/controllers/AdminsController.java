package dbms.homework.api.controllers;


import dbms.homework.business.abstracts.AdminService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Admin;
import dbms.homework.entities.concretes.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/api/admins")
@RestController
public class AdminsController {

    private AdminService adminService;

    @Autowired
    public AdminsController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/getall")
    public DataResult<List<Admin>> getAll(){
        return this.adminService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Admin admin){
        return this.adminService.add(admin);
    }


}
