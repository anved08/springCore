package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap =new ClassPathXmlApplicationContext("com/spring/ref/configAB.xml");
		TestA A=(TestA) ap.getBean("aref");
		System.out.println(A.getX());
		System.out.println(A.getOb().getY());
		
		System.out.println(A);
	}

}
