package dbms.homework.business.concretes;

import dbms.homework.business.abstracts.AdminService;
import dbms.homework.core.utilities.result.DataResult;
import dbms.homework.core.utilities.result.Result;
import dbms.homework.core.utilities.result.SuccessDataResult;
import dbms.homework.core.utilities.result.SuccessResult;
import dbms.homework.dataAccess.abstracts.AdminDao;
import dbms.homework.entities.concretes.Admin;
import dbms.homework.entities.concretes.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminManager implements AdminService {

    private AdminDao adminDao;

    @Autowired
    public AdminManager(AdminDao adminDao) {
        this.adminDao = adminDao;
    }


    @Override
    public DataResult<List<Admin>> getAll() {
        return new SuccessDataResult<List<Admin>>(this.adminDao.findAll(),"Veri Bulundu!");
    }

    @Override
    public Result add(Admin admin) {
        this.adminDao.save(admin);
        return new SuccessResult("Veri eklendi.");
    }
}
