package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;

import java.util.List;

public interface ComputerService {
    DataResult<List<Computer>> getAll();
    Result add (Computer computer);

    DataResult<Computer> getByModelName(String computerModelName);

    DataResult<Computer> getByModelNameAndComputerId(String computerModelName,int computerId);

    DataResult<List<Computer>> getByModelNameOrComputerId(String computerModelName, int computerId);

    DataResult<List<Computer>> getByModelNameContains(String ComputerModelName);

    DataResult<List<Computer>> getAll(int pageNo,int pageSize);

}
