package Mapping.OneToMany.Service;


import Mapping.OneToMany.Entity.Address;
import Mapping.OneToMany.Entity.UserDetails;
import Mapping.OneToMany.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserOperations {


    @Autowired
    UserRepository userRepository;

    // ADDING USER

    public void addUser() {

        System.out.println(" Adding User Information ");

        UserDetails user1 = new UserDetails();
        user1.setUser_id(102);
        user1.setUserName("SHWETA");
        user1.setGender("FEMALE");


        // ADDRESS
        Address address1 = new Address("CHENNAI", 502345, "INDIA");
        Address address2 = new Address("RAJASTHAN", 345231, "INDIA");


        user1.setAddress(List.of(address1, address2));


        userRepository.save(user1);


    }


    // READ/LOAD

    public void getUserData(int userID){

      UserDetails userDetails=  userRepository.findById(userID).get();
        System.out.println(userDetails);
    }







}
