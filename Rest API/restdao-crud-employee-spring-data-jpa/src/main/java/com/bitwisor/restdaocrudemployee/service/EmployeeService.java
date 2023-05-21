package com.bitwisor.restdaocrudemployee.service;

import com.bitwisor.restdaocrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee theEmployee);

    void deleteById(Integer id);
}
