package com.bitwisor.restdaocrudemployee.dao;

import com.bitwisor.restdaocrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(Integer id);

    Employee save(Employee theEmployee);

    void deleteById(Integer id);
}
