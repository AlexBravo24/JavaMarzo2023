package com;
import java.util.Scanner;
public class Arrays3_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String sentence = my_scanner.nextLine();
		char[] my_array = new char[sentence.length()];
		
		for (int i = 0; i< sentence.length(); i++) {
			my_array[i] = sentence.charAt(i);
		}
		System.out.println(my_array.length);
		for (int i = 0; i< my_array.length; i++) {
			System.out.print(my_array[i]+" ");
		}
	}

}
