package com.cogknit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cogknit.DAO.queries;
import com.cogknit.Model.Employee;


@RestController
public class EmployeeController {

	@Autowired
	private queries queryDemo;

@PostMapping(value = "/insertemployee")
public void insertAllEmployee(@RequestBody Employee employee) {
		
		  System.out.println("inserted employee"); 
		  queryDemo.insert(employee);
	
		  }

@PutMapping(value = "/updateemployee")
public void updateEmployee(@RequestBody Employee employee) {
		System.out.println("update employee");
		queryDemo.update(employee);
	}
@DeleteMapping(value = "/deleteemployee")
public void DeleteEmployee(@RequestBody Employee employee) {
	System.out.println("Deleted");
	queryDemo.delete(employee);
}
@PatchMapping(value="/patchemployee")
public void patchEmployee(@RequestBody Employee employee) {
	System.out.println("patched");
	queryDemo.patch(employee);
}

	
}
