package com.anvsystems.javademo;

public class NestedConditionalStatements {
	public static void main(String[] args) {
		int balance = 10000;
		char creditRating = 'C';
		boolean guarantorApproval = false;
		
		if(balance>8000 && (creditRating == 'A' || creditRating == 'B')){
			if(guarantorApproval) {
				System.out.println("Loan Sanctioned");
			}else {
				System.out.println("Guarantor Approval Needed");
			}
		}else {
			System.out.println("Inelegible for loan");
		}
	}
}
