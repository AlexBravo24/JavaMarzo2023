package com;

import java.util.Scanner;

public class Ejercicio6_LARZ {

	public static void main(String[] args) {
		// 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva 
		//la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
		//Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar 
		//cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:
		//Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2.
		//Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
		//Precio inicial se recibe desde teclado

		
		System.out.println("Programa que clasifica el tipo y tama�o de uva.");
		System.out.println();
		
		double precio;
		Scanner entrada0 = new Scanner(System.in);
		System.out.println("Introduce el precio inicial por kilo de uva: ");
		precio = entrada0.nextDouble();
		
		String tipo;		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Introduce si el tipo de uva es A o B: ");
		tipo = entrada1.next();
		
		int tamano;		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce si el tama�o es 1 o 2: ");
		tamano = entrada2.nextInt();
		
		if (tipo.equals("A") && tamano==1) {
			System.out.println("El precio es de: "+ (precio + 0.20)  );
		}else if (tipo.equals("A") && tamano==2) {
			System.out.println("El precio es de: "+ (precio + 0.30)  );
		}else if (tipo.equals("B") && tamano==1) {
			System.out.println("El precio es de: "+ (precio - 0.30)  );
		}else if (tipo.equals("B") && tamano==2) {
			System.out.println("El precio es de: "+ (precio - 0.50)  );
		}else {
			System.out.println("Error");
		}

	}

}
