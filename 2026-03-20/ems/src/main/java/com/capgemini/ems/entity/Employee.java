package com.capgemini.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String phone;
    private String gender;
    private String designation;
    private double salary;
    private String dateOfJoining;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}