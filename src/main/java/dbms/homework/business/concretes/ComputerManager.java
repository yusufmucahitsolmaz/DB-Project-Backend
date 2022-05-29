package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.ComputerService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.ComputerDao;
import dbms.homework.entities.concretes.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerManager implements ComputerService {

   private ComputerDao computerDao;

   @Autowired
    public ComputerManager(ComputerDao computerDao) {
        this.computerDao = computerDao;
    }

    @Override
    public DataResult<List<Computer>> getAll() {
        return new SuccessDataResult<List<Computer>>(this.computerDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(Computer computer) {
       this.computerDao.save(computer);
       return new SuccessResult("Veri eklendi.");
    }

    @Override
    public DataResult<Computer> getByModelName(String computerModelName) {
        return new SuccessDataResult<Computer>(this.computerDao.getByModelName(computerModelName),"Veri Bulundu!");
    }

    @Override
    public DataResult<Computer> getByModelNameAndComputerId(String computerModelName, int computerId) {
        return new SuccessDataResult<Computer>(this.computerDao.getByModelNameAndComputerId(computerModelName,computerId),"Veri Bulundu!");
    }

    @Override
    public DataResult<List<Computer>> getByModelNameOrComputerId(String computerModelName, int computerId) {
        return new SuccessDataResult<List<Computer>>(this.computerDao.getByModelNameOrComputerId(computerModelName,computerId),"Veri Bulundu!");
    }

    @Override
    public DataResult<List<Computer>> getByModelNameContains(String computerModelName) {
        return new SuccessDataResult<List<Computer>>(this.computerDao.getByModelNameContains(computerModelName),"Veri Bulundu!");
    }

    @Override
    public DataResult<List<Computer>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
       return new SuccessDataResult<>(this.computerDao.findAll(pageable).getContent());
    }
}
