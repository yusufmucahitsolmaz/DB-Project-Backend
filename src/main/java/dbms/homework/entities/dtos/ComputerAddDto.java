package dbms.homework.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerAddDto {


    private String modelName;
    private String manufacturerName;
    private String typeOfPc;
    private String serialNumber;
    private int customerId;
}
