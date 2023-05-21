package com.bitwisor.restdaocrudemployee.service;

import com.bitwisor.restdaocrudemployee.dao.EmployeeRepository;
import com.bitwisor.restdaocrudemployee.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee theEmployee = null;
        if(result.isPresent()){
            theEmployee= result.get();
        }
        else {
            // we didn't find the employee
            throw  new RuntimeException("Did not find employee id - "+ id);
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(Integer id) {
         employeeRepository.deleteById(id);
    }


}
