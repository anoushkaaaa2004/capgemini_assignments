package com.capgemini.ems.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;

    @OneToOne
    private Employee employee;
}