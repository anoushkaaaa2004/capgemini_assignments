package com.capgemini.ems.service;

import com.capgemini.ems.dto.EmployeeDTO;
import com.capgemini.ems.entity.Employee;

import java.util.List;

public interface EmployeeService {

    String saveEmployee(EmployeeDTO employeeDTO);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    String updateEmployee(EmployeeDTO employeeDTO, int id);

    String deleteEmployee(int id);
}