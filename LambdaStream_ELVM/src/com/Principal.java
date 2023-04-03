package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		/*
		 * las expresiones labda son funciones anonimas
		 * que implementan un metodo de una interface funcional
		 * su operador es -> y su sintaxis es (parametros)->{(cuerpo)}
		 * 
		 */

//		
//		Metodos pantalla= (nombre)->System.out.println(nombre+"\nhola mundo");
//		
//		pantalla.mensaje("monse-chan");
//		pantalla.mensaje("\nluis");
		
		/*
		 * 
		 */
//		Metodos suma=(a,b)->System.out.println("la suma es ="+(a+b));
//		Metodos resta=(a,b)->System.out.println("la resta es ="+ (a-b));
////		suma.operacion(5, 8);
////		resta.operacion(7, 2);
//		//el api stream contiene herramientas que nos ayudan con el flujo
//		//de datos de una coleccion
//		//originalmente podemos declararlo de esta manera
//		//el flujo de datos o Stream, no almacena los valores
//		Stream<String> nombre=Stream.of("jesus","itzel","eva","luis").filter(s->s.contains("l"));
//		
//		List<String>lista=nombre.collect(Collectors.toList());
//		System.out.println(lista);
//		//------------------------Clase viernes-----------------------------------------------
//		
//		List<String>lista=new ArrayList<String>();
//		List<String>listaFiltrada=new ArrayList<String>();
//		lista.add("Jesus");
//		lista.add("Luis");
//		lista.add("Lucio");
//		lista.add("Eva");
//		
//		//asigno el valor de mi lista original a mi lista filtrada
//		//tambien se usa el equalsingnorecase
//		//listaFiltrada=lista.stream().filter(x->x.contains("i")).collect(Collectors.toList());
//		listaFiltrada=lista.stream().sorted()
//				.collect(Collectors.toList());
//		
//		System.out.println(listaFiltrada);
//		//-------------------------------------------------------------
//		
		/*
		 * realizar una lista y van a agregar los nombres de sus compañeros
		 * y vamos a crear un stream y van a probar algunos metodos
		 * que ustedes consideren utiles
		 * investigar que metodos utilizar en las coleccions(sorted,filter)
		 * ejemplo, ordenar datos,filtra por peticion,etc..
		 */
//		String Entrada;
//		
//		List<String>lista=new ArrayList<String>();
//		List<String>listaFiltrada=new ArrayList<String>();
//		Scanner entrada=new Scanner(System.in);
//		
//		lista.add("Ariana Osorio");
//		lista.add("Emmanuel Dueñas");
//		lista.add("Eva Couturier");
//		lista.add("Guillermo Hernandez");
//		lista.add("Erika Hernandez");
//		lista.add("Kevin Velazquez");
//		lista.add("Luvio Escobar");
//		lista.add("Luis Miguel");
//		lista.add("Melina S");
//		lista.add("Monce Venegas");
//		lista.add("Oscar Martinez");
//		lista.add("Pedro Salazar");
//		lista.add("Rosario Cervantes");
//		lista.add("Erick Velazquez");
//		
//		//meda el numero de estudiantes que existe
//		System.out.println(lista.size());
//		
//		
//		//pido ingresar otro estudiante
//		System.out.println("ingresa el nuevo estudiante: ");
//		Entrada=entrada.nextLine();
//		lista.add(Entrada);//aqui ingresa al estudiante en la lista
//		
//		//aqui imprimo nuevamente la cantidad de estudiantes
//		System.out.println(lista.size());
//		
//		//para mostrar la lista
//		for(String n : lista) {
//			System.out.println("nombres: "+n);
//		}
//		
//		//este metodo Sorted es para ordenar de la A a la Z mi lista
//		listaFiltrada=lista.stream().sorted().collect(Collectors.toList());
//		System.out.println(listaFiltrada);
//		
//		//Esto es para filtra el nombre y los mostrara
//		listaFiltrada=lista.stream().filter(x->x.contains("Erick")).collect(Collectors.toList());
//		System.out.println(listaFiltrada);
//		System.out.println(listaFiltrada.size());
//		
//		///usando map para hacer una lisa de la frecuencia que se repiten los nombres
//		
//		 Map<String, Integer> frequencyMap = new HashMap<>();
//	        for (String s: lista)
//	        {
//	            Integer count = frequencyMap.get(s);
//	            if (count == null) {
//	                count = 0;
//	            }
//	 
//	            frequencyMap.put(s, count + 1);
//	        }
//	 
//	        for (Map.Entry<String, Integer> entre: frequencyMap.entrySet()) {
//	            System.out.println(entre.getKey() + ": " + entre.getValue());
//	        }
	
		////-------------------------------------------------------
		
		List<Persona>lista=new ArrayList<Persona>();
		//creamos una lista para mostrar valores fliltrados
		List<Persona>listaFiltrada=new ArrayList<Persona>();
		
		lista.add(new Persona("Eva",25,"FEMEINO"));
		lista.add(new Persona("Monce",28,"FEMEINO"));
		lista.add(new Persona("Erick",28,"MASCULINO"));
		lista.add(new Persona("Luis",27,"MASCULINO"));
		lista.add(new Persona("Lucio",28,"MASCULINO"));
		lista.add(new Persona("Guillermo",29,"MASCULINO"));
		lista.add(new Persona("Pedro",28,"MASCULINO"));
		lista.add(new Persona("Jesus",26,"MASCULINO"));
		lista.add(new Persona("Ariana",25,"FEMEINO"));
		lista.add(new Persona("Erika",26,"FEMEINO"));
		lista.add(new Persona("Kevin",24,"MASCULINO"));
		lista.add(new Persona("Emmanuel",22,"MASCULINO"));
		lista.add(new Persona("Rosario",28,"FEMEINO"));
		lista.add(new Persona("Oscar",34,"MASCULINO"));
		
		
		//mostrando la lista en pantalla
		//System.out.println(lista);
		//para recorrer los elementos de una lista
		//podemos tener una froma declarativa con un ciclo for
		//for
//		for(int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//			
//		}
		//mejor for each
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
//		
		
//		//for each en una sola linea
//		lista.forEach(System.out::println);
//		//los tres for hacen lo mismo.
//		
		//usaremos un for each para filtrar persona por generos
		//agregandolos a lista diltrada
//		for(Persona i:lista) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//				//System.out.println(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
//		
		
		
		//forma imperativa
		/*
		 * solo vamos a solicitando lo que vamos necesitando
		 * api stream
		 */
		
		//filtrando a las personas del genero femeino :V
//		listaFiltrada=lista.stream().filter(i->i.getGenero()
//				.equals("FEMEINO"))
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//ordenaer elementos por edad ascendente
//		listaFiltrada=lista.parallelStream().sorted(Comparator.comparing(Persona::getEdad).reversed()/* reversed() es para ir de final a inicio*/).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
		
//		//Todos cumplen una condicion determinad
//		boolean todos=lista.stream().allMatch(i->i.getEdad()<35);
//		System.out.println(todos);
//		
//		
//		boolean alguno=lista.stream().anyMatch(i->i.getEdad()<30);
//		System.out.println(alguno);
//		//ninguno
//		boolean ninguno=lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//		System.out.println(ninguno);
//		
		
		
		//retornar un valor opcional
		Optional<Persona> menorEdad=lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		
		System.out.println(menorEdad);
		
		//un valor con varias condiciones
		
		Optional<Persona> hombreMayor=lista.stream()
				.filter(i->i.getGenero().equals("MASCULINO"))
				.max(Comparator.comparing(Persona::getEdad));
		System.out.println(hombreMayor);
		//system.out.println(hombre mayor)
		hombreMayor.ifPresent(System.out::println);
		
		
		
	}
	    
		
	
	

}
