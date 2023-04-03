package com;

import java.util.HashMap;

public class HashMap_A {

public static void main(String[] args) {
//	HashMap es una tabla en la que podemos insertar claves. Implementa el interface Map,
//	lo cual nos permite utilizar los métodos relativos a los mapas. El rendimiento de las funciones básicas 
//	.get() y .put() es constante, ya que los elementos están dispersos en el mapa de forma concreta
//	
//	
	
	//OTRO EJEMPLO https://programandoointentandolo.com/2013/02/ejemplo-de-uso-de-hashmap-en-java-2.html
	
	//este tipo de datos nos va a permitir tener un tipo de identificador y acceder 
	HashMap diccionario = new HashMap();
	diccionario.put("1", "Ari"); //PIDE COMPLEMENTAR CON KEY
	diccionario.put("2", "Pedro");
	diccionario.put("3", "Sofi");

	String contenido = diccionario.get("1").toString();
	System.out.println(contenido);
}
	 
	 
}
