package com.tuandoan.springmvcdemo.controller;

import com.tuandoan.springmvcdemo.entity.Employee;
import com.tuandoan.springmvcdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		List<Employee> employees = employeeService.findAll();

		theModel.addAttribute("employees", employees);
		return "list-employees";
	}
}








