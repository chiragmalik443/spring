package com.brainmentors.apps.autowire;

public class C {
	private int x;
	public C() {
		System.out.println("C Cons Call");
	}
	
public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

void print()
{
	System.out.println("C print "+x);
}
}
