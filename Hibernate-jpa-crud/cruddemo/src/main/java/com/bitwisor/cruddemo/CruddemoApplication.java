package com.bitwisor.cruddemo;

import com.bitwisor.cruddemo.dao.StudentDao;
import com.bitwisor.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return runner->{
//			createStudent(studentDao);
			createMultipleStudents(studentDao);
//			getStudentById(3,studentDao);
//			queryForStudents(studentDao);
//			queryForStudentByLastName(studentDao,"Baliyan");
//			updateStudentById(studentDao,1);
//			deleteStuent(1,studentDao);
//			deleteAll(studentDao);
		};
	}

	private void deleteAll(StudentDao studentDao) {
		System.out.println("Number of Students deleted : " + studentDao.deleteAll());
	}

	private void deleteStuent(int i, StudentDao studentDao) {
		studentDao.delete(i);
		System.out.println("Deleted id: "+ i);
	}

	private void updateStudentById(StudentDao studentDao, Integer i) {
		Student mStudent = getStudentById(i,studentDao);
		mStudent.setFirstName("Shanky");
		studentDao.update(mStudent);
		getStudentById(i,studentDao);
	}

	private void queryForStudentByLastName(StudentDao studentDao, String lstName) {
		List<Student> theStudent = studentDao.findStudentByLastName(lstName);
		for (Student tmpStudent: theStudent){
			System.out.println(tmpStudent);
		}
	}

	private void queryForStudents(StudentDao studentDao) {
		List<Student> theStudent = studentDao.findAll();
		for (Student tmpStudent: theStudent){
			System.out.println(tmpStudent);
		}
	}

	private Student getStudentById(Integer i, StudentDao studentDao) {
		// get a list of students
		Student myStudent = studentDao.findById(i);

		// display list of students
		System.out.println(myStudent.toString());
		return myStudent;
	}

	private void createMultipleStudents(StudentDao studentDao) {
		// create multiple students
		System.out.println("Creating 3 student objects...");
		Student myStudent1 = new Student("Yashasvi","Baliyan","yashasvibaliayan11@gmail.com");
		Student myStudent2 = new Student("Mary","Public","mary1@gmail.com");
		Student myStudent3 = new Student("Bonita","Applebum","bornvita@gmail.com");

		System.out.println("Saving the studnets...");
		// save the student objects
		studentDao.save(myStudent1);
		studentDao.save(myStudent2);
		studentDao.save(myStudent3);

	}

	private void createStudent(StudentDao studentDao) {
		// create the student object
		Student myStudent = new Student("Shivendu","Mishra","shivenduaps986@gmail.com");
		// save the studnet object
		System.out.println("Saving the student...");
		studentDao.save(myStudent);
		// display id of the saved student
		System.out.println("Saved student generated id: "+ myStudent.getId());

	}


}
