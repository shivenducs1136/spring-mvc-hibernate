package com.bitwisor.cruddemo.dao;

import com.bitwisor.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{

    // define field for entity manager
    private EntityManager entityManager;
    // inject entity manager using constructor injection
    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student ORDER BY lastName desc",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findStudentByLastName(String lstName) {

        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "FROM Student WHERE lastName=:any",
                Student.class);
        // set query parameters
        theQuery.setParameter("any",lstName);
        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student theStudent = findById(id);
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numberOfRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numberOfRowsDeleted;
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }


}








