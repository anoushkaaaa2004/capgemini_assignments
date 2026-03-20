package com.capgemini.ems.controller;

import com.capgemini.ems.dto.EmployeeDTO;
import com.capgemini.ems.entity.Employee;
import com.capgemini.ems.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/save")
    public String save(@RequestBody @Valid EmployeeDTO dto) {
        return service.saveEmployee(dto);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public String update(@RequestBody EmployeeDTO dto, @PathVariable int id) {
        return service.updateEmployee(dto, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}