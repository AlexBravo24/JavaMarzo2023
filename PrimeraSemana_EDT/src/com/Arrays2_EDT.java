package com;

public class Arrays2_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] my_array = new int[100];
		int sum = 0;
		double promedio = 0;
		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
			my_array[i-1] = i;
			sum += i;
		}
		promedio = (double)(sum/(my_array.length-1));
		
		System.out.println("Suma: " + sum);
		System.out.println("Promedio: " + promedio);
	}

}