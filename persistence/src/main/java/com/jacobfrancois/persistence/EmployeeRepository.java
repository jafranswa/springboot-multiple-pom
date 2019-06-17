package com.jacobfrancois.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import com.jacobfrancois.domain.Employee;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
