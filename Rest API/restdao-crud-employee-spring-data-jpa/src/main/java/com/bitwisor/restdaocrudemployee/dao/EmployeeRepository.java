package com.bitwisor.restdaocrudemployee.dao;

import com.bitwisor.restdaocrudemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    // no need to write any code for crud methods
    // no need to write any implementation
}
