package com.jacobfrancois.persistence;

import com.jacobfrancois.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner{

    private EmployeeRepository employeeRepository;

    @Autowired
    public DbSeeder(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee kyle = new Employee("Kyle", "Mr Mann", 2, true);
        Employee jacob = new Employee("Jacob", "Francois", 2, true);
        Employee ann = new Employee("Ann", "Ann", 2,true);
        Employee brian = new Employee("Brian", "Max", 2, true);
        Employee jeremiah = new Employee("Jeremiah", "JD", 2, true);

        List<Employee> employees = new ArrayList<>();
        employees.add(kyle);
        employees.add(jacob);
        employees.add(ann);
        employees.add(brian);
        employees.add(jeremiah);

        this.employeeRepository.saveAll(employees);
    }

}
