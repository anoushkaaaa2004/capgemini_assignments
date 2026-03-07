package com.capgemini.spring_assignment;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private Department department;

    public Employee() {
        super();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public String toString()
    {
      return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
          + ", departmentId=" + department.getDepartmentId() + ", departmentName=" + department.getDepartmentName() + "]";
    
    }
}