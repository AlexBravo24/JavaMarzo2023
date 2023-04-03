package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
//Las expresiones lambda son funciones anónimas que 
//implementan un método de una interface funcional
//Su operador es -> y su sintaxis es:
		//(parámetros)->(cuerpo);
		
//    Metodos pantalla = (nombre)->System.out.println(nombre+"\nHola Mundo");
//		
//	pantalla.mensaje("Luis");

		
// Metodos suma = (a,b) -> System.out.println("La suma es = "+(a-b));
//
// Metodos resta= (a,b)-> System.out.println("La resta es = "+(a-b));
// 
// suma.operacion(9, 5);
// 
// resta.operacion(7, 2);
 
//El API Stream contiene herramuentas que nos ayudan con el flujo
 //flujo de datos de una coleccion
 
 //Originalmente podemos declararlo de esta manera 
 //El flujo de datos o stream no almacena los valores
// Stream<String> nombres =Stream.of("Jesús","Itzel","Eva","Luis")
//		 .filter(s->s.contains("e"));
// List<String> lista = nombres.collect(Collectors.toList());
//System.out.println(lista);

// List<String> lista =  new ArrayList<String>(); //lista original
// List<String> listaFiltrada =  new ArrayList<String>();
// 
// lista.add("Jesús");
// lista.add("Luis");
// lista.add("Lucio");
// lista.add("Eva");
 
 //Asigno el valor de mi lista original a mi lista filtrada 
// listaFiltrada = lista.stream()
//	.filter(x->x.equalsIgnoreCase("lucio"))
//	.collect(Collectors.toList());

// listaFiltrada = lista.stream()
//	.sorted()
//	.collect(Collectors.toList());
// 
// System.out.println(listaFiltrada);
 
 //realizar una lista y agregar los nombres de sus compañeros 
 //y van a crear un Stream y se van a probar algunos métodos que 
 //ustedes consideren útiles
 //Investigar que métodos utilizar en las colecciones
 //(sorted, filter)
 //Ordenar datos, filtran por alguna peticion 
 
// List<String> lista =  new ArrayList<String>(); 
// List<String> listaCompas =  new ArrayList<String>();
// 
// lista.add("Guillermo");
// lista.add("Erika");
// lista.add("Luis Angel");
// lista.add("Eva");
// lista.add("Pedro");
// lista.add("Monserrat");
// lista.add("Rosario");
// lista.add("Maria");
// lista.add("Kevin");
// lista.add("Ariana");
// lista.add("Emmanuel");
// lista.add("Melina");
// lista.add("Oscar");
// 
// listaCompas = lista.stream()
//			.sorted()
//			.collect(Collectors.toList());   //ORDEN ALFABÉTICO
// 
// listaCompas = lista.stream()
//			.sorted()
//			.collect(Collectors.toList());
// 
// 
// System.out.println(listaCompas);
 

//Creamos una lista de nuestro objeto persona
		
	List<Persona>lista = new ArrayList<Persona>();
	List<Persona>listaFiltrada = new ArrayList<Persona>();

	lista.add(new Persona("Eva",25,"Femenino"));
	lista.add(new Persona("Monse",28,"Femenino"));
	lista.add(new Persona("Erick",28,"Masculino"));
	lista.add(new Persona("Luis",26,"Masculino"));
	lista.add(new Persona("Lucio",27,"Masculino"));
	lista.add(new Persona("Guillermo",29,"Masculino"));
	lista.add(new Persona("Pedro",28,"Masculino"));
	lista.add(new Persona("Jesus",26,"Masculino"));
	lista.add(new Persona("Ariana",25,"Femenino"));
	lista.add(new Persona("Erika",26,"Masculino"));
	lista.add(new Persona("Kevin",29,"Masculino"));
	lista.add(new Persona("Emmanuel",22,"Masculino"));
	lista.add(new Persona("Rosario",28,"Femenino"));
	lista.add(new Persona("Oscar",34,"Masculino"));
	
	//Mostrando la lista en pantalla 
	
	System.out.println(lista);
	
	//Para recorrer los elementos de una lista tenemos 
    //Forma declarativa con un ciclo for
	
	//for
	for(int i =0;i<lista.size();i++) {
		System.out.println(lista.get(i));	
	}
	
	//For each
	for (Persona i:lista) {
		System.out.println(i);
	}
	
	//for each en una sola línea
	//lista.forEach(System.out::println);
	
	//for each para filtrar personas por genero
	//agregandolos a la lista filtrada
//	for(Persona i:lista) {
//		if(i.getGenero().equals("Masculino")) {
//			listaFiltrada.add(i);
//		
//			//System.out.println(i);
//		}
//	}
//	listaFiltrada.forEach(System.out::println);
	
	//forma imperativa
	/*Solo vamos solicitando lo que necesitamos
	 * API STREAM 
	 */
	//FILTRANDO A LAS PERSONAS DE GENERO FEMENINO
	
//	listaFiltrada=lista.stream()
//			.filter(i->i.getGenero().equals("Femenino"))
//			.collect(Collectors.toList());
//	
//	listaFiltrada.forEach(System.out::println);
//	
	//ordenas elementos por edad ascendente 
//listaFiltrada = lista.stream()
//.sorted(Comparator.comparing(Persona::getEdad))
//.collect(Collectors.toList());
//listaFiltrada.forEach(System.out::println);

//ordenar elemento pro edad descendente
//listaFiltrada = lista.stream()
//.sorted(Comparator.comparing(Persona::getEdad).reversed())
//.collect(Collectors.toList());
//listaFiltrada.forEach(System.out::println);	
//	
//  //Todos cumplen una condición determinada 
//boolean todos = lista.stream().allMatch(i->i.getEdad()<30);
//System.out.println(todos);
//
//	 //algunos cumplen con una condición determinada
//boolean algunos = lista.stream().anyMatch(i->i.getEdad()<30);
//System.out.println(algunos);
//
//    //Si ninguno cumple la condición
//boolean ninguno = lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//System.out.println(ninguno);

	//Retornar un valor opcional
	Optional<Persona> menorEdad=lista.stream()
		.min(Comparator.comparing(Persona::getEdad));
	System.out.println(menorEdad);
	
	//un valor con varias condiciones
	Optional<Persona> hombreMayor=lista.stream()
			.filter(i->i.getGenero().equals("MASCULINO"))
			.max(Comparator.comparing(Persona::getEdad));
	//	System.out.println(hombreMayor);
	hombreMayor.ifPresent(System.out::println);

		 


		
	}

}
