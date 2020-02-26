package com.cogknit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee implements TestInterface{

	@Override
	public String testMethod() {
		String str="i am from Employee class";
		return str;
	}

}
