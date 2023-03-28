package com;

public class Arrays_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Los arrays son una estructura o coleccion de datos
		//de mismo tipo es decir tienen un tipo de datos en común
		//y una vez declarado su tamaño no pueden cambiar, ni en tiempo de ejecucucion
		
		
		//declarando un array con su tamaño
		
		int [] numeros = new int [10]; //array de numeros enteros con su tamaño declarado
		
		//asignar o introducir valores en cada posicion 
		//la posicion en la que inician almacenando valores es la cero
		numeros[0]=1;
		numeros[1]=2; //indicamos la posicion del indice en el cual se va almacenar un valor
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;

		
//darle salida a un dato en consola que esta en determinada 
//posicion
		
		System.out.println(numeros[9]);//debe estar declaradoel valor en el array
		
		
		//	OTRA MANERA DE APLICAR EL ARRAY YA CON SUS VALORES
		
		int [] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//tenemos un array con sus respetivos valores asignados
	//	System.out.println(num[6]);//un datos
		//como imprimir todos los valores con un ciclo
		
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		char [] letra = {'A','R','I'};
		System.out.println(letra);
		
		
		String [] nombres = {"ari","vic","luis"};
		System.out.println(nombres[1]);
		
		//ciclo for each muestra todos los datos
		for(String i : nombres) {
			System.out.println(i);
		}
		
		
		
		
		
		for (int i: num) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}//cierre

}//cierre
