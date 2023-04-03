package com;
import java.util.HashMap;
public class MapaJava {
public static void main(String[] args) {
	
//	
//	Utiliza una tabla de dispersi�n para almacenar la informaci�n del mapa. Las operaciones b�sicas (get y put) 
//	se har�n en tiempo constante siempre que se dispersen adecuadamente los elementos. Es coste de la iteraci�n 
//	depender� del n�mero de entradas de la tabla y del n�mero de elementos del mapa. 
//	No se garantiza que se respete el orden de las claves.
	
	
	
	// se crea
	HashMap<String, String> lista = new HashMap<>();
	//valores //agregar elmentos a hashmap
	lista.put("pedro", "1234");
	lista.put("osacar", "2534");
	lista.put("pablo", "6934");
	//tama�o 
	
	int i = lista.size();
	System.out.println("tama�o: "+i);
	
	//obtener solo un elkemento mediante la clave
	
	String telefono = lista.get("pedro");
	System.out.println("Telefono es: "+ telefono);
	

	
	//eliminar elemento especifico
	
	//borramos carlos
	
	lista.remove("pablo");
	int i1 = lista.size();
	
	System.out.println("tama�o: "+i1);
	
	//saber se tiene elementos o no false o true
	
	
	boolean mt =lista.isEmpty();
	System.out.println("Tiene elementos"+mt);
	
	
 //limpiar todos los elementos
	
 lista.clear();
 int i11 = lista.size();
	System.out.println("tama�o: "+i11);
	
	
	
	//enlace de ejemplo de codigo https://blog.nubecolectiva.com/que-es-un-hashmap-en-java/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//cierra
	
	
	
	
}//cierra
