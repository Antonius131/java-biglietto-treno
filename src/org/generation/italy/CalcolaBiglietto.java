package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Quanti km vuoi percorrere?");
			int distance = sc.nextInt();
			
			System.out.println("Quanti anni hai?");
			int age = sc.nextInt();
		
		sc.close();
		
		double price = distance * 0.21;
		double discPrice;
		
		
		if (age < 12) {
			
			price = distance * 0;
			System.out.println("Il biglietto è gratuito");
		} else if (age > 13 && age < 18) {
			
			double minDiscount = price * 0.20;
			discPrice =  price - minDiscount;
			System.out.println(discPrice + "€");
		} else if (age > 65) {
			
			double maxDiscount = price * 0.40;
			discPrice =  price - maxDiscount;
			System.out.println(discPrice + "€");
		} else {
			
			System.out.println(price);
		}
	}
	

}
