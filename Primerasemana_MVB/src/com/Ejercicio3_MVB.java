package com;
import java.util.Scanner;

public class Ejercicio3_MVB {

	public static void main(String[] args) {
		
		//EJERCICIO3. .Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.
				//Si elsegundo n�mero es 0, debe mostrar un mensaje de error.
				
		
				Scanner entrada = new Scanner (System.in);
				System.out.println("Introduce el primer valor");
				int num1 = entrada.nextInt();
				System.out.println("Introduce el segundo valor");
				int num2 = entrada.nextInt();

				
			
				if(num2 == 0) {
					System.out.println("Error: no se divide entre 0");
				}else {
					double resultado = num1/num2;
					System.out.println("El resultado de la divisi�n es:  " + resultado);
				}
				
	
	}//cierre del main
	
	}//cierre de la clase

	
