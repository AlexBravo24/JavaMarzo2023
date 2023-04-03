package com;

public class Ciclos8_MVB {

	public static void main(String[] args) {
//Ejercicio 8. Programa Java que lea dos números y muestre los números desde el menor hasta el
//mayor
		
		int num1 = 25;
		int num2 = 38;
		
		int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);
        		
		System.out.println("Los números desde " + menor + " hasta " + mayor + " son:");
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    

		
	}//cierre del main

 }//cierre de la clase
