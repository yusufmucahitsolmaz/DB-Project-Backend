package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.PcService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PcServiceDao extends JpaRepository<PcService,Integer> {



    @Query("From PcService where isServiceFinished = true")
    List<PcService> getAllServiceFinishedComputerList();




}
