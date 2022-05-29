package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
