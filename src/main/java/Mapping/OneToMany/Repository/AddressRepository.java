package Mapping.OneToMany.Repository;

import Mapping.OneToMany.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {



}
