package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter the price of the item(s): ");
		double inputPrice = sc.nextDouble();
		System.out.println();
		
		System.out.println("Please enter customer payment: ");
		double inputPay = sc.nextDouble();
		System.out.println();
		
		if (inputPrice == inputPay) {
			System.out.println("No change needed.");
		} else if (inputPrice > inputPay) {
			System.out.println("Insufficient payment.");
		} else if (inputPrice < inputPay) {
			double change = inputPay - inputPrice;
			double remainder = change;
			
			if (remainder >= 20) {
				int twenty = (int) remainder / 20;
				remainder %= 20;
				System.out.println(twenty + " twenty dollar bill(s)");
			}
			if (remainder > 10) {
				int ten = (int) remainder / 10;
					remainder %= 10;
				System.out.println(ten + " ten dollar bill(s)");
			}
		
			
		}

	}
	

}
