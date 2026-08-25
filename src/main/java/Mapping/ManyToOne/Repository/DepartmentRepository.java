package Mapping.ManyToOne.Repository;

import Mapping.ManyToOne.Entity.Department;
import Mapping.OneToMany.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {


}
