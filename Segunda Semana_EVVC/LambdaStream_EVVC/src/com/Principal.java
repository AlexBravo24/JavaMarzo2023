package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones Lambda son funciones an�nimas que implementan un m�todo de una interface
		//funcional, su operador es -> y su sintaxis es (parametros)->{(Cuerpo)}
		
//		M�todos pantalla = (nombre)-> System.out.println(nombre+" es increible");
//		
//		pantalla.mensaje("Eva");
		
//		M�todos suma = (a , b)-> System.out.println("La suma es igual a: "+(a+b));
//		M�todos resta =(a,b)->System.out.println("La resta es igual a: " + (a-b));
////		suma.operaci�n(16,15);
////		resta.operaci�n(7,2);
//		
//		//El API Stream contiene herramientas que nos ayudan con el flujo de datos que tiene una
//		//colecci�n
//		
//		//Originalmente podemos declararlo de esta manera:
//		//El flujo de datos o Stream no almacena los valores
////		Stream <String>nombres = Stream.of("Jesus","Itzel","Eva","Luis").
////				filter(s->s.contains("e"));
////		List<String>lista=nombres.collect(Collectors.toList());
////		System.out.println(lista);
////		
//		List<String> lista = new ArrayList<String>();
//		List<String> listaFiltrada = new ArrayList<String>();
//		
//		lista.add("Jesus");
//		lista.add("Luis");
//		lista.add("Lucio");
//		lista.add("Eva");
//		
//		//Asigno el valor de mi lista original a mi lista filtrada
////		listaFiltrada=lista.stream().filter(s->s.equalsIgnoreCase("lucio")).collect(Collectors.toList());
////		System.out.println(listaFiltrada);
//		
//		listaFiltrada=lista.stream().sorted().collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
		//Realizar una lista, agregar los nombres de los compa�eros y crear un stream y filtrar la 
		//informaci�n porbando algunos m�todos que consideremos utili. Investigar que m�todos podemos
		//utilizar en las colecciones como sorted, filter
		//filtrar por alguna petici�n

		List <String> compa�eros = new ArrayList <>();
		List <String> compa�eros2 = new ArrayList<>();
		compa�eros.add("Angel Velazquez");
		compa�eros.add("Eva Couturier");
		compa�eros.add("Guillermo Hern�ndez");
		compa�eros.add("Ariana Osorio");
		compa�eros.add("Erika Hern�ndez");
		compa�eros.add("Luis Ronz�n");
		compa�eros.add("Monse Venegas");
		compa�eros.add("Erick Velazquez");
		compa�eros.add("Pedro Salazar");
		compa�eros.add("Emmanuel Due�as");
		compa�eros.add("Jesus Aguilar");
		compa�eros.add("Lucio Escobar");
		compa�eros.add("Oscar Mart�nez");
		compa�eros.add("Rosario Cervantes");
		
		
//		//Count - Nos dice cuantos elementos hay
//		System.out.println("El n�mero de copa�eros es: "+compa�eros.stream().count());
//		
//		//findFirst - 
//		System.out.println(compa�eros.stream().findFirst());
//		
		
		
		/*Creamos una lista de  nuestro objeto persona
		 * 
		 */
		
		List<Persona> lista=new ArrayList <Persona>();
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		lista.add(new Persona ("Eva",25,"Femenino"));
		lista.add(new Persona ("Monse",28,"Femenino"));
		lista.add(new Persona ("Erick",28,"Masculino"));
		lista.add(new Persona ("Luis",26,"Masculino"));
		lista.add(new Persona ("Lucio",27,"Masculino"));
		lista.add(new Persona ("Guillermo",29,"Masculino"));
		lista.add(new Persona ("Pedro",28,"Masculino"));
		lista.add(new Persona ("Jesus",26,"Masculino"));
		lista.add(new Persona ("Ariana",25,"Femenino"));
		lista.add(new Persona ("Erika",26,"Femenino"));
		lista.add(new Persona ("Kevin",24,"Masculino"));
		lista.add(new Persona ("Emmanuel",22,"Masculino"));
		lista.add(new Persona ("Rosario",28,"Femenino"));
		lista.add(new Persona ("Oscar",34,"Masculino"));
	
		//System.out.println(lista);
		
		//Para recorrer los elementos de una lista 
		//Forma declarativa con un ciclo for
		
//		for (int i=0;i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
//		
		//For each
//		for(Persona i : lista) {
//			System.out.println(i);
//		}
		
		//For each en una sola l�nea
		//lista.forEach(System.out::println );
		
		//For each para filtrar las personas por g�nero, agregandolos a la lista fiiltrada
		
//		for(Persona i: lista) {
//			if(i.getGenero().equals("Masculino")) {
//				listaFiltrada.add(i);
//				//System.out.println(i);
//				}
//		}
//		listaFiltrada.forEach(System.out::println);
		
		/*Forma imperativa
		 * Solo vamos solicitando lo que vamos necesitamdo
		 * API Stream
		 */
		//Filtrando a las personas de genero femenino	
//		listaFiltrada=lista.stream().filter(i->i.getGenero().equals("Femenino")).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
//		//Ordenar elementos por edad ascendente
//		listaFiltrada=lista.parallelStream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
		
		//Ordenar elementos por edad descendente
//				listaFiltrada=lista.parallelStream().sorted(Comparator.comparing(Persona::getEdad).reversed()).collect(Collectors.toList());
//				listaFiltrada.forEach(System.out::println);
		
//		//Todos cumplen una condici�n determinada
//		 boolean todos = lista.stream().allMatch(i->i.getEdad()<35);
//		System.out.println(todos);

		
		//Alguno cumple una condici�n determinada
//		 boolean alguno = lista.stream().anyMatch(i->i.getEdad()==22);
//		System.out.println(alguno);
		
		//ninguno cumple una condici�n determinada
//		 boolean ninguno = lista.stream().anyMatch(i->i.getNombre().contentEquals("Eva"));
//		System.out.println(ninguno);
		
		//Retornar un valor opcional
		Optional<Persona>menorEdad=lista.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		Optional<Persona>mayorEdad=lista.stream().max(Comparator.comparing(Persona::getEdad));
		System.out.println(mayorEdad);
		
		//Un valor con varias condiciones
		Optional<Persona> hombreMayor = lista.parallelStream().filter(i->i.getGenero().equals("Masculino")).max(Comparator.comparing(Persona::getEdad));
		System.out.println(hombreMayor);
		hombreMayor.ifPresent(System.out::println);
	}

}
