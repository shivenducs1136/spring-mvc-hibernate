package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService theEmployeeService){
		employeeService = theEmployeeService;
	}
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> theEmployees = employeeService.findAll();
		theModel.addAttribute("employees", theEmployees);
		return "employees/list-employees";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForAdd(@RequestParam("employeeId") int theId,Model theModel){

		// get the employee from the service
		Employee dbEmployee = employeeService.findById(theId);

		// set employee in the model to prepopulate the form

		theModel.addAttribute("employee",dbEmployee);

		// send over to our form
		return "employees/employee-form";
	}
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int theId){

		employeeService.deleteById(theId);

		return "redirect:/employees/list";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		// create model attribute to bind form data
		Employee theEmployee = new Employee();

		theModel.addAttribute("employee",theEmployee);

		return "employees/employee-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
		// save the employee
		employeeService.save(theEmployee);
		// use a redirect to prevent duplicate submission
		return "redirect:/employees/list";
	}


}









