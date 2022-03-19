package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello, please enter the price of your item(s): ");
		double inputPrice = sc.nextDouble();
		
		System.out.println("Please enter your payment: ");
		double inputPay = sc.nextDouble();
		
		if (inputPrice == inputPay) {
			System.out.println("No change needed. Thank you for your payment!");
		} 

	}

}
