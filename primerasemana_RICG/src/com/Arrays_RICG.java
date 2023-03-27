package com;

public class Arrays_RICG {

	public static void main(String[] args) {
		//ARRAYS - Son una estructura de coleccion de un mismo tipo, es decir , tienen un tipo de datos en comun,
		//una vez declarado su tamaño o longitud este no puede cambiar.
		//Declarar un array con su tamaño
		
		int[] numeros = new int [10];//un array de numeros enteros 
		//su tamaño declarado
		
		//Asignar o introducir valores en cada posicion array
		//la posicion por indice en la que inician almacenando valores los arrrays, es la posicion 0
		numeros [0]=1;//indicamos con los corchetes la posicion del indice en el cual se va almacenar un valor
		numeros [1]=2;
		numeros [2]=3;
		numeros [3]=4;
		numeros [4]=5;
		numeros [5]=6;
		numeros [6]=7;
		numeros [7]=8;
		numeros [8]=9;
		numeros [9]=10;
		//numeros [10]=11; si introducimos otro valor en teoria lo acepta pero no puede hacer uso de el por que su tamaño debe estar declarado desde un inicio. 
		//Darle salida a un dato en consola que esta en determinada posicion de indice
		//System.out.println(numeros[9]);imprime 
		
		//otra manera de declarar o iniciar un array ya con sus valores
		
		int [] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//tenemos un array declarado con sus respectivos valores adignados
		
		//System.out.println(num);
		//Imprimir en pantall los valores del array utilizando un ciclo
//		for(int i =0; i<num.length; i++) {
//			System.out.print(num[i]);
//			System.out.println("");
//		}
//		
//		char [] letra = {'A', 'l', 'e', 'X'};
//		
//		String [] nombres = {"Luis", "Emmanuel", "Meli", "Erick"};
//		//System.out.println(nombres[1]);
//		
//		//for each
//		for(String i: nombres) {//para cada uno de los elementos realiza lo siguiente
//			System.out.println(i);
//		}
		//for each2
		for(int i: num) {
			System.out.println(i);//Sirve para imprimir los valores inicia desde el array
		}
				
	}

}
