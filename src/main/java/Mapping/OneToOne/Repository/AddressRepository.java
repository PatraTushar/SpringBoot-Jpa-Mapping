package Mapping.OneToOne.Repository;

import Mapping.OneToOne.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {



}
