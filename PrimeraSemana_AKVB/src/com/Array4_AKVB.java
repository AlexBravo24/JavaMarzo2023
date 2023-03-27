package com;

public class Array4_AKVB {

	public static void main(String[] args) {
		int [] num_a = {1,2,3,4,5};
		int [] num_b = new int[5];
		int help = 0;
		
		System.out.println("Programa de Array invertido.");
		
		for(int i = 4 ; i >= 0 ; i--) {
//			System.out.print("\nhelp: " + help);
			num_b[help] = num_a[i];
//			System.out.println("num_a: " + num_a[i]);
//			System.out.println("num_b: " + num_b[help]);
			help++;
		}
		System.out.print("\nArray normal: ");
		printArray(num_a);
		System.out.print("\nArray invertido: ");
		printArray(num_b);
		
	}
	
	static void printArray(int [] array) {
		for(int i = 0 ; i < array.length ; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
	}
	
}
