package dbms.homework.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","computers"})
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "customer_password")
    private String customerPassword;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_lastname")
    private String customerLastName;


    /*@OneToMany(mappedBy = "customer")
    private List<Computer> computers;*/

    @OneToMany(mappedBy = "customer")
    private List<Computer> computers;





}
