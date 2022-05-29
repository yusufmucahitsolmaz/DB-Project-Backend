package dbms.homework.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee extends Person{

    @Column(name = "employee_username")
    private String employeeUserName;

    @Column(name = "employee_password")
    private String employeePassword;


    @ManyToMany(cascade = {
            CascadeType.ALL
    })
    @JoinTable(
            name = "employee_pcservice_mm",
            joinColumns = {
                    @JoinColumn(name = "employee_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "pcservice_id")
            }
    )
    Set< PcService > pcServiceSet = new HashSet< PcService >();

  /*  @JoinTable(
            name = "employee_computer_mm",
            joinColumns = {
                    @JoinColumn(name = "employee_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "computer_id")
            }
    )
    Set <Computer> computerSet = new HashSet<Computer>();*/
}
