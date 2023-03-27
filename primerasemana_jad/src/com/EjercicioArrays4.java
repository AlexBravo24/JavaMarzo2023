package com;

public class EjercicioArrays4 {

	public static void main(String[] args) {
		int numeros[]= {1,2,3,4,5};
		int num[]=new int[5];
		int j=4,i=0;
		while(j>=0) {
			num[i]=numeros[j];
			System.out.print(num[i]);
			i++;
			j--;
		}
		
	}

}
