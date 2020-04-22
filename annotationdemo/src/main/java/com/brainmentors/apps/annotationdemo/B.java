package com.brainmentors.apps.annotationdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
//@Component("b")
@Scope("prototype")
public class B {
	private int x;
	
	@PostConstruct
	public void start() {
		System.out.println("B Start");
	}
	@PreDestroy
	public void end() {
		System.out.println("B End");
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	void show() {
		System.out.println("B Show "+x);
	}

}
