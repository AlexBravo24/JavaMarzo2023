package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generacion {

	public static void main(String[] args) {
		List <String> lista= new ArrayList <String> ();
		List <String> listaFiltrada= new ArrayList <String> ();
		
		lista.add("Ariana");
		lista.add("Emmanuel");
		lista.add("Erick");
		lista.add("Eva");
		lista.add("Guillermo");
		lista.add("Erika");
		lista.add("Kevin");
		lista.add("Lucio");
		lista.add("Melina");
		lista.add("Monse");
		lista.add("Rosario");
		lista.add("Luis");
		lista.add("Oscar");
		lista.add("Pedro");
		
		
//		//Ordenar
//		listaFiltrada = lista.stream()             //Se realiza el flujo de datos con Stream
//				.sorted()                          //Utilizamos la funcion sorted para ordenar
//				.collect(Collectors.toList());     //Almacenamos los datos en la lista
//		System.out.println(listaFiltrada);
		
		//Ordenar inversamente
		//lista.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
		
		
//		//Filtrar por caracter (
//		listaFiltrada = lista.stream()
//				.filter(x->x.contains("A"))				
//				.collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
//		//Filtrar sin importar si es mayuscula o minuscula
//		listaFiltrada = lista.stream()
//				.filter(s->s.equalsIgnoreCase("luis"))				
//				.collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
		//Limitar
		//lista.stream().limit(5).forEach(System.out::println);
		
		//Contar
		//Long x = lista.stream().count();
		//System.out.println(x);
		
		//Convertir a mayusculas
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}

}
