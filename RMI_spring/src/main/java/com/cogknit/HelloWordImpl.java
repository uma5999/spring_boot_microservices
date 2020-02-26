package com.cogknit;

import java.util.Date;

public class HelloWordImpl implements HelloWorld {

	public String sayHelloWithHessain(String msg) {
		System.out.println("========server side============");
		System.out.println("msg is::"+msg);
		
		return "Hello"+msg+"response time is"+new Date();
	}

}
