package com;
import java.util.Scanner;
public class Arrays1_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner my_scanner = new Scanner(System.in);
		int[] my_array = new int[3];
		System.out.println("Introduzca 10 números");
		for (int i = 0; i < 3; i++) {
			int num = my_scanner.nextInt();
			my_array[i] = num;
		}
		for (int i = 0; i < my_array.length; i++) {
			System.out.println("Índice: " + i + " = " + my_array[i]);
		}
	}

}
