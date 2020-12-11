package com.techelevator.wishList;

public class BirthdayBudget extends Budget {
	
	

	public BirthdayBudget(String item, boolean isBirthday, boolean isHoliday, double balance) {
		super(item, isBirthday, isHoliday, balance);
		// TODO Auto-generated constructor stub
	}

	public double birthdayBalance() {

		double birthdayBalance = 0.00;

		if (!isBirthday) {
			birthdayBalance = balance;
		} else {
			birthdayBalance = balance + 20;
		}

		return birthdayBalance;
	}

}
