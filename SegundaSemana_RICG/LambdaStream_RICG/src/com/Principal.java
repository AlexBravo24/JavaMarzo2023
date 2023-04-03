package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {
	
	public static void main(String[] args) {
		//Las expresiones Lambda son funciones anónimas que implementan
		//un método de una interface funcional
		//Su operador es -> y su sintaxis es (parametros) -> {(cuerpo)
		
		//Metodos pantalla = (nombre)->System.out.println(nombre+"\nHola mundo");
		
		//0pantalla.mensaje("Luis");
		
		//Metodos suma = (a,b)->System.out.println("La suma es ="+(a+b));
		//Metodos resta =(a,b)->System.out.println("La resta es =" +(a-b));
		
		//suma.operacion( 9, 5);
		//resta.operacion(7, 2);
		
		//El API Steam contiene herramientas que nos ayudan con el flujo de datos de una coleccion 
		
		//Originalmente podemos declararlo de esta manera
		//El flujo de datos o Stream, no almacena valores
//		Stream<String> nombres =Stream.of("Jesus","Itzel","Eva","Luis").filter(s->s.contains("e"));
//		
//		List <String> lista = nombres.collect(Collectors.toList());
//		System.out.println(nombres);
		
//		List<String> lista = new ArrayList<String>();//Lista original
//		List<String> listaFiltrada= new ArrayList<String>();
//		
//		lista.add("Jesus");
//		lista.add("Luis");
//		lista.add("Lucio");
//		lista.add("Eva");
		//Asigno el valor de mi lista original a mi lista filtrad
		
//		listaFiltrada=lista.stream().filter(x->x.equalsIgnoreCase("Lucio")).collect(Collectors.toList());
//		
//		System.out.println(listaFiltrada);
//		
//		

//		listaFiltrada=lista.stream().sorted().collect(Collectors.toList());
//		
//		System.out.println(listaFiltrada);
//		
		//Realizar una lista y van agregar los nuombres de todos los compañeros 
		//y crear un Stream y van a probar algunos metodos que consideremos utiles
		//Investigar que metodos podemos utilizar en las colecciones (sorted, filter)
		//Ordenan datos, filtran por alguan peticion.
		
		
//		List<String> liAlu = new ArrayList<String>();
//		List<String> liAluFiltrada= new ArrayList<String>();
//		
//		liAlu.add("Lucio");
//		liAlu.add("Ariana");
//		liAlu.add("Emmanuel");
//		liAlu.add("Erick");
//		liAlu.add("Eva");
//		liAlu.add("Guillermo");
//		liAlu.add("Erika");
//		liAlu.add("Jesus");
//		liAlu.add("Kevin");
//		liAlu.add("Luis");
//		liAlu.add("Monse");
//		liAlu.add("Oscar");
//		liAlu.add("Pedro");
//		liAlu.add("Melina");
	//Mostrar la lista 
		//System.out.println(liAlu);

//Filtrar la lista conlos alumono que termine con la letra "a"
		
//		liAluFiltrada = liAlu.stream().filter(i->i.contains("a")).collect(Collectors.toList());
//	    System.out.println(liAluFiltrada);

	    
//Filtra los nombres apartir del numero 5
//	
//		liAluFiltrada=liAlu.stream().skip(5).collect(Collectors.toList());
//		System.out.println(liAluFiltrada);
//		
		

//Transforma de minusculas a mayuscul		
//		liAluFiltrada=liAlu.stream().map(String ::toUpperCase).collect(Collectors.toList());
//		System.out.println(liAluFiltrada);
//		
		
//		Long x = liAlu.stream().count();
//		System.out.println(x);
		
		
		//Creamos una lista de nuestro objeto Persona
		
		List <Persona> lista = new ArrayList <Persona>();
		//Creamos una lista para mostrar valores filtrados
		List<Persona> listaFiltrada= new ArrayList<Persona>();
		
		lista.add(new Persona("Eva",25,"FEMENINO"));
		lista.add(new Persona("Monse",28,"FEMENINO"));
		lista.add(new Persona("Erick",28,"MASCULINO"));
		lista.add(new Persona("Luis",26,"MASCULINO"));
		lista.add(new Persona("Lucio",27,"MASCULINO"));
		lista.add(new Persona("Guillermo",29,"MASCULINO"));
		lista.add(new Persona("Pedro",28,"MASCULINO"));
		lista.add(new Persona("Jesus",26,"MASCULINO"));
		lista.add(new Persona("Ariana",25,"FEMENINO"));
		lista.add(new Persona("Erika",26,"FEMENINO"));
		lista.add(new Persona("Kevin",24,"MASCULINO"));
		lista.add(new Persona("Emmanuel",22,"MASCULINO"));
		lista.add(new Persona("Rosario",28,"FEMENINO"));
		lista.add(new Persona("Oscar",34,"MASCULINO"));
		
		
	//Mostrando la lista en pantalla
		   //System.out.println(lista);
	
//Recorrer los elementos de una lista
//Forma declarativa con un ciclo for
	//For
//		    for(int i=0;i<lista.size(); i++) {
//			    System.out.println(lista.get(i));
//		}
		    
   //For each
//		    for(Persona i:lista)
//		    	System.out.println(i);
		
   //For each en una sola linea
		//lista.forEach(System.out::println);
		
   //For each para filtrar a las personas por genero agregandolas a la lista filtrada
//		for(Persona i:lista) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//						System.out.println(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
		
	//Forma iperativa
		//Solo vamos solicitando lo que vamos necesitando API Stream
		
//		listaFiltrada=lista.stream().filter(i->i.getGenero().equals("FEMENINO")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
	//Ordenar elementos por edad ascendente
		
		//listaFiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
		//listaFiltrada.forEach(System.out::println);
		
	//Ordenar elementos al reverso
		//listaFiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
		//listaFiltrada.forEach(System.out::println);
		
	//Todos cumplen una condicion determinada
		
		//boolean todos =lista.stream().allMatch(i->i.getEdad()<30);
		//System.out.println(todos);
		
		
	//Alguno cumple una condicion determinada
		//boolean alguno =lista.stream().anyMatch(i->i.getEdad()<30);
		//System.out.println(alguno);
	
	//si ninguno cumple la condicion			
		//boolean ninguno =lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
				//System.out.println(ninguno);
		
   //Retornar un valor opcional
	     Optional<Persona>menorEdad=lista.stream().min(Comparator.comparing(Persona::getEdad));
	     System.out.println(menorEdad);
	
	//Un valor con varias condiciones
	     Optional<Persona>hombreMayor=lista.stream().filter(i->i.getGenero().equals("MASCULINO")).max(Comparator.comparing(Persona::getEdad));
	     //System.out.println(hombreMayor);
	     hombreMayor.ifPresent(System.out::println);//Imprime con la lista Persona
	     
	
	
	}

}
