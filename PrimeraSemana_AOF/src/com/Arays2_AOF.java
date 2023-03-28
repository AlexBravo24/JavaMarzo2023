package com;

public class Arays2_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un array de números de 100 posiciones, que contendrá los números del 
//		1 al 100. Obtén la suma de todos ellos y la media
		
		int [] num = new int [100];
		int suma =0;
		int media;
		
	
		for (int i=0; i<num.length; i++) {
			num[i]=i+1;
			System.out.println(num[i]);
			suma += i+1;
			
		}
		
		media=suma/num.length;
		System.out.println("la suma del array es: "+suma);
		System.out.println("la media del array es:"+media);
		
	}

}
