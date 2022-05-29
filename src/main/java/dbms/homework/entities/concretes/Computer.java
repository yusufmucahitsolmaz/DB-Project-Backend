package dbms.homework.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "computer")
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computer_id")
    private int computerId;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "type_of_pc")
    private String typeOfPc;

    @Column(name = "serial_number")
    private String serialNumber;

   /*@ManyToOne()
   private Customer customer;*/

   @OneToMany(mappedBy = "computer")
   private List<PcService> pcServices;


}
