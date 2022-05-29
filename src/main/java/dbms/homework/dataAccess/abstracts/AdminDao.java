package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,Integer> {
}
