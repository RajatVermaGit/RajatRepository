package com.kotak.loans.carloan;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		//c.m1();
		c.m2();
		c.m3();


	}

	@Override
	public void m2() {
		System.out.println("I am m2 overridden method in child class");
		
	}

	@Override
	public void m3() {
      System.out.println("I am m3 overridden method in child class");
		
	}

}
