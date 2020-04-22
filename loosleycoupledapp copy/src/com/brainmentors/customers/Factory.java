package com.brainmentors.customers;

import java.util.ResourceBundle;

public class Factory {
	private static ResourceBundle rb = ResourceBundle.
			getBundle("config");
	private Factory() {}
	static IProducer getObject() {
		Object object = null;
		String className = rb.getString("classname");
		try {
		object = Class.forName(className).getDeclaredConstructor()
		.newInstance();
		}catch(Exception e) {
			
		}
//		IProducer p = new Producer();
//		return p;
		return (IProducer)object;
	}
}
