package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		//las expresiones lambda son funciones anónimas que implementan
		//un metodo de una interface funcional
		//su operador es -> y su sintaxis es (parametros)->{(cuerpo)}
	    
	//	Metodos pantalla =(nombre)->System.out.println(nombre+"\n jesus");
		
	//	pantalla.mensaje("hola que tal");
		
//		Metodos operacion = (a,b)->System.out.println("la suma es = "+(a+b));
//		Metodos resta =(a,b)->System.out.println("la resta es = "+(a-b));
//		resta.sumar(1, 1);
//		operacion.sumar(16, 15);
		
		// creamos uns lista de nuestro de nuestro objeto persona
		
		List<Persona>lista=new ArrayList<Persona>();
		List<Persona>listaFiltrada=new ArrayList<Persona>();
		
		lista.add(new Persona("Eva",25,"FEMENINO"));
		lista.add(new Persona("Monse",28,"FEMENINO"));
		lista.add(new Persona("Erick",28,"MASCULINO"));
		lista.add(new Persona("Luis",26,"MASCULINO"));
		lista.add(new Persona("Alberto",25,"MASCULINO"));
		lista.add(new Persona("ADRIANA",27,"FEMENINO"));
		
		//mostrando la lista en pantalla
		System.out.println(lista);
		
		//para recorrer los elementos de una lista
		//forma declrativa con un ciclo for
		
//		for(int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
		
		//for each
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
		
		//for each en una sola linea
//		lista.forEach(System.out::println);
		
		//for each para filtrar a las personas por genero
		//agregandolos a la llista filtrada
//		
//		for(Persona i: lista) {
//			if(i.getGenero().equals(i)) {
//				listaFiltrada.add(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
		
		//forma imperativa
		//solo vamos solicitando lo que vamos necesitando
		//Api stream
		
//		listaFiltrada=lista.stream()
//				.filter(i->i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//ordenar elementos por edad ascendentemente
//		listaFiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//ordenar elementos por edad descendentemente
//				listaFiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//				listaFiltrada.forEach(System.out::println);
		
		//todos cumplen una condicion determinada
//		boolean todos=lista.stream().allMatch(i->i.getEdad()<30);
//		System.out.println(todos);
//		
//		//alguno cumplen una condicion determinada
//				boolean alguno=lista.stream().anyMatch(i->i.getEdad()<30);
//				System.out.println(alguno);
//				
//				//si ninguno cumplen una condicion determinada
//				boolean ninguno=lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//				System.out.println(ninguno);
		
		//retornar un valor opcional
//		Optional<Persona>menorEdad=lista.stream().min(Comparator.comparing(Persona::getEdad));
//		System.out.println(menorEdad);
		
		// un valor con varias condiciones
		Optional<Persona>hombreMayor=lista.stream().filter(i->i.getGenero().equals("MASCULINO")).max(Comparator.comparing(Persona::getEdad));
		hombreMayor.ifPresent(System.out::println);
		
	}

}
