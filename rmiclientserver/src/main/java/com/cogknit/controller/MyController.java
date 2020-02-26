package com.cogknit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogknit.Model.Student;
import com.cogknit.dao.AddInfo;
import com.cogknit.service.MyService;
import com.cogknit.service.TestInterface;

@RestController
public class MyController {

	@Autowired
	private AddInfo myserivce;

	@Autowired
	@Qualifier(value="student")
	private TestInterface ti;

	@PostMapping("/addemployee")
	public void insertAllEmployee(@RequestBody Student employee) {

		System.out.println("inserted employee");
		myserivce.Add(employee);

	}

	@GetMapping("/getemployee")
	public void getEmployee() {

		System.out.println("get employee");
		System.out.println(ti.testMethod());

	}

}
