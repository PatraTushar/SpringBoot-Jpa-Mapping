package Mapping.ManyToMany.Service;


import Mapping.ManyToMany.Entity.Employee;
import Mapping.ManyToMany.Entity.Roles;
import Mapping.ManyToMany.Repository.EmployeeRepository;
import Mapping.ManyToMany.Repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeManagement {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RolesRepository rolesRepository;


    public void addEmployee() {

        Roles role1 = new Roles(1, "DEVELOPMENT");
        Roles role2 = new Roles(2, "LEAD");
        Roles role3 = new Roles(3, "PANEL");

        rolesRepository.save(role1);
        rolesRepository.save(role2);
        rolesRepository.save(role3);

        Employee emp1 = new Employee(2, "SHWETA", "FEMALE", List.of(role1, role2, role3));
        employeeRepository.save(emp1);


    }

}
