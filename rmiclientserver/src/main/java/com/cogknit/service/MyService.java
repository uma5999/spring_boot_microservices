package com.cogknit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cogknit.Model.Student;
import com.cogknit.dao.AddInfo;

@Component
public class MyService implements AddInfo {
	
@Autowired	
private JdbcTemplate jtemp;

public void Add(Student student) {
String query ="insert into student values(?,?,?)";
jtemp.update(query,  new Object[] {student.getId(),student.getName(),student.getPhone()});
}

		
	
	
	
}
