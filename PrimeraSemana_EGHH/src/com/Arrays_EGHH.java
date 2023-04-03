package com;

public class Arrays_EGHH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Los arrays son una estructura o colección de datos de un mismo tipo, es decir,
		 * tienen un tipo de datos en común y, una vez declarado su tamaño o longitud este
		 * no puede cambiar. No cambia tiempo de ejecución.
		 */
		
		//Declarando un array con su tamaño
		
//		int [] numeros = new int[10]; //Un array de numeros enteros con su tamaño declarado. [], [], [], []
//		
//		//Asignar o introducir valores en cada posición del array
//		//La posición por índice en la que inician almacenando valores los arrays, es la posición 0.
//		
//		numeros[0] =  1; //Indicamos con los corchetes la posición del índice en el cual se va a almacenar un valor.
//		
//	}
	
		
	//Otra manera de declarar e iniciar un array ya con sus valores
	int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	/*Tenemos un array declarado y con sus respectivos valores asignados.
	 * Imprimir en pantalla los valores del array utilizando un ciclo.
	 */
//	for(int i = 0; i < num.length; i++) {
//		System.out.println(num[i]);
//		}
//	char [] letra = {'E','R','I','K','A'};
//	System.out.println(letra);
//	
//	String [] nombres = {"Erika","Emmanuel","Meli","Erick"};
//	//System.out.println(nombres[1]);
//	
//	//for each - para cada uno de los elementos
//	
//	for (String i: nombres) {//Para cada uno de los elementos realiza lo siguiente
//		System.out.println(i);
//	}
	for (int i: num) {
		System.out.println(i);
	}
}
}
