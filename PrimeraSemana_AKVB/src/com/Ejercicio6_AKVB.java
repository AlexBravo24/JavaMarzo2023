package com;
import java.util.Scanner;
public class Ejercicio6_AKVB {
	
	public static void main(String[] args){
		int size;
		double initial_cost, final_cost;
		char type;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("PROGRAMA DE UVAS");
		System.out.println("Ingrese el precio inicial de la uva...");
		initial_cost = entrada.nextDouble();
		System.out.printf("COSTO: " + "%.2f", initial_cost);
		System.out.println(" ");
		System.out.println("Ingrese el tipo y el tamaño de uva...");
		System.out.println("TIPO: (A - B)");
		type = entrada.next().charAt(0);
		while(type!= 'A' && type != 'B'){
			System.out.println("Favor de ingresar un tipo válido (A - B)");
			type = entrada.next().charAt(0);
		}//while type ENDS
		
		System.out.println("TAMAÑO: (1 - 2)");
		size = entrada.nextInt();
		while(size!= 1 && size != 2){
			System.out.println("Favor de ingresar un tamaño válido (1 - 2)");
			size = entrada.nextInt();
		}//while size ENDS
		System.out.println("ANALIZANDO PRECIO DE UVA...");
		final_cost=initial_cost;
		if(type=='A'){
			if(size == 1)
			{
				final_cost = final_cost - 0.20;
				System.out.println("UVA TIPO A TAMAÑO 1");
			}else {
				final_cost = final_cost - 0.30;
				System.out.println("UVA TIPO A TAMAÑO 2");
				
			}
		}else {
			if(size == 1)
			{
				final_cost = final_cost - 0.30;
				System.out.println("UVA TIPO B TAMAÑO 1");
			}else {
				final_cost = final_cost - 0.50;
				System.out.println("UVA TIPO B TAMAÑO 2");
			}
		}
		
		System.out.println("COSTO INICIAL: " + initial_cost);
		System.out.println("COSTO FINAL: " + final_cost);
		
		entrada.close();
		System.out.println("Me despido, saludos cordiales.");
	}//main() ENDS
}//class ENDS
