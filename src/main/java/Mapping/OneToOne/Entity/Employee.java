package Mapping.OneToOne.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emp_details")
public class Employee {

    @Id
    @SequenceGenerator(name = "emp_id_seq", sequenceName = "emp_id_seq", initialValue = 1000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_seq")
    private int emp_id;

    private String empName;
    private String gender;

    @OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "address_id")
    Address address;

}


// @Id
//// Marks emp_id as the primary key

//@SequenceGenerator(
//    name = "emp_id_seq",              // Name used by Hibernate to identify this generator
//    sequenceName = "emp_id_seq",      // Actual database sequence name
//    initialValue = 1000               // Sequence starts generating IDs from 1000
//)


//@GeneratedValue(
//    strategy = GenerationType.SEQUENCE, // Generate ID using a database sequence
//    generator = "emp_id_seq"            // Use the sequence generator defined above
//)
//
//private int emp_id;                    // Employee ID generated automatically


// @GeneratedValue(
//    strategy = GenerationType.SEQUENCE,
//    generator = "emp_id_seq"
//)
// you are telling Hibernate:
//"Use the sequence generator that I have defined, instead of choosing another generator."

// The work of generator is very simple:
//generator tells Hibernate which ID generator to use for generating the primary key.


// @OneToOne(cascade = CascadeType.ALL)
//private Address address;
//Cascade allows operations performed on one entity to be propagated to its associated entity.
// For example, when an Employee is saved, its associated Address can also be saved.