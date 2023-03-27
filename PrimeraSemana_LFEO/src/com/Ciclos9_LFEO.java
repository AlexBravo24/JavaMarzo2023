package com;

import java.util.Scanner;

public class Ciclos9_LFEO {
	/*
	 * 9. Programa Java que lea dos números y muestre los números pares entre ellos 
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2; //se crean las variables
		
		System.out.println("INGRESA EL PRIMER NUMERO : ");
		n1 = entrada.nextInt(); //se pide cada numeor y se guarda en su respectiva vairable
		System.out.println("INGRESA EL SEGUNDO NUMERO : ");
		n2 = entrada.nextInt();
		
		if(n1<n2) { //si n1 es menor que n2
			for(int i=n1; i<=n2; i++) { //el forr se itera desde n1 hasta n2
				if(i % 2 ==0) { //y si la posicion del iterador i entre 2 da igual a 0 quiere decir que ese numero es par
					System.out.println("LOS NUMEROS PARES SON : "+i); //se imprime el resultado
				}else {
					System.out.println("NO EXISTE NUMERO PAR");
				}
			}
		}else { //en caso contrario quiere decir que n2 es mayor que n1
			for(int j=n2; j<=n1; j++) { //entonces el ciclo for inicia iterando desde n2 hasta n1
				if(j % 2 == 0) { //si el numero en la poscion del iterador j dividido entre 2 es igual a 0 quiere decir que es un par
					System.out.println("LOS NUMEROS PARES SON : "+j); //se imprime resultados
				}else {
					System.out.println("NO EXISTE NUMERO PAR");
				}
			}
		}

	}

}
