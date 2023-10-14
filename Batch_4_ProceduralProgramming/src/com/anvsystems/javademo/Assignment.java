package com.anvsystems.javademo;

public class Assignment {
	public static void main(String[] args) {
		/**
		 * DECLARE TWO VARIABLES
		 * customertype = 'T' - Titanium , D - Diamond
		 * rewardPoint = 
		 * if rewardPoint > 10000 - 20% discount
		 * rewardpoint > 15000 - 30% discount
		 * you nedd to check if the customer is titanium or Diamond
		 * if titanium - cashback - 2%
		 * if diamond - cashback - 5%
		 */
		
//		char customertype = 'D';
//		int rewardPoint = 15001;
//		
//		if(customertype == 'T' && rewardPoint>10000) {
//			System.out.println("You Got 20% discount & 2% cashback");
//		}
//		if(customertype == 'D' && rewardPoint>15000) {
//			System.out.println("You Got 30% discount & 5% cashback");
//		}
		
		
		//Class Solution
		char customerType='T';
		int rewardPoints = 11000;
		int billAmount = 20000;
		float tempBillAmount = 0;
		
		if(customerType == 'T' && (rewardPoints > 10000 && rewardPoints < 15000)) {
			tempBillAmount = (float)(0.2*billAmount);
			billAmount = billAmount - (int)tempBillAmount;
			billAmount = (int) (billAmount + 0.02*billAmount);
		}else if(customerType == 'T' && rewardPoints > 15000) {
			
		}else if(customerType == 'T' && (rewardPoints > 10000 && rewardPoints < 15000)) {
			
		}
	}
}
