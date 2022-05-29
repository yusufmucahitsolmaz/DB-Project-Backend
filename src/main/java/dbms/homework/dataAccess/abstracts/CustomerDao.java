package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
