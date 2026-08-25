package Mapping.ManyToOne.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "department_details")
public class Department {

    @Id
    private int deptId;

    private String deptName;





}


