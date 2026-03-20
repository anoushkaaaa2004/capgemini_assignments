package com.capgemini.ems.service;

import com.capgemini.ems.dto.AddressDTO;
import com.capgemini.ems.dto.EmployeeDTO;
import com.capgemini.ems.entity.Address;
import com.capgemini.ems.entity.Employee;
import com.capgemini.ems.exception.EmployeeNotFoundException;
import com.capgemini.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String saveEmployee(EmployeeDTO dto) {

        Employee employee = Employee.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .gender(dto.getGender())
                .designation(dto.getDesignation())
                .salary(dto.getSalary())
                .dateOfJoining(dto.getDateOfJoining())
                .build();

        AddressDTO addressDTO = dto.getAddress();

        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setCity(addressDTO.getCity());
        address.setState(addressDTO.getState());
        address.setCountry(addressDTO.getCountry());
        address.setPincode(addressDTO.getPincode());

        address.setEmployee(employee);
        employee.setAddress(address);

        employeeRepository.save(employee);

        return "Employee saved successfully";
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> emp = employeeRepository.findById(id);
        if (emp.isPresent()) return emp.get();
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public String updateEmployee(EmployeeDTO dto, int id) {
        Employee emp = getEmployeeById(id);

        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setPhone(dto.getPhone());
        emp.setGender(dto.getGender());
        emp.setDesignation(dto.getDesignation());
        emp.setSalary(dto.getSalary());
        emp.setDateOfJoining(dto.getDateOfJoining());

        Address address = emp.getAddress();
        address.setStreet(dto.getAddress().getStreet());
        address.setCity(dto.getAddress().getCity());
        address.setState(dto.getAddress().getState());
        address.setCountry(dto.getAddress().getCountry());
        address.setPincode(dto.getAddress().getPincode());

        employeeRepository.save(emp);

        return "Employee updated successfully";
    }

    @Override
    public String deleteEmployee(int id) {
        Employee emp = getEmployeeById(id);
        employeeRepository.delete(emp);
        return "Employee deleted successfully";
    }
}