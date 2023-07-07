package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/collections/configEmp.xml");
		Emp emp1=(Emp) context.getBean("Emp1");
		
		System.out.println(emp1.getName().toString());
		System.out.println(emp1.getCourses().toString());
		System.out.println(emp1.getAddress().toString());
		System.out.println(emp1.getPhones().toString());
		
	}

}
