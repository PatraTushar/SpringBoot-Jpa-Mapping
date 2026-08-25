package Mapping.OneToMany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address_details")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    private String city;
    private int pinCode;
    private String country;

    public Address(String city, int pinCode, String country) {

        this.city = city;
        this.pinCode = pinCode;
        this.country = country;
    }
}
