package com.cogknit.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cogknit.Model.Employee;
@Component
public class queries {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public void insert(Employee employee) {
		String query ="insert into employee values(?,?,?,?,?)";
		jdbc.update(query,  new Object[] {employee.getId(),employee.getAge(),employee.getEmail(),employee.getName(),employee.getPhone()});
		
	}
	
	public void update(Employee employee) {
		System.out.println("inside mysql update");
		String query="update employee set age=? where id=?";
		int status=jdbc.update(query,new Object[] {employee.getAge(),employee.getId()});
		if(status !=0 )
			System.out.println(" updated");
		else
			System.out.println(" not updated");
	}
	
	public void delete(Employee employee) {
		System.out.println("inside mysql delete");
		String query="delete from employee where id=?";
		int status=jdbc.update(query,employee.getId());
		if(status!=0)
			System.out.println(" deleted");
		else
			System.out.println(" not delted");
	}
	
	public void patch(Employee employee) {
		System.out.println("it is inside patch");
		String query="update employee set id=? where age=?";
		int status=jdbc.update(query,new Object[] {employee.getId(),employee.getAge()});
		if(status !=0 )
			System.out.println(" updated");
		else
			System.out.println(" not updated");
	}
}
