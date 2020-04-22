package com.brain.apps;

public class OracleDAO implements DAO {
	int x ;
	public OracleDAO() {
		System.out.println("Oracle Default Cons Call");
	}
	public OracleDAO(int x) {
		this.x = x;
		System.out.println("I am Param Cons Call");
	}
	public OracleDAO(String y, int z) {
		
		System.out.println("I am 2 Param Cons Call "+y+" "+z);
	}
	@Override
	public void create() {
		System.out.println("Oracle DAO Create X is "+x);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		System.out.println("Oracle DAO Read");
		// TODO Auto-generated method stub
		
	}

}
