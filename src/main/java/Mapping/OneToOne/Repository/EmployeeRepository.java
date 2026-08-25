package Mapping.OneToOne.Repository;

import Mapping.OneToOne.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
