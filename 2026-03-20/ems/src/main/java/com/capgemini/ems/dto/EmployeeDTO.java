package com.capgemini.ems.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotBlank(message = "Enter name")
    private String name;

    @NotBlank(message = "Enter email")
    @Email(message = "Enter valid email")
    private String email;

    private String phone;
    private String gender;
    private String designation;
    private double salary;
    private String dateOfJoining;

    private AddressDTO address;
}