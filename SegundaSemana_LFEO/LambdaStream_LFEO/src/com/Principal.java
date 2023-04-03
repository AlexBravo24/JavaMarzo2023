package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Las expreiones Lambda son funciones anonimas
		//que implementan un metodo de una interface funcional
		//su operador es -> y su sintaxis es (parametros)->{(Cuerpo)}
		
//		Metodos pantalla = (nombre)->System.out.println(nombre+"\nHOLA MUNDO");
//		
//		pantalla.mensaje("LUCIO FABIAN");
		
//		Metodos suma = (a,b)->System.out.println("LA SUMA ES IGUAL A :"+(a+b));
//		Metodos resta = (a,b)->System.out.println("LA RESTA ES IGUAL A :"+(a-b));
		
//		suma.operacion(9, 5);
//		
//		resta.operacion(7, 2);
		
		//EL API Stream contiene herramientas con el flujo de datos de una collecion
		
		//Originalmente podemos declararlo de esta manera
		//El flujo de datos o Stream, no almacena los vaores
//		Stream<String> nombres = Stream.of("JESUS","ITZEL","EVA","LUIS")
//				.filter(s->s.contains("E"));
//		
//		List<String> lista = nombres.collect(Collectors.toList());
//		System.out.println(lista);
		
//		List<String> lista = new ArrayList<String>();
//		List<String> listaFiltrada = new ArrayList<String>();
//		
//		lista.add("Jesus");
//		lista.add("Luis");
//		lista.add("Lucio");
//		lista.add("Eva");
//		
		//Asigno el valor de mi lista original a mi lista filtrada
		
//		listaFiltrada=lista.stream()
//				.filter(x->x.equalsIgnoreCase("lucio"))
//				.collect(Collectors.toList());
		
//		listaFiltrada=lista.stream().
//				sorted() //para ordenar por letra inicial conforme al abecedario
//				.collect(Collectors.toList());
//		
//		System.out.println(listaFiltrada);
		
		//Realizar una lista y agregar los nombres de sus compa;eros
		//y crear un stream y van a probar algunos metodos 
		//que ustedes consideren utiles
		//Investigar que metodos podemos utilizar en las coleccions (sorted, filter)
		//Ordenan datos, filtran por alguna peticion
		
//		List<String> listaceteq = new ArrayList<String>();
//		List<String> listafiltradaceteq = new ArrayList<String>();
//		
//		listaceteq.add("Rosario");
//		listaceteq.add("Lucio");
//		listaceteq.add("Ariana");
//		listaceteq.add("Emmanuel");
//		listaceteq.add("Eva");
//		listaceteq.add("Gues");
//		listaceteq.add("Guillermo");
//		listaceteq.add("Erika");
//		listaceteq.add("Jorge");
//		listaceteq.add("Kevin");
//		listaceteq.add("Luis");
//		listaceteq.add("Melina");
//		listaceteq.add("Monse");
//		listaceteq.add("Oscar");
//		listaceteq.add("Pedro");
//		listaceteq.add("Maria");
//		listaceteq.add("Maria");
//		
//		listafiltradaceteq = listaceteq.stream()
//				.sorted() //para ordenar por letra inicial conforme al abecedario
//				.collect(Collectors.toList());
//		System.out.println("ORDENADOS ALFABETICAMENTE:");
//		System.out.println(listafiltradaceteq+"\n");
//		
//		listafiltradaceteq = listaceteq.stream()
//				.sorted((x,y)-> y.compareTo(x))//Ordena alfabeticamente invertida
//				.collect(Collectors.toList());                    
//		System.out.println("ORDENADOS ALFABETICAMENTE INVERTIDAS:");
//		System.out.println(listafiltradaceteq+"\n");
//		
//		listafiltradaceteq = listaceteq.stream()
//				.distinct()//Muestra todos los elementos conforme al orden de la lista, si un elemento se repite solo
//				.collect(Collectors.toList());                    //accedde a este una vez
//		System.out.println("ORDENADOS CONFORME A LA LISTA PERO SOLO UNA VEZ IMPRIME ELEMNTOS REPETIDOS:");
//		System.out.println(listafiltradaceteq+"\n");
//		
//	
		
		
		//CREAMOS UNA LISTA DE NUESTRO OBJETO PERSONA
		List<Persona> lista = new ArrayList<Persona>();
		
		//creamos una lista para mostrar valores filtrados
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		lista.add(new Persona("Eva",25, "FEMENINO"));
		lista.add(new Persona("Monse",28, "FEMENINO"));
		lista.add(new Persona("Erick",28, "MASCULINO"));
		lista.add(new Persona("Luis",26, "MASCULINO"));
		lista.add(new Persona("LUCIO",27, "MASCULINO"));
		lista.add(new Persona("Guillermo",29, "MASCULINO"));
		lista.add(new Persona("Pedro",28, "MASCULINO"));
		lista.add(new Persona("Jesus",26, "MASCULINO"));
		lista.add(new Persona("Ariana",25, "FEMENINO"));
		lista.add(new Persona("Erika",26, "FEMENINO"));
		lista.add(new Persona("Kevin",24, "MASCULINO"));
		lista.add(new Persona("Emmanuel",22, "MASCULINO"));
		lista.add(new Persona("Rosario",28, "FEMENINO"));
		lista.add(new Persona("Oscar",34, "MASCULINO"));
		
		
		//mostrando la lista en pantalla
		//System.out.println(lista);
		
		//Recorrer lo selementos de una listapodemos tener una forma declartiva
		//con un ciclo for
		
		//FOR
		
//		for(int i=0; i<lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		//FOR each
//		for(Persona i:lista) {
//			System.out.println(i);
//		}
		
		
		//FOR each en un a sola linea
		//lista.forEach(System.out::println);
		
		
		//For ecah para filtrar a las perosnas por genero agregandolos a la lista filtrada
		
//		for(Persona i: lista) {
//			if(i.getGenero().equals("MASCULINO")) {
//				listaFiltrada.add(i);
//				
//				//System.out.println(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
		
		//Forma imperativa
		/*Solo vamos solicitando lo que vamos necesitando
		 * API Stream
		 * */
		
		//FILTRANDO A LAS PERSONAS DEL GENERO FEMENINO
//		listaFiltrada = lista.stream().filter(i->i.getGenero()
//				.equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		listaFiltrada.forEach(System.out::println);
		
		//ORDENAR ELEMNTOS POR EDAD DE FORMA ASCENDENTE
//		listaFiltrada = lista.parallelStream()
//				.sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//				 
//		listaFiltrada.forEach(System.out::println);
		
		//ORDENAR ELEMENTOA POR EDAD descendente
//		listaFiltrada = lista.parallelStream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//				 
//		listaFiltrada.forEach(System.out::println);
		
		//TODOSCUMPLEN CON UNA CONDOICION DETERMINADA
//		boolean todos = lista.stream().allMatch(i->i.getEdad()<30);
//		System.out.println(todos);
//		
//		//ALGUNO CUMPLE ALGUNA CONDICION DETERMINADA
//		boolean alguno = lista.stream().anyMatch(i->i.getEdad()<30);
//		System.out.println(alguno);
//		
//		//SI NINGUNO CUMPLE LA CONDICION
//		boolean ninguno = lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//		System.out.println(ninguno);
//		
		//RETORNAR UN VALOR OPCIONAL
		Optional<Persona> menorEdad=lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		//RETORNAR UN VALOR CON VARIAS CONDICIONES
		Optional<Persona> hombreMayor = lista.stream()
				.filter(i->i.getGenero().equals("MASCULINO"))
				.max(Comparator.comparing(Persona::getEdad));
		//System.out.println(hombreMayor);
		hombreMayor.ifPresent(System.out::println);
				

		

	}

}
