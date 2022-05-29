package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Admin;
import dbms.homework.entities.concretes.Computer;

import java.util.List;

public interface AdminService {
    DataResult<List<Admin>> getAll();

    Result add (Admin admin);
}
