package com;

public class Arrays4_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] my_array = {1,2,3,4,5};
		int[] my_array2 = new int [5];
		
		int counter = 0;
		for (int i = 4; i >=0; i--) {
			my_array2[counter] = my_array[i];
			counter ++;
		}
		
		System.out.println("Este es el nuevo arreglo");
		for (int i = 0; i < my_array2.length; i++) {
			System.out.println(my_array2[i]);
		}
		
		
	}

}
