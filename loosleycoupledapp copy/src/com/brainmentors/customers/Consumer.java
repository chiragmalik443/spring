package com.brainmentors.customers;

public class Consumer {

	public static void main(String[] args) {
		//IProducer p = new FasterProducer(); // Upcasting
		IProducer p  = Factory.getObject();
		p.first();
		//p.second(999);

	}

}
