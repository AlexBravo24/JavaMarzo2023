package com;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Las listas en Java son variables que permiten almacenar grandes cantidades de datos. 
//		Son similares a los Array o a las Matrices.

		 List<String> ejemploLista = new ArrayList<String>();//se crea la lista ya con datos agregados
		 //gregar los siguientes nombres: Juan, Pedro, José, María, Sofía.
	      ejemploLista.add("Juan");
	      ejemploLista.add("Pedro");
	      ejemploLista.add("José");
	      ejemploLista.add("María");
	      ejemploLista.add("Sofía");
		
	      //tamaño de la lista//Podemos obtener la cantidad de elementos que posee la lista:
	      ejemploLista.size();
	     // Para consultar la lista se utiliza:
	      ejemploLista.get(0);
	    //  Si queremos eliminar determinado elemento:

	    	  ejemploLista.remove(0);
	    	//  Donde nuevamente el 0 representa el índice que queremos eliminar. Otra forma de eliminar un registro es por su nombre:

	     ejemploLista.remove("Juan");
	     
	     //Si deseamos imprimir en consola los elementos de la lista:
	     System.out.println(ejemploLista);
	     
	    // También podemos imprimir todos los elementos de la lista de forma individual 
	     //con la ayuda de un ciclo for.

//
	     for (int i = 0; i <= ejemploLista.size() - 1; i++) {
	            System.out.println(ejemploLista.get(i));
	        }
	     
	     
	     // fuente https://panamahitek.com/el-uso-de-listas-en-java/
	}

}
