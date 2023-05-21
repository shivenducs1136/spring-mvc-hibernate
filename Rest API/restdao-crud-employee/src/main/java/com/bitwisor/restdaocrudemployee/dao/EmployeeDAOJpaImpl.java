package com.bitwisor.restdaocrudemployee.dao;

import com.bitwisor.restdaocrudemployee.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDao{


    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee",Employee.class);
        // execute and return the result
        return theQuery.getResultList();
    }

    @Override
    public Employee findById(Integer id) {
        Employee theEmployee = entityManager.find(Employee.class,id);
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee newEmployee = entityManager.merge(theEmployee);
        return newEmployee;
    }

    @Override
    public void deleteById(Integer id) {
        Employee dbEmployee = entityManager.find(Employee.class,id);
        entityManager.remove(dbEmployee);
    }
}
