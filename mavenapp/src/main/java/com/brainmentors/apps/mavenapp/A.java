package com.brainmentors.apps.mavenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Caller Class
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new 
				ClassPathXmlApplicationContext("spring.xml");
		B b = (B)ac.getBean("b");
		b.print();
		

	}

}
