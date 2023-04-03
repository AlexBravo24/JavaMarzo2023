package com;

public class Arrays_LFEO {

	public static void main(String[] args) {
		/*Los arrays son un aestructura de coleccion de datos de un mismo tipo
		 * es decir, tienen un tupo de datos en comun y una vez declarado su tam;o 
		 * o longitud este no puede cambiar. No cambia en tiempo de ejecucion
		 * 
		 * */
		//DECLARANDO UN  array con su tamano
		
		int [] numeros = new int[10]; //un array de numeros enteros con su tama;o declarado[1][2][3]

		//asignar o  introducir valor en cada posicion de array
		//La posicion por indice en la que inician almacenando valores los arrays, es la posicion 0
		
		numeros[1] = 2; //Indicamos con los corchetes la posicion del indice en el cual se va almacenar un valor
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 7;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		//numeros[10] = 11; //si introducimos un valor mas en teoria lo acepta, peor no se puede hacer uso de el
		//porque su tama;o ya esta determinado desde un inicio
		//darle salida a un dato en consola que esta en determinada posicion del indice
		
		//System.out.println(numeros[9]);
		
		//otra manera de declarar e iinicar un array ya con sus valores
//		
//		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		//tenemosun array declarado con sus respectivos valores asignados
//		
//		//IMPRIMIR EN PANTALLA LOS VALORES DEL ARRAY UTILIZANDO UN CICLO
//		for(int i=0; i< num.length; i++) {
//			System.out.println(num[i]);
//		}
//		
//		char [] letra = {'A','l','e','x'};
//		System.out.println(letra);
//		
//		String[] nombres = {"Luis","Emanuel","Meli","Erick"};
//		System.out.println(nombres[1]);
//		
//		//for each
//		for(String i: nombres) { //para cada uno de los elementos realiza lo siguiente
//			System.out.println(i);
//		}
		
		for(int i: numeros) {
			System.out.println(i);
		}
		
	}

}
