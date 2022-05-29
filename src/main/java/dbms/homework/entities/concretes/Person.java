package dbms.homework.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;

    @Column(name = "person_phone")
    private String personPhone;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "person_lastname")
    private String personLastName;

    public Person(int personId, String personPhone, String personName, String personLastName) {
        this.personId = personId;
        this.personPhone = personPhone;
        this.personName = personName;
        this.personLastName = personLastName;
    }

    public Person() {
    }
}
