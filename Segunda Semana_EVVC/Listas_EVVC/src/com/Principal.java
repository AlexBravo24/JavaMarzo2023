package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		//Como se declara una lista
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		
		//Para a�adir datos a la lista podemos: 
		//Instanciarlo dentro del argumento
		listaPersonas.add(new Persona ("Pedro",27,"Masculino"));
		listaPersonas.add(new Persona ("Alejandra", 27, "Femenino"));
		listaPersonas.add(new Persona("Colette", 46, "Femenino"));
		//Crearlo antes:
		Persona persona1=new Persona ("Carlos", 22, "Masculino");
		listaPersonas.add(persona1);
		//Para a�adir datos en la lista en una posici�n espec�fica en este caso en la posici�n 3:
		listaPersonas.set(2,new Persona ("Cesar",44,"Masculino"));
		
		//Para eliminar un dato de la lista:
		listaPersonas.remove(0);
		
		
		//para mostrar todos los valores de la lista en pantalla 
		for (Persona i:listaPersonas) {
			System.out.println(i.toString());
		}
		
		//Para mostar un dato de la lista en una posici�n en especifico:
		System.out.println(listaPersonas.get(1));
		
		//Para hacer una lista de n�meros:
		ArrayList<Integer>N�meros=new ArrayList<>();
		N�meros.add(1);
		N�meros.add(2);
		N�meros.add(3);
		N�meros.add(4);
		
		for (int i=0 ; i< N�meros.size(); i++) {
			System.out.println(N�meros.get(i));
		}
		
		// V E C T O R
		
		//Para declararlo:
				List<Persona> vector=new Vector<Persona>();
				
				//Para a�adir datos
				vector.add(new Persona("V�ctor",25,"Masculino"));
				vector.add(new Persona("Sandy",25,"Femenino"));
				vector.add(new Persona("Coral",24,"Femenino"));
				
				System.out.println(vector);
		

	}

}
