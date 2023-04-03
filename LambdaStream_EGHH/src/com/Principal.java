package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Las expresiones Lambda son funciones anónimas que implementan un método de una interface funcional y
		 * su operar es -> y su sintaxix es (parámetros) -> {cuerpo de lambda}
		 */
		
		//Metodos pantalla = (nombre) -> System.out.println(nombre+"\nHola mundo");
		
		//pantalla.mensaje("Erika");

		//Metodos operacion = (a,b)->System.out.println("La suma es: " + (a+b));
		
		Metodos suma = (a,b)->System.out.println("La suma es: "+ (a+b));
		Metodos resta = (a,b)->System.out.println("La resta es: "+ (a-b));
		
//		suma.operacion(16, 15);
//		resta.operacion(10, 5);
		
		/*
		 * El API Stream contiene herramientas que nos ayudan con el flujo de datos de una colección.
		 */
		
		//Originalmente podemos declararlo de esta manera.
//		
//		Stream<String> nombres = Stream.of("Jesús","Itzel","Eva","Luis").filter(s->s.contains("e"));
//		
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(nombres);
		
		List<String> lista=new ArrayList<String>();
		List<String> listaFiltrada=new ArrayList<String>();
		
		lista.add("Jesús");
		lista.add("Luis");
		lista.add("Lucio");
		lista.add("Eva");
		
		/*
		 * Asigno el valor de mi lista origina a mi lista filtrada.
		 */
		
		//listaFiltrada=lista.parallelStream().filter(x->x.contains("i")).collect(Collectors.toList());
	
		listaFiltrada=lista.stream().sorted().collect(Collectors.toList());
		System.out.println(listaFiltrada);
	}

}