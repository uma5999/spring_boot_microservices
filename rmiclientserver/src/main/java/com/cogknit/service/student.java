package com.cogknit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("student")
public class student implements TestInterface{

	@Override
	public String testMethod() {
		String ref="Hi i am from student class ";
		return ref;
	}

	
}
