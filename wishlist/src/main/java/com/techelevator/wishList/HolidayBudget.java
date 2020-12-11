package com.techelevator.wishList;

public class HolidayBudget extends Budget {
	public HolidayBudget(String item, boolean isBirthday, boolean isHoliday, double balance) {
		super(item, isBirthday, isHoliday, balance);
		// TODO Auto-generated constructor stub
	}

	public double holidayBalance() {

		double holidayBalance = 0.00;

		if (!isHoliday) {
			holidayBalance = balance;
			
		} else {
			holidayBalance = balance + 50;
		
		}

		return holidayBalance;
	}

}
