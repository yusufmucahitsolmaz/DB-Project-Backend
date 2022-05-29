package dbms.homework.dataAccess.abstracts;

import dbms.homework.entities.concretes.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ComputerDao extends JpaRepository<Computer,Integer> {

    Computer getByModelName(String computerModelName);

    Computer getByModelNameAndComputerId(String computerModelName,int computerId);

    List<Computer> getByModelNameOrComputerId(String computerModelName, int computerId);

    List<Computer> getByModelNameContains(String computerModelName);


}
