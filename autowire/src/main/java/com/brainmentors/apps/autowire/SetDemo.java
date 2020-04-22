package com.brainmentors.apps.autowire;

import java.util.HashSet;
import java.util.Set;

class Emp{
	int id;
	String name;
	Emp(int id , String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "\n]";
	}
	@Override
	public int hashCode() {
		return name.length();
	}
	
	public boolean equals(Object object) {
		if(this== object) {
			return true;
		}
		if(object instanceof Emp) {
			Emp e = (Emp) object; // downcasting
			if(this.id== e.id && this.name.equals(e.name)) {
				return true;
			}
				
		}
		return false;
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		Object obj;
		
		Set<String> songs = new HashSet<>();
		songs.add(new String("It's my life"));
		songs.add(new String("It's my life"));
		songs.add(new String("Bang Bang"));
		songs.add(new String("Bang Bang"));
		System.out.println(songs);
		Set<Emp> emps = new HashSet<>();
		Emp e = new Emp(1001, "ram");
		System.out.println(e.hashCode());
		emps.add(e);
		Emp e2 = new Emp(1001, "ram");
		System.out.println(e2.hashCode());
		emps.add(e2);
		Emp e3 = new Emp(1002, "shyam");
		System.out.println(e3.hashCode());
		emps.add(e3);
		emps.add(new Emp(1002, "shyam"));
		System.out.println(emps);
		
		

	}

}
