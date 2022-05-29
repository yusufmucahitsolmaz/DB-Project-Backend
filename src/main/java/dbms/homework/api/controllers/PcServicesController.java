package dbms.homework.api.controllers;

import dbms.homework.business.abstracts.PcServiceService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/pcservices")
public class PcServicesController {
    private PcServiceService pcServiceService;

    @Autowired
    public PcServicesController(PcServiceService pcServiceService) {
        this.pcServiceService = pcServiceService;
    }

    @GetMapping("/getall")
    public DataResult<List<PcService>> getAll(){
        return this.pcServiceService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody PcService pcService){
        return this.pcServiceService.add(pcService);
    }

    @GetMapping("/getAllActiveComputerList")
    public DataResult<List<PcService>> getAllServiceFinishedComputerList(){
        return this.pcServiceService.getAllServiceFinishedComputerList();
    }

}
