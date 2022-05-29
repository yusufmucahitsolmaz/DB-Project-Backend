package dbms.homework.api.controllers;

import dbms.homework.business.abstracts.ComputerService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/computers")
public class ComputersController {

    private ComputerService computerService;

    @Autowired
    public ComputersController(ComputerService computerService) {
        this.computerService = computerService;
    }


    @GetMapping("/getall")
    public DataResult<List<Computer>> getAll(){
        return this.computerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Computer computer){
        return this.computerService.add(computer);
    }

    @GetMapping("/getByModelName")
    public DataResult<Computer> getByModelName(@RequestParam String modelName){
        return this.computerService.getByModelName(modelName);
    }

    @GetMapping("/getByModelNameAndComputerId")
    public DataResult<Computer> getByModelNameAndComputerId(@RequestParam String modelName,@RequestParam int computerId ){
        return this.computerService.getByModelNameAndComputerId(modelName,computerId);
    }
    @GetMapping("/getAllByPage")
    DataResult<List<Computer>> getAll(int pageNo,int pageSize){
        return this.computerService.getAll(pageNo,pageSize);
    }
}
