package Mapping.ManyToMany.Repository;

import Mapping.ManyToMany.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
