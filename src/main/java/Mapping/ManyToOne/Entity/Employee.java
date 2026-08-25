package Mapping.ManyToOne.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_details")
public class Employee {


    @Id
    private int empId;

    private String name;
    private String gender;


    @ManyToOne
    Department department;


}
