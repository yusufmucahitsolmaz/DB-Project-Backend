package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.PcService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PcServiceDao extends JpaRepository<PcService,Integer> {
}
