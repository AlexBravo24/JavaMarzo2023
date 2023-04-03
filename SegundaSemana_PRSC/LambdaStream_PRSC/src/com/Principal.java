package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//Las expresiones lambda son funciones anónimas
		//que implementan un método de una interface funcional
		//Su operadar es-> y su sintaxis es (parámetros->(Cuerpo)
		
//		Métodos pantalla = (nombre)->System.out.println(nombre+"\nHola Mundo");
//		
//		pantalla.mensaje("Alejandro");
		
		Métodos suma = (a,b)->System.out.println("La suma es = "+(a+b));
		Métodos resta = (a,b)->System.out.println("La resta es = "+(a-b));
		
//		suma.operación(16, 8);
//		
//		resta.operación(7, 2);
		
		//El API Stream contiene herramientas que nos ayudan con el flujo
		//de datos de una colección
		
		
		//Originalmente podemos declararlo de esta manera
		//El flujo de datos o Stream, no almacena los valores
//		Stream<String> nombres = Stream.of("Jesús","Itzel","Eva","Luis")
//				.filter(s->s.contains("e"));
//		
//		List<String> Lista = nombres.collect(Collectors.toList());
//		System.out.println(Lista);
		
//		List<String> Lista = new ArrayList<String>(); //Lista Original
//		List<String> ListaFiltrada = new ArrayList<String>();
//		
//		Lista.add("Jesús");
//		Lista.add("Luis");
//		Lista.add("Lucio");
//		Lista.add("Eva");
//		
//		//Asigno el valor de mi lista original a mi lista filtrada
//		
//		ListaFiltrada=Lista.stream()
//				.sorted()
//				.collect(Collectors.toList());
//		
//		System.out.println(ListaFiltrada);
		
		//Realizar una Lista y van a agregar los nombres de sus compañeros
		//Y van a crear un stream y van a probar algunos métodos
		//que ustedes consideren útiles
		//Investigar que métodos podemos utilizar en las colecciones (sorted, filter)
		//Ordenan datos, filtran por alguna petición
		
//		List<String> Lista = new ArrayList<String>(); //Lista Original
//		List<String> ListaFiltrada = new ArrayList<String>();
//		
//		Lista.add("Angel Velazquez");
//		Lista.add("Emmanuel Dueñas");
//		Lista.add("Guillermo Hernandez");
//		Lista.add("Jesus Aguilar");
//		Lista.add("Lucio Escobar");
//		Lista.add("Monse Venegas");
//		Lista.add("Rosario Cervantes");
//		Lista.add("Pedro Salazar");
//		Lista.add("Maria Velazquez");
//		Lista.add("Oscar Martinez");
//		Lista.add("Luis Ronzon");
//		Lista.add("Jorge Bravo");
//		Lista.add("Erika Hernandez");
//		Lista.add("Eva Couturier");
//		Lista.add("Ariana Osorio");
//		
//		ListaFiltrada = Lista.stream()
//				.filter(s->s.length()>14)
//				.collect(Collectors.toList());
//		System.out.println(ListaFiltrada);
//		
//		ListaFiltrada=Lista.stream()
//				.sorted()
//				.collect(Collectors.toList());
//		System.out.println(ListaFiltrada);
//		
//		ListaFiltrada=Lista.stream()
//				.limit(8)
//				.collect(Collectors.toList());
//		System.out.println(ListaFiltrada);
		
		//Creamos una lista de nuestro objeto Persona
		
		List<Persona> lista = new ArrayList<Persona>();
		
		//Creamos una lista para mostrar valores filtrados
		List<Persona> ListaFiltrada = new ArrayList<Persona>();
		
		
		lista.add(new Persona("Eva",25,"FEMENINO"));
		lista.add(new Persona("Monse",28,"FEMENINO"));
		lista.add(new Persona("Erick",28,"MASCULINO"));
		lista.add(new Persona("Luis",26,"MASCULINO"));
		lista.add(new Persona("Lucio",27,"MASCULINO"));
		lista.add(new Persona("Guillermo",29,"MASCULINO"));
		lista.add(new Persona("Pedro",28,"MASCULINO"));
		lista.add(new Persona("Jesús",26,"MASCULINO"));
		lista.add(new Persona("Ariana",25,"FEMENINO"));
		lista.add(new Persona("Erika",26,"FEMENINO"));
		lista.add(new Persona("Kevin",24,"MASCULINO"));
		lista.add(new Persona("Emmanuel",22,"MASCULINO"));
		lista.add(new Persona("Rosario",28,"FEMENINO"));
		lista.add(new Persona("Oscar",34,"MASCULINO"));
		
		//mostrando la lista en pantalla
//		System.out.println(lista);
		
		//Recorrer los elementos de una lista
		//Forma declarativa con un ciclo for
		
		//For
//		for (int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
		
		//For each
//		for (Persona i:lista) {
//			System.out.println(i);
//		}
		
		//For each en una sola línea
//		lista.forEach(System.out::println);
		
		//For each para filtrar a las personas por genero
		//agregandolos a la lista filtrada
		
//		for(Persona i:lista) {
//			if(i.getGenero().contentEquals("MASCULINO")) {
//				ListaFiltrada.add(i);
//				//System.out.println(i);
//			}
//		}
//		ListaFiltrada.forEach(System.out::println);
		
		//Forma imperativa
		/*Sólo vamos solicitando lo que vamos necesitando
		 * API Stream
		 */
		//Filtrando a las personas del genero femenino
//		ListaFiltrada=lista.stream()
//				.filter(i->i.getGenero().contentEquals("FEMENINO"))
//				.collect(Collectors.toList());
//		ListaFiltrada.forEach(System.out::println);
//		
		//Ordenar elementos por edad ascendente
//		ListaFiltrada=lista.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		ListaFiltrada.forEach(System.out::println);
		
//		ListaFiltrada=lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		ListaFiltrada.forEach(System.out::println);
		
		//Todos cumplen una condición determinada
		
//		boolean todos = lista.stream().allMatch(i->i.getEdad()<30);
//		System.out.println(todos);
//		
//		//Algunos cumplen una condición determinada
//		
//		boolean alguno = lista.stream().anyMatch(i->i.getEdad()<30);
//		System.out.println(alguno);
//		
//		//Si ninguno cumple la condición
//		boolean ninguno = lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//		System.out.println(ninguno);
		
		//Retornar un valor opcional
		Optional<Persona> menorEdad=lista.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//Un valor con varias condiciones
		Optional <Persona> hombreMayor = lista.stream()
				.filter(i->i.getGenero().equals("MASCULINO"))
				.max(Comparator.comparing(Persona::getEdad));
		System.out.println(hombreMayor);
		hombreMayor.ifPresent(System.out::println);
	}

}
