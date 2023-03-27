package com;

import java.util.Scanner;

public class Ciclos9_RICG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int numero1;
	    int numero2;
	    int minimo;
	    int maximo;
	    
	    System.out.println("El programa imprimirá todos los números pares entre dos números indicados.");
	    System.out.print("Introduce el primer número: ");
	    numero1 = scanner.nextInt();
	    System.out.print("Introduce el segundo número: ");
	    numero2 = scanner.nextInt();
	    
	   
	    if (numero1 < numero2) {
	      minimo = numero1;
	      maximo = numero2;
	    } else {
	      minimo = numero2;
	      maximo = numero1;
	    }
	    
	    for (int i=minimo+1; i < maximo; i++){
	      if (i%2==0){
	        System.out.println(i); 
	      }
	    }
	  }
	

	}


