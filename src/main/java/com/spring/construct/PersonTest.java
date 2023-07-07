package com.spring.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/construct/configCon.xml");
		
		Person p=(Person) context.getBean("Person");
		System.out.println(p);
	}

}
