package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lambda son funciones anonimas que 
		//implementan un metodo de una interface funcional
		//Su operador es -> y su sintaxis es (Parametros)->{(Cuerpo)}

		//Metodos pantalla = (nombre)->System.out.println(nombre+"\nHola mundo");
		
		//pantalla.mensaje("Luis");
		
		//Metodos suma = (a,b)->System.out.println("La suma es: "+(a+b));
		//Metodos resta = (a,b)->System.out.println("La resta es: "+(a-b));
		//Metodos multiplicacion = (a,b)->System.out.println("La multiplicacion es: "+(a*b));
		//Metodos divicion = (a,b)->System.out.println("La divicion es: "+(a/b));

		//suma.operacion(16, 15);
		//resta.operacion(10, 8);
		//multiplicacion.operacion(5, 8);
		//divicion.operacion(8, 2);
		
		//El API stream contiene herramientas que nos ayudan con el flujo de datos
		//de una coleccion
		
		//originalmente podemos declararlo de esta manera
		//El flujo de datos o Stream no almacena los valores
//		Stream<String>nombres=Stream.of("Jesus","Itzel","Eva","Luis")
//				.filter(s->s.contains("e"));
//		
//		List <String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
		List <String> lista= new ArrayList <String> ();
		List <String> listaFiltrada= new ArrayList <String> ();
		
		lista.add("Jesus");
		lista.add("Luis");
		lista.add("Lucio");
		lista.add("Eva");
		
		//Asigno el valor de mi lista original a mi lista filtrada
		
//		listaFiltrada = lista.stream()
//				.filter(x->x.contains("s"))
//				.collect(Collectors.toList());
		
//		listaFiltrada = lista.stream()
//				.sorted()
//				.collect(Collectors.toList());
//		
//		System.out.println(listaFiltrada);
		
		//Realizar una lista y van a agregar los nombres de todos los compañeros
		//y van a crear un String y van a probar algunos metodos
		//que ustedes consideren utiles
		//investigar que metodos podemos utilizar en las colecciones (Sorted, Filter)
		//Ordenar datos, filtran por alguna peticion
		
		//Creamos una lista de nuestro objeto Persona
		
		List <Persona> list = new ArrayList<Persona>();
		
		//Creamos una lista para mostrar los valores filtrados
		List <Persona> listF = new ArrayList<Persona>();
		
		list.add(new Persona ("Eva",25,"FEMENINO"));
		list.add(new Persona ("Monse",28,"FEMENINO"));
		list.add(new Persona ("Erick",28,"MASCULINO"));
		list.add(new Persona ("Luis",26,"MASCULINO"));
		list.add(new Persona ("Lucio",27,"MASCULINO"));
		list.add(new Persona ("Guillermo",29,"MASCULINO"));
		list.add(new Persona ("Pedro",28,"MASCULINO"));
		list.add(new Persona ("Jesús",26,"MASCULINO"));
		list.add(new Persona ("Ariana",25,"FEMENINO"));
		list.add(new Persona ("Erika",26,"FEMENINO"));
		list.add(new Persona ("Kevin",24,"MASCULINO"));
		list.add(new Persona ("Emmanuel",22,"MASCULINO"));
		list.add(new Persona ("Rosario",28,"FEMENINO"));
		list.add(new Persona ("Oscar",34,"MASCULINO"));
		
		//Mostrando la lista en pantalla
		//System.out.println(list);
		
		//Recorrer los elementos de una lista
		//Forma declarativa con un ciclo for
		
		//For
		//for(int i=0;i<list.size();i++) {
		//	System.out.println(list.get(i));
		//}
		
		//For Each
//		for (Persona i:list) {
//			System.out.println(i);
//		}
		
		//For Each en una sola linea
		//list.forEach(System.out::println);
		
		//For Each para filtrar a las personas por genero
		//agreegandolos a la lista filtrada
		
//		for (Persona i: list) {
//			if (i.getGenero().equalsIgnoreCase("MASCULINO")) {
//				listF.add(i);
//				//System.out.println(i);
//			} listF.forEach(System.out::println);
//		}
		
		/*
		 * Forma imperativa
		 * solo vamos solicitando lo que vamos necesitando
		 * API stream
		 */
		//Filtrando por genero femenino
//		listF = list.stream()
//				.filter(i->i.getGenero().equalsIgnoreCase("femenino"))
//				.collect(Collectors.toList());
//		listF.forEach(System.out::println);
		
		//Ordenar elementos por edad ascendente
//		listF = list.stream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		listF.forEach(System.out::println);
		
		//Ordenar elementos por edad decendente
//		listF = list.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listF.forEach(System.out::println);
		
		//Todos cumplen una condicion determinada
//		boolean todos = list.stream().allMatch(i->i.getEdad()<30);
//		System.out.println(todos);
		
		//Alguno cumplen una condicion determinada
//		boolean alguno = list.stream().anyMatch(i->i.getEdad()<30);
//		System.out.println(alguno);
		
		//Si ninguno cumple la condicion
//		boolean ninguno = list.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//		System.out.println(ninguno);
		
		//Retonar un valor opcional
		Optional <Persona> menorEdad = list.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//Un valos con varias condiciones
		Optional <Persona> hombreMayor = list.stream()
				.filter(i->i.getGenero().equalsIgnoreCase("Masculino"))
				.max(Comparator.comparing(Persona::getEdad));
		//System.out.println(hombreMayor);
		hombreMayor.ifPresent(System.out::println);
		
	}

}
