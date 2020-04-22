package com.brain.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext ac = new FileSystemXmlApplicationContext("spring.xml");
//		DAO dao = (DAO)ac.getBean("dao");
//		DAO dao2 = (DAO)ac.getBean("dao2");
//		dao.create();
//		dao.read();
		
		Student student = (Student) ac.getBean("studentobj");
		System.out.println(student);
	}

}
