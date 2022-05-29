package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.TypeOfService;

import java.util.List;

public interface TypeOfServiceService {

    DataResult<List<TypeOfService>> getAll();

    Result add (TypeOfService typeOfService);
}
