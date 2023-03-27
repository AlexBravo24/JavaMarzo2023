package com;

import java.util.Scanner;

public class EjercicioCiclos10 {

	public static void main(String[] args) {
	
		float a,positivos=0,impar=0;
		Scanner entrada =new Scanner (System.in);
		for(int i=0;i<20;i++) {
			System.out.println("introduzca un numero:");
			a=entrada.nextFloat();
		    if(a>=0 && a%2==0) {
		    	System.out.println("es positivo par");
		    	positivos+=a;
		    }
		    else if(a>=0 && a%2!=0) {
		    	System.out.println("es positivo impar");
		    	impar+=a;
		    	positivos+=a;
		    }
		    else if(a<0) {
		    	System.out.println("es negativo");
		    }
		    
		
			}
		System.out.println("la sumatoria de los positivos es:"+positivos);
		System.out.println("la sumatoria de los impar es:"+impar);

	}

}
