package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.PcServiceService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.PcServiceDao;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcServiceManager implements PcServiceService {

    private PcServiceDao pcServiceDao;

    @Autowired
    public PcServiceManager(PcServiceDao pcServiceDao) {
        this.pcServiceDao = pcServiceDao;
    }

    @Override
    public DataResult<List<PcService>> getAll() {
        return new SuccessDataResult<List<PcService>>(this.pcServiceDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(PcService pcService) {
        this.pcServiceDao.save(pcService);
        return new SuccessResult("Veri eklendi.");
    }

    @Override
    public DataResult<List<PcService>> getAllServiceFinishedComputerList() {
        return new SuccessDataResult<List<PcService>>(this.pcServiceDao.getAllServiceFinishedComputerList());
    }
}
