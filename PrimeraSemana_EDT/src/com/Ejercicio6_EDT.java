package com;
import java.util.Scanner;
public class Ejercicio6_EDT {
	public static void main(String[] args) {
		
//		6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
//		clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
//		es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
//		entrega en un embarque considerando lo siguiente:
//		* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
//		es de tamaño 2.
//		* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
//		tamaño 2.
//		Precio inicial se recibe desde teclado
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de uvas");
		int cant = my_scanner.nextInt();
		
		System.out.println("Introduzca el tipo de Uva, A o B");
		String kind = my_scanner.next();
		
		System.out.println("Introduzca el tamaño de la Uva, 1 o 2");
		int size = my_scanner.nextInt();
		
		System.out.println("Introduzca el precio de las uvas");
		int price = my_scanner.nextInt();
		
		if (kind.equalsIgnoreCase("A")) {
			if (size == 1) {
				System.out.println("El precio normal sería de: " + cant*price);
				System.out.println("Pero con el aumento de 30 centavos serán: " + ((cant*price) + (cant*.20)));
			} else {
					
				System.out.println("El precio normal sería de: " + cant*price);
				System.out.println("Pero con el aumento de 50 centavos serán: " + ((cant*price) + (cant*.30)));		
			}
		} else if (kind.equalsIgnoreCase("B")){
			if (size == 1) {
				System.out.println("El precio normal sería de: " + cant*price);
				System.out.println("Pero con la resta de 30 centavos serán: " + ((cant*price) - (cant*.30)));
			} else {
					
				System.out.println("El precio normal sería de: " + cant*price);
				System.out.println("Pero con el aumento de 50 centavos serán: " + ((cant*price) - (cant*.50)));		
			}
		}
		

		
	}
}
