package com.jacobfrancois.web;

import com.jacobfrancois.domain.Employee;
import com.jacobfrancois.persistence.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees(){
        List<Employee> Employees = this.employeeRepository.findAll();

        return Employees;
    }

}
