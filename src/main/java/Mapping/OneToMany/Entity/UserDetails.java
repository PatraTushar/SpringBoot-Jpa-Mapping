package Mapping.OneToMany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    private int user_id;

    private String userName;
    private String gender;


    // fetch = FetchType.EAGER means:
    //When Hibernate fetches the UserDetails, it also fetches the associated Address records immediately.
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Address> address;



}


