package com.mybootjpa.mybootjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mybootjpa.mybootjpa.dao.StudentRepo;
import com.mybootjpa.mybootjpa.model.Student;
@Controller
public class StudentController {
	@Autowired
	StudentRepo repo;
	@RequestMapping("/")
	public String show() {
		return "home.jsp";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		return "home.jsp";
	}
	
}
