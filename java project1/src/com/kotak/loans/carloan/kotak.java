package com.kotak.loans.carloan;

public class kotak implements Sbi {

	public static void main(String[] args) {
		kotak k= new kotak();
		k.deposit();
		k.withdrawal();

	}

	@Override
	public void withdrawal() {
		System.out.println("I am Overridden withdrawal in kotak");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am Overridden deposit in kotak");
		
	}

}
