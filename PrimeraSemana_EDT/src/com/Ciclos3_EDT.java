package com;
import java.util.Scanner;
public class Ciclos3_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduca una palabra");
		String word = my_scanner.next();
		String reverseWord = "";
		
		
		for (int i = word.length()-1; i >= 0 ; i--) {
			reverseWord += word.charAt(i);
		}
		
		System.out.println(reverseWord);
		
		if (reverseWord.equalsIgnoreCase(word)) {
			System.out.println("Su palabra sí es un palídromo");
		} else {
			System.out.println("Su palabra no es un palídromo");
		}
		
	}

}
