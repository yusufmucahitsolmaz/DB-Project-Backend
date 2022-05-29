package dbms.homework.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pc_service")
public class PcService {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private int serviceId;

    @Column(name = "is_service_finished")
    private boolean isServiceFinished;

    @Column(name = "is_computer_recieved")
    private boolean isComputerRecieved;

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "tackingback_date")
    private Date tackingbackDate;

    /*@JsonIgnore
    @OneToMany(mappedBy = "pc_service")
    private List<TypeOfService> typeOfServices;*/

    /*@ManyToMany(mappedBy = "pc_service", cascade = { CascadeType.ALL })
    private Set<Employee> employees = new HashSet<Employee>();*/

    @ManyToOne()
    @JoinColumn(name = "computer_id")
    private Computer computer;



}
