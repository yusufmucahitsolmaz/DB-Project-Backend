package dbms.homework.api.controllers;

import dbms.homework.business.abstracts.TypeOfServiceService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.TypeOfService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeofservices")
public class TypeOfServicesController {

    private TypeOfServiceService typeOfServiceService;

    @Autowired
    public TypeOfServicesController(TypeOfServiceService typeOfServiceService) {
        this.typeOfServiceService = typeOfServiceService;
    }

    @GetMapping("/getall")
    public DataResult<List<TypeOfService>> getAll(){
        return this.typeOfServiceService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody TypeOfService typeOfService){
        return this.typeOfServiceService.add(typeOfService);
    }
}
