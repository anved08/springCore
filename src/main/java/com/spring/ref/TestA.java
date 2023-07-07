package com.spring.ref;

public class TestA {
	private int x;
	private TestB ob;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public TestB getOb() {
		return ob;
	}
	public void setOb(TestB ob) {
		this.ob = ob;
	}
	public TestA(int x, TestB ob) {
		super();
		this.x = x;
		this.ob = ob;
	}
	public TestA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TestA [x=" + x + ", ob=" + ob + "]";
	}
	
}
