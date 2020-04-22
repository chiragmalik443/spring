package com.brainmentors.customers;

public class Producer implements IProducer {
	@Override
	public void first() {
		System.out.println("First ");
		second(100);
	}
	public void second(int x) {
		System.out.println("Second ");
	}

}
