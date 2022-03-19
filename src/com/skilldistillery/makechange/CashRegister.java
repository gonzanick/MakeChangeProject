package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double change = 0.0;
		
		System.out.println("Please enter the price of the item(s): ");
		double inputPrice = sc.nextDouble();
		
		System.out.println("Please enter customer payment: ");
		double inputPay = sc.nextDouble();
		
		if (inputPrice == inputPay) {
			System.out.println("No change needed.");
		} else if (inputPrice > inputPay) {
			System.out.println("Insufficient payment.");
		}
		
		if (inputPrice < inputPay) {
			change = inputPay - inputPrice;
			
		}

	}

}
