package com.brainmentors.apps.autowire;

import java.util.List;
import java.util.Set;

public class A {
	//private B b;
	private B b1; // single object injection 
	//private C c;
	private Set<C> clist; // collection injection
	
	
	
//public B getB() {
//		return b;
//	}
//
//	public void setB(B b) {
//		this.b = b;
//	}

//	public List<C> getClist() {
//		return clist;
//	}
//
//	public void setClist(List<C> clist) {
//		this.clist = clist;
//	}

	
	public B getB1() {
		return b1;
	}

	public Set<C> getClist() {
		return clist;
	}

	public void setClist(Set<C> clist) {
		this.clist = clist;
	}

	public void setB1(B b1) {
		this.b1 = b1;
	}

//	public C getC() {
//		return c;
//	}
//
//	public void setC(C c) {
//		this.c = c;
//	}

void display()
{
	System.out.println("A  display");
	//b.show();
	b1.show();
	for(C c : clist) {
		c.print();
	}
	//c.print();
}
}
