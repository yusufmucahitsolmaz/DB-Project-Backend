package dbms.homework.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "type_of_service")
public class TypeOfService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_of_service_id")
    private int typeOfServiceId;

    @Column(name = "type_of_service_name")
    private String typeOfServiceName;

    @Column(name = "type_of_service_price")
    private String typeOfServicePrice;

    @ManyToOne()
    @JoinColumn(name = "service_id")
    private PcService pcService;

}
