package com.techelevator.wishList;

	// Creating a class called Wishlist, with 5 different variables 
	public class Budget {

		private String item;
		boolean isBirthday;
		boolean isHoliday;
		double balance = 100;
		
	

		// constructor for all variables:
		public Budget(String item,  boolean isBirthday, boolean isHoliday, double balance) {
			this.item = item;
			// this.expensiveItem = expensiveItem;
			this.isBirthday = isBirthday;
			this.isHoliday = isHoliday;
			this.balance = balance;
		}

		// constructor for Budget Birthday:

		public Budget(boolean isBirthday, boolean isHoliday, double balance) {	
			this.isBirthday = isBirthday;
			this.isHoliday = isHoliday;
			this.balance = balance;
		}

		
		// getters

		public String getItem() {
			return item;

		}

		public boolean isIsBirthday() {
			return isBirthday;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public double balance() {
			return balance;
		}

		public boolean birthdayBalance() {
			// TODO Auto-generated method stub
			return null != null;
		}

		public boolean holidayBalance() {
			// TODO Auto-generated method stub
			return  != null;
		}

		


	}

