package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.TypeOfService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfServiceDao extends JpaRepository<TypeOfService,Integer> {
}
