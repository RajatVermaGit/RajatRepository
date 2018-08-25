package com.kotak.loans.carloan;

public class FirstClass 
{
	int a=10,b=20,c=0;
	
	public void add() 
	{
		c=a+b;
		System.out.println("addition of a and b is:" + c);
		
	}
	public void sub() {
	c=a-b;
	System.out.println("subtraction of a and b is:" +c);

	}
	
 public static void main(String[] args)
 {
	 System.out.println("Hi");
	 FirstClass obj=new FirstClass();
			 obj.add();
	 obj.sub();
	 
 }
}
