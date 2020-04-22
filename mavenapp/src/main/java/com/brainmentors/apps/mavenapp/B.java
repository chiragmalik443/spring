package com.brainmentors.apps.mavenapp;

import java.util.List;

public class B {
	// multi object
	private List<C> clist;
	
	
	public List<C> getClist() {
		return clist;
	}
	public void setClist(List<C> clist) {
		this.clist = clist;
	}
	// single object
	//private IC obj; // by type check obj in spring.xml (id)
	public B() {
		System.out.println("B Cons call");
	}
	// constructor (Pass object)
//	public B(IC obj) {
//		this.obj = obj;
//	}
//
//	public IC getObj() {
//		return obj;
//	}
//
//	public void setObj(IC obj) {
//		this.obj = obj;
//	}
	void print() {
		System.out.println("Inside B Print");
		for(C obj : clist) {
			obj.show();
		}
		//obj.show();
	}

}
