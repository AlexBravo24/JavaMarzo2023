package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Simulamos una pequeña base de datos con un HashMap
		
		HashMap<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		cuentas.put(1001, new Cuenta("Luis",10000.50,500,20000,"Débito"));
		cuentas.put(1002, new Cuenta("Monse",15000.90,1000,4000,"Débito"));
		cuentas.put(1003, new Cuenta("Eva",105000.50,4000,15000,"Débito"));
		cuentas.put(1004, new Cuenta("Lucio",1000.50,100,20000,"Débito"));
		cuentas.put(1005, new Cuenta("Guillermo",11000,100,50000,"Débito"));
		
		//Instanciamos a un cajero, para realizar operaciones
		
		Cajero inbursa = new Cajero("PeriPlaza,Puebla", 1517,cuentas);
		
		//Probamos el método de buscar cuenta, para consultar la información de esa cuenta.
		//System.out.println(inbursa.buscarCuenta(1004));
		
		//Probamos el método de depositar en una cuenta
//		System.out.println(inbursa.depositar(1001, 8000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 1000));
		
		//Probar retirar dinero de una cuenta
		//System.out.println(inbursa.retirar(1004, 1000));
		
		//Transferencia
		/*System.out.println(inbursa.transferir(1003, 1004, 1800));
		System.out.println(inbursa.buscarCuenta(1004));
		*/
		
		List<Persona> lista = new ArrayList<Persona>();
		
		List<Persona> listaFiltrada = new ArrayList<Persona>();
		
		lista.add(new Persona("Eva",25,"Femenino"));
		lista.add(new Persona("Monse",28,"Femenino"));
		lista.add(new Persona("Erick",28,"Masculino"));
		lista.add(new Persona("Luis",26,"Masculino"));
		lista.add(new Persona("Lucio",27,"Masculino"));
		lista.add(new Persona("Guillermo",29,"Masculino"));
		lista.add(new Persona("Pedro",28,"Masculino"));
		lista.add(new Persona("Jesús",26,"Masculino"));
		lista.add(new Persona("Ariana",25,"Femenino"));
		lista.add(new Persona("Erika",26,"Femenino"));
		lista.add(new Persona("Kevin",24,"Masculino"));
		lista.add(new Persona("Emmanuel",22,"Masculino"));
		lista.add(new Persona("Rosario",28,"Femenino"));
		lista.add(new Persona("Oscar",34,"Masculino"));
		
		//Mostrando la lista en pantalla
		//System.out.println(lista);
		
		//Recorrer los elementos de una lista, forma declarativa con un ciclo for
		
		//For
//		for(int i=0; i<lista.size();i++) {
//			System.out.println(lista.get(i));
//		}
		
		//For each
//		for(Persona i:lista) {
//			System.out.println(i);
			
			//For each en una sola línea
			//lista.forEach(System.out::println);
			
//		for(Persona i: lista) {
//			if(i.getGenero().contentEquals("Masculino")){
//				listaFiltrada.add(i);
//				//System.out.println(i);
//			}
//		}
//		listaFiltrada.forEach(System.out::println);
		
		/*
		 * Forma imperativa
		 * Solo vamos solicitando lo que vamos necesitando
		 * API Stream
		 */
		//Filtrando a las personas de genero femenino
//		listaFiltrada=lista.stream()
//				.filter(i->i.getGenero()
//						.equals("Femenino"))
//				.collect(Collectors.toList());
//				listaFiltrada.forEach(System.out::println);
		
		//Ordenar elementos por edad ascendente
//		listaFiltrada=lista.stream()
//				.sorted(Comparator.comparing(Persona::getEdad).reversed())
//				.collect(Collectors.toList());
//		listaFiltrada.forEach(System.out::println);
//		
//		//Todos cumplen una condición determinada
//		boolean todos = lista.stream().allMatch(i->i.getEdad()<30);
//		System.out.println(todos);
//		
//		//Alguno cumple una condición determinada
//		boolean alguno = lista.stream().anyMatch(i->i.getEdad()<30);
//		System.out.println(alguno);
//		
//		//Si ninguno cumple la condición
//		boolean ninguno = lista.stream().anyMatch(i->i.getNombre().equals("Alejandro"));
//		System.out.println(ninguno);
//		
		
		//Retornar un valor opcional
		Optional<Persona>menorEdad=lista.parallelStream().min(Comparator.comparing(Persona::getEdad));
			System.out.println(menorEdad);
			
			//Un valor con varias condiciones
		Optional<Persona>hombreMayor = lista.parallelStream().filter(i->i.getGenero().contentEquals("Masculino")).max(Comparator.comparing(Persona::getEdad));
			//System.out.println(hombreMayor);
		hombreMayor.ifPresent(System.out::println);
		}
	}
