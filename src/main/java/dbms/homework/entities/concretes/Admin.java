package dbms.homework.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "admin")
public class Admin extends Person{

    @Column(name = "admin_username")
    private String adminUserName;

    @Column(name = "admin_password")
    private String adminPassword;

    public Admin(int personId, String personPhone, String personName, String personLastName, String adminUserName, String adminPassword) {
        super(personId, personPhone, personName, personLastName);
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
    }

    public Admin() {
    }
}
