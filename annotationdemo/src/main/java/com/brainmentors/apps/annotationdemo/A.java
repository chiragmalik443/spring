package com.brainmentors.apps.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Autowired
	private B b;

	public B getB() {
		return b;
	}

	void fillX(int x){
		b.setX(x);
	}
	public void setB(B b) {
		//b.setX(1000);
		this.b = b;
	}
	

}
