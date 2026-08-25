package Mapping.OneToMany.Repository;

import Mapping.OneToMany.Entity.UserDetails;
import Mapping.OneToOne.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails,Integer> {


}
