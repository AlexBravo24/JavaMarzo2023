package com;

public class Arrays_ELVM {
	public static void main(String[] args) {
		/*
		 * los arrays son una estructura o coleccion de datos de un mismo tipo
		 * es decir, tienen un tipo de datos común
		 * y, una vez declarado su tamáño o logitud
		 * este no puede cambiar. no cambia en tiempo de ejecucion
		 */
		
		//declaracio de un array con tamaño
		
		int [] numeros=new int [10];//un array de numeros enteros con tampaño declarado
		//[1][2][3][4]---[10]
		//introducir valores en cada posicion del array
		//la posicion por indice en la que inician almacenando valores los arrays, es la posicion 0
		
		numeros[0]=1;//indicamos con los corchetes la posicion del indice en el cual se va a almacenar un valor
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;
		//salida a un dato en consola que esta en determinada posicion del indice
		//en teoria "lo acepta",pero no se puede acer uso de el, por que
		//su tamaño debe estar declarado desde un inicio
		
		//System.out.println(numeros[9]);
		
		
		//otra manera de declarar e iniciar un array ya con sus valores
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		//tenemos un array declarado y con sus respectivos valores
		//asignados
		//imprimir en pantalla de los valores del array utilizando un ciclo
		
//		for(int i= 0;i < num.length;i++) {
//			System.out.println(num[i]);
//		}
		
//		
//		char [] letra= {'l','u','i','s'};
//		//System.out.println(letra);
//		
//		String[] nombres= {"luis","emmanuel","meli","erick"};
//		//System.out.println(nombres[1]);
//		
//		//for each es un ciclo
//		
//		for (String i : nombres) {//para cada no de los elementos realiza lo sigueinte
//			System.out.println(i);
//			
//		}
		for (int i: num) {
			System.out.println(i);
		}
		
	}
}
