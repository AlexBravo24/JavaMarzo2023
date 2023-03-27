package com;

public class Arrays_AKVB {

	public static void main(String[] args) {
		/* Los Arrays son una estructura o colección de datos 
		 * de un mismo tipo, es decir, tienen un tipo de datos en
		 * común, y una vez declarado su tamaño, éste no puede cambiar.
		 * 
		 */
		
		//Declarando un array.
		
		int [] numeros = new int [10]; 	//Array de numeros enteros con 
										//su tamaño declarado.
		
		/* Arrays inician en 0 */
		
		numeros[0] = 1;	//Los corchetes[] indican la posición.
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 7;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		/* Tratar de meter valores fuera del array lo desborda.
		 * Al declarar numeros[10] no llega hasta la posición 10,
		 * sino que son las posiciones 0-9 y un total de 10.
		 */
	
		
		//IMPRIMIR POSICIONES DEL ARRAY
		System.out.println("Números[9]: " + numeros[9]);
		
		//Otra forma de declarar arrays:
		
		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//Array declarado e inicializado.
		
		//Imprimir un array completo usando un ciclo.
		System.out.println("\nImprimir un array completo usando un ciclo.");
		for(int i  = 0 ; i < num.length ; i++) {
			System.out.println("num["+ i +"]: " + num[i]);	
		}
		
		char [] letra = {'K','e','v','i','n'};
		
		System.out.println(letra);	//System out puede imprimir un array 
									//de caracteres.
		
		String[] nombres = {"Luis", "Emmanuel", "Meli", "Eric"};
		
		System.out.println("Nombres[1]: " +nombres[1]);
		
		//for each
		
		for(String i : nombres) {	//Para cada uno de los elementos realiza la acción.
			System.out.println("Nombres (for each): " +i);
		}
		
		//for each numeros
		System.out.println("");
		for(int i: num) {
			System.out.println("Números (for each): " + i);
		}
		
		
	}

}
