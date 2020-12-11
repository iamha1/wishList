package com.techelevator.wishList;

public class Main {
	
	public static void main(String[] args) {

		//instantiate all objects in Wishlist.java for birthday
	
		Budget budgetBirthday = new Budget(true, false, 100); 
		
		System.out.println(budgetBirthday.birthdayBalance());
		System.out.println(budgetBirthday.birthdayBalance());
		
		
		Budget budgetHoliday = new Budget(false, true, 100);
		
		System.out.println(budgetHoliday.holidayBalance());
		System.out.println(budgetHoliday.holidayBalance());
		
	}
}


		
