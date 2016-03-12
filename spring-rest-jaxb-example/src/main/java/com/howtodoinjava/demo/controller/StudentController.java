package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howtodoinjava.demo.model.Student;
import com.howtodoinjava.demo.model.StudentList;

@Controller
public class StudentController {
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
	
	@RequestMapping("/student")
	public @ResponseBody Student getStudent() {
		return new Student(23, "Meghna", "Naidu", "meghna@gmail.com","8978767878");
	}

	@RequestMapping("/studentlist")
	public @ResponseBody StudentList getStudentList() {
		LOGGER.debug("Get the List of Student");
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(3, "Robert", "Parera", "robert@gmail.com","8978767878"));
		studentList.add(new Student(93, "Andrew", "Strauss","andrew@gmail.com", "8978767878"));
		studentList.add(new Student(239, "Eddy", "Knight", "knight@gmail.com","7978767878"));

		return new StudentList(studentList);
	}
}
