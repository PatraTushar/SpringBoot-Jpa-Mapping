package Mapping.ManyToOne.Repository;

import Mapping.ManyToOne.Entity.Department;
import Mapping.ManyToOne.Entity.Employee;
import Mapping.OneToMany.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
