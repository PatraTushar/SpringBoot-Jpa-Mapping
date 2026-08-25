package Mapping.ManyToOne.Service;


import Mapping.ManyToOne.Entity.Department;
import Mapping.ManyToOne.Entity.Employee;
import Mapping.ManyToOne.Repository.DepartmentRepository;
import Mapping.ManyToOne.Repository.EmployeeRepository;
import Mapping.OneToMany.Entity.Address;
import Mapping.OneToMany.Entity.UserDetails;
import Mapping.OneToMany.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeManagement {


    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;


    public void addEmployee() {

        Department dept1 = new Department(1, "HR");
        departmentRepository.save(dept1);


        Employee emp1 = new Employee(101, "DILIP", "MALE", dept1);
        employeeRepository.save(emp1);

        Employee emp2 = new Employee(102, "RAJESH", "MALE", dept1);
        employeeRepository.save(emp2);



        Department dept2 = new Department(2, "DEVELOPMENT");
        departmentRepository.save(dept2);

        Employee emp3 = new Employee(103, "SNEHA", "FEMALE", dept2);
        employeeRepository.save(emp3);





    }

}
