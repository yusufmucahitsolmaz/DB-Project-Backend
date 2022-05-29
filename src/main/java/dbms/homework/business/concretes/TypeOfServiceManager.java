package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.TypeOfServiceService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.TypeOfServiceDao;
import dbms.homework.entities.concretes.Computer;
import dbms.homework.entities.concretes.TypeOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfServiceManager implements TypeOfServiceService {

    private TypeOfServiceDao typeOfServiceDao;

    @Autowired
    public TypeOfServiceManager(TypeOfServiceDao typeOfServiceDao) {
        this.typeOfServiceDao = typeOfServiceDao;
    }

    @Override
    public DataResult<List<TypeOfService>> getAll() {
        return new SuccessDataResult<List<TypeOfService>>(this.typeOfServiceDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(TypeOfService typeOfService) {
        this.typeOfServiceDao.save(typeOfService);
        return new SuccessResult("Veri eklendi.");
    }
}
