package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Integer> {
}
