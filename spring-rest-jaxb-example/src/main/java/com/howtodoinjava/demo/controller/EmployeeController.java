package com.howtodoinjava.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;
import com.howtodoinjava.demo.model.EmployeeList;


@RestController
public class EmployeeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@RequestMapping(value="/employees")
	public @ResponseBody EmployeeList getAllEmployees(){
		EmployeeList employeeList = new EmployeeList();
		
		Employee empOne = new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        Employee empTwo = new Employee(2,"Amit","Singhal","asinghal@yahoo.com");
        Employee empThree = new Employee(3,"Kirti","Mishra","kmishra@gmail.com");
        
        employeeList.getEmployees().add(empOne);
        employeeList.getEmployees().add(empTwo);
        employeeList.getEmployees().add(empThree);
        
        return employeeList;
	}
	
	
	@RequestMapping(value = "/employees/{id}")
	@ResponseBody
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id){
		LOGGER.debug("ID : "+ id);
		if(id < 3){
			Employee employee = new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
}
