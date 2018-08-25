package com.kotak.loans.carloan;

public class Icici implements Sbi {

	public static void main(String[] args) {
    Icici i=new Icici();
    i.withdrawal();
    i.deposit();
	}

	@Override
	public void withdrawal() {
		System.out.println("I am Overridden withdrawal in icici");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am Overridden deposit in icici");
		
	}

}
