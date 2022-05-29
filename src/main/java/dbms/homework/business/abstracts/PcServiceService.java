package dbms.homework.business.abstracts;

import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.PcService;

import java.util.List;

public interface PcServiceService {

    DataResult<List<PcService>> getAll();

    Result add (PcService pcService);}
