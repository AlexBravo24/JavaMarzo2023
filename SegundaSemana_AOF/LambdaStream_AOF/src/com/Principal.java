package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones lambda son expresiones anonimas 
		//que implementas un metodo de una interfaz  funcional
		//su operador es -> 
		//y su  sintaxis es (parametro)->{(cuerpo)}
		
		
//		
//		
//		Metodos pantalla = (nombre)->System.out.println(nombre+"\n Hola");
//		pantalla.mensaje("ARIANA");
//		//pantalla.mensaje("Vic");
//		
		
//	Metodos operacion = (a,b)->System.out.println("la suma es = " +(a+b));	
//		operacion.sumar(16, 15);
		
		//El api stream contiene herramientas que nos ayudan
		//con el flujo de datos d euna coleccion
		//originalmente  podemos declararlo de esta manera
		
		//El flujo de datos o stream no almacena los valorea
//		
//		Stream<String> nombres = Stream.of("Jesus","Itzel","Eva","Luis")
//				.filter(s->s.contains("e")); //letra s indica stream
//		//los stream solomuestranno guardan
//		//se guardan en lista
//		
//		List<String> lista = nombres.collect(Collectors.toList());
//		
//		System.out.println(lista);
		
		
		//otro ejemplo
//		List <String> lista = new ArrayList<String>();//lista original
//		List <String> listaFiltrada = new ArrayList<String>();
//		
//		lista.add("Emmanuel");
//		lista.add("Erick");
//		lista.add("Guillermo");
//		lista.add("Eva");
//		lista.add("Erika");
//		lista.add("Jesus");
//		lista.add("Jorge");
//		lista.add("Kevin");
//		lista.add("Lucio");
//		lista.add("Melina");
//		lista.add("Monse");
//		lista.add("Oscar");
//		lista.add("Pedro");
//		lista.add("Rosario");
//		lista.add("Ariana");
		//asigno el valor de milista original a mi lista filtrada
		
		
		
											///.equalsIgnoreCase("Ari")
//        ///.
//		listaFiltrada=lista.stream().filter(x->x.contains("J")).collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
		//ordena los datos albaeticamente horizontal
//		listaFiltrada=lista.stream()
//				.sorted()
//				.collect(Collectors.toList());
//		System.out.println(listaFiltrada);
		
		//metodo sorted (ordena alfabeticamente vertical)
		
		    
       //  lista.stream().sorted().forEach(System.out::println);
        // Comparator y comparing // ordena los datos
        // lista.stream().sorted(Comparator.comparing(lista::getlistaFiltrada)).forEach(System.out::println);
         
				
      //   lista.forEach( (n) -> { System.out.println(n); } );//cada elemnto de la lista
	
	/////ejercicio persona///
		
		
		
		//CREAMOS UNA LISTA DE NUESTRO OBJETO PERSONA
		List<Persona> lista =new ArrayList<Persona>();
	List <Persona> listaFiltrada =new ArrayList<Persona>();
	lista.add(new Persona("Eva",25,"FEMENINO"));
	lista.add(new Persona("Monse",26,"FEMENINO"));
	lista.add(new Persona("Erick",28,"MASCULINO"));
	lista.add(new Persona("Luis",26,"MASCULINO"));
	lista.add(new Persona("Lucio",26,"MASCULINO"));
	lista.add(new Persona("Guillermo",29,"FEMENINO"));
	lista.add(new Persona("Pedro",25,"MASCULINO"));
	lista.add(new Persona("Jesus",26,"MASCULINO"));
	lista.add(new Persona("Ariana",25,"FEMENINO"));
	lista.add(new Persona("Erika",26,"FEMENINO"));
	lista.add(new Persona("Kevin",24,",MASCULINO"));
	lista.add(new Persona("Emmanuel",22,"MASCULINO"));
	lista.add(new Persona("Rosario",25,"FEMENINO"));
	lista.add(new Persona("Oscar",34,"MASCULINO"));
	
	//mostrando la lista en pantala nada mas
	//System.out.println(lista);
	
	//para recorrer los elementos dela lista
	//forma declarativa con un ciclo for
	
	//FOR
//	for(int i=0;i<lista.size();i++) {
//		System.out.println(lista.get(i));
//	}
	
	//FOR EACH
//	for(Persona i:lista) {
//		System.out.println(i);
//	}
	
	//FOR EACH EN UNA SOLA LINEA
	//lista.forEach(System.out::println);
	
	//gracias a lo getter podemos filtrar por datos que se requieren
	//CON FOR EACH  agrgandolos a la lista filtrada
//	
	//for(Persona i: lista) {
	//	if(i.getGenero().equals("MASCULINO")){
	//	listaFiltrada.add(i);
	
	//	System.out.println(i);
		//}
	//}
	
	//listaFiltrada.forEach(System.out::println);
	//termina for each
	
	
	//FORMA IMPERATIVA
	//SOLO VAMOS SOLICITANDO LO QUE SE VA NECESITANDO
	//API Stream
	
	//filtrando al genero femenino
//	listaFiltrada=lista.stream()
//			.filter(i->i.getGenero()
//			.equals("FEMENINO"))
//			.collect(Collectors.toList());
//	listaFiltrada.forEach(System.out::println);
	
	//ORDENAR ELEMENTOS POR EDAD ASCENDENTE
	
//	listaFiltrada=lista.stream()						//.reversed() para forma descendente...solo se agrega 
//			.sorted(Comparator.comparing(Persona::getEdad).reversed())
//			.collect(Collectors.toList());
//	
//	listaFiltrada.forEach(System.out::println);
//	
	
	//MOSTRAR CUANDO TODOS CUMPLEN UNA CONDICION DETERMINADA allaMatch
//	boolean todos=lista.stream().allMatch(i->i.getEdad()<30);
//	System.out.println(todos);
	
	//Si alguno cumplencondicion determinada anyMatch
	
//	boolean alguno=lista.stream().anyMatch(i->i.getEdad()<30);
//	System.out.println(alguno);
	
	//Si ninguno cumple la condicion
	
	//boolean ninguno=lista.stream().anyMatch(i->i.getNombre().equals("Ariana"));
	//System.out.println(ninguno);
	
	//RETORNAR UN VALOR OPCIONAL//el de menor edad
	Optional<Persona>menorEdad=lista.stream().min(Comparator.comparing(Persona::getEdad));

	System.out.println(menorEdad);
	
	
	//UN VALOR CON VARIAS CONDICIONES 
	Optional<Persona>hombreMayor=lista.stream()
			.filter(i->i.getGenero().equals("MASCULINO"))
			.max(Comparator.comparing(Persona::getEdad));
	
	System.out.println(hombreMayor);
	hombreMayor.ifPresent(System.out::println);
	
	
	
	
	
	
	
	}//cierra

}//cierra
