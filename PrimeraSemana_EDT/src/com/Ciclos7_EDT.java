package com;
import java.util.Scanner;
public class Ciclos7_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduca el primer número");
		int num1 = my_scanner.nextInt();
		System.out.println("Introduca el segundo número");
		int num2 = my_scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("Mayor: " + num1 + " Menor: " + num2);
		} else {
			System.out.println("Mayor: " + num2 + " Menor: " + num1);
		}
	}

}
