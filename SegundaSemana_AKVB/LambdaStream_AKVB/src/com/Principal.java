package com;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {
	
	/*
	 * Las expresiones lambda son funciones
	 * anónimas que implementan un método de
	 * una interface funcional.
	 * 
	 * Su operador es -> y su sintaxis es
	 * (parámetros) -> {cuerpo}
	 */
	
	public static void main(String[] args) {
		/*
		 *	Metodos pantalla = (nombre)->System.out.println("Hola Mundo\n" + nombre);
		 *	pantalla.mensaje("Luis");
		 *
		 * Las interfaces funcionales sólo
		 * pueden tener un método.
		 */
		Metodos suma = (a, b)->System.out.println(a + " + " + b + " = " + (a+b));
		Metodos resta = (a,b)->System.out.println(a + " - " + b + " = " + (a-b));
		suma.operacion(9, 5);
		resta.operacion(7, 2);
		
		/*
		 * El API Stream contiene herramientas que
		 * nos ayudan con el flujo de datos de una
		 * coleccion.
		 * 
		 * Originalmente podemos declararlo de esta manera.
		 * El flujo de datos de Stream no almacena 
		 * los valores.
		 */
		
//		Stream<String> nombres = Stream.of("Jesus", "Itzel", "Eva", "Luis")
//				.filter(s -> s.contains("l"));
//		
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		List<String> lista = new ArrayList<String>();	//Lista Original
		List<String> listaFiltrada = new ArrayList<String>();
		
		lista.add("Jesús");
		lista.add("Luis");
		lista.add("Lucio");
		lista.add("Eva");
		
		//Asigno el valor de mi lista original a mi lista filtrada
		
//		listaFiltrada = lista.stream()
//				.filter(x->x.equalsIgnoreCase("lucio"))
//				.collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
		listaFiltrada = lista.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(listaFiltrada);
		
		/*
		 * Crear una lista y agregar los nombres de 
		 * sus compañeros y crear un stream. Probar
		 * métodos de API Stream que se consideren
		 * útiles.
		 * 
		 * Investigar qué métodos podemos utilizar
		 * en las colecciones (sorted, filter).
		 * Ordenar datos, filtrar por alguna petición.
		 * 
		 */
		
		/* Creamos una lista de nuestro objeto persona.*/
		
		List<Persona> list_a = new ArrayList<Persona>();
		
		/* Creamos una lista para mostrar valores filtrados. */
		
		List<Persona> a_Filtrada = new ArrayList<Persona>();
		List<Persona> b_Filtrada = new ArrayList<Persona>();
		List<Persona> c_Filtrada = new ArrayList<Persona>();
		
		list_a.add(new Persona ("Eva", 25, "Femenino"));
		list_a.add(new Persona ("Monse", 28, "Femenino"));
		list_a.add(new Persona ("Erick", 28, "Masculino"));
		list_a.add(new Persona ("Luis", 26, "Masculino"));
		list_a.add(new Persona ("Lucio", 27, "Masculino"));
		list_a.add(new Persona ("Guillermo", 29, "Masculino"));
		list_a.add(new Persona ("Pedro", 28, "Masculino"));
		list_a.add(new Persona ("Jesús", 26, "Masculino"));
		list_a.add(new Persona ("Ariana", 25, "Femenino"));
		list_a.add(new Persona ("Erika", 26, "Femenino"));
		list_a.add(new Persona ("Kevin", 24, "Masculino"));
		list_a.add(new Persona ("Emmanuel", 22, "Masculino"));
		list_a.add(new Persona ("Rosario", 28, "Masculino"));
		list_a.add(new Persona ("Oscar", 34, "Masculino"));
		
		/* Mostrando la lista en pantalla */
		
		//System.out.println(list_a);
		
		/* Recorrer los elementos de una lista con un ciclo for*/
		
		for(int i = 0; i < list_a.size(); i++) {
//			System.out.println(list_a.get(i));
		}
		
		/* For each */
		for(Persona i:list_a) {
//			System.out.println(i);
		}
		
		/* For each en una sola línea */
		/* list_a.forEach(System.out::println); */
		
		/* For each para filtrar a las personas por genero agregandolos a la lista filtrada*/
		
		for(Persona i:list_a) {
//			if(i.getGenero().equals("Masculino")) {
//				System.out.println(i);
//				a_Filtrada.add(i);
//			}
		}
		a_Filtrada.forEach(System.out::println);
		
		/*
		 * FORMA IMPERATIVA
		 * Sólo vamos solicitando lo que se necesita, gracias al API Stream.
		 * 
		 * Filtrando a las personas de género femenino.
		 */
		
		a_Filtrada = list_a.stream()
				.filter(i->i.getGenero().equals("Femenino"))
				.collect(Collectors.toList());
//		a_Filtrada.forEach(System.out::println);
		
		/* Elementos por edad ascendente*/
		
		b_Filtrada = list_a.stream()
				.sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		
		//b_Filtrada.forEach(System.out::println);
		
		/* Elementos por edad descendente */ 
		
		c_Filtrada = list_a.stream()
				.sorted(Comparator.comparing(Persona::getEdad).reversed())
				.collect(Collectors.toList());
		
//		c_Filtrada.forEach(System.out::println);
		
		/* Si todos cumplen la condición */
		boolean todos = list_a.stream().allMatch(i -> i.getEdad()< 30);
		System.out.println("¿Todos menor que 30? " + todos);
		
		/* Si alguno cumple la condición */
		boolean alguno = list_a.stream().anyMatch(i -> i.getEdad()<30);
		System.out.println("¿Alguno mayor que 30? " + alguno);
		
		/* Si ninguno cumple la condición */
		boolean ninguno = list_a.stream().anyMatch(i -> i.getNombre().equals("Alejandro"));
		System.out.println("¿Algún Alejandro? " + ninguno);
		
		/* Retornar un valor opcional */
		Optional<Persona> menorEdad = list_a.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		/* Valor opcional con varias condiciones */
		Optional<Persona> hombreMayor = list_a.stream()
				.filter(i -> i.getGenero().equals("Masculino"))
				.max(Comparator.comparing(Persona::getEdad));
//		System.out.println(hombreMayor);
		hombreMayor.ifPresent(System.out::println);
	}
}
