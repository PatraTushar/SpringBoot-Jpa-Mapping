package Mapping.ManyToMany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMPLOYER_DETAILS")
public class Employee {


    @Id
    private int empId;

    private String name;
    private String gender;

    @ManyToMany
    @JoinTable(name = "employee_roles", joinColumns = @JoinColumn(name = "empId"), inverseJoinColumns = @JoinColumn(name = "roleId"))
    List<Roles> roles;


}
