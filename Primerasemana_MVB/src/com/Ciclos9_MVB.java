package com;
import java.util.Scanner;

public class Ciclos9_MVB {

	public static void main(String[] args) {
//EJERCICIO 9. Programa Java que lea dos números y muestre los números pares entre ellos
	
		Scanner entrada = new Scanner(System.in);
		int num1, num2, menor, mayor;
		
		 do {
	            System.out.print("Ingrese el primer número (entre 25 y 38): ");
	            num1 = entrada.nextInt();
	        } while (num1 < 25 || num1 > 38);

	        do {
	            System.out.print("Ingrese el segundo número (entre 25 y 38): ");
	            num2 = entrada.nextInt();
	        } while (num2 < 25 || num2 > 38);
	        
	        if (num1 < num2) {
	            menor = num1;
	            mayor = num2;
	        } else {
	            menor = num2;
	            mayor = num1;
	        } 
	        System.out.println("Números pares entre " + menor + " y " + mayor + ":");
	        for (int i = menor; i <= mayor; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	        
	}//CIERRE DEL MAIN

}//CIERRE DE LA CLASE
