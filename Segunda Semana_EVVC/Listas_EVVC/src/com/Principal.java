package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
		//Como se declara una lista
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		
		//Para añadir datos a la lista podemos: 
		//Instanciarlo dentro del argumento
		listaPersonas.add(new Persona ("Pedro",27,"Masculino"));
		listaPersonas.add(new Persona ("Alejandra", 27, "Femenino"));
		listaPersonas.add(new Persona("Colette", 46, "Femenino"));
		//Crearlo antes:
		Persona persona1=new Persona ("Carlos", 22, "Masculino");
		listaPersonas.add(persona1);
		//Para añadir datos en la lista en una posición específica en este caso en la posición 3:
		listaPersonas.set(2,new Persona ("Cesar",44,"Masculino"));
		
		//Para eliminar un dato de la lista:
		listaPersonas.remove(0);
		
		
		//para mostrar todos los valores de la lista en pantalla 
		for (Persona i:listaPersonas) {
			System.out.println(i.toString());
		}
		
		//Para mostar un dato de la lista en una posición en especifico:
		System.out.println(listaPersonas.get(1));
		
		//Para hacer una lista de números:
		ArrayList<Integer>Números=new ArrayList<>();
		Números.add(1);
		Números.add(2);
		Números.add(3);
		Números.add(4);
		
		for (int i=0 ; i< Números.size(); i++) {
			System.out.println(Números.get(i));
		}
		
		// V E C T O R
		
		//Para declararlo:
				List<Persona> vector=new Vector<Persona>();
				
				//Para añadir datos
				vector.add(new Persona("Víctor",25,"Masculino"));
				vector.add(new Persona("Sandy",25,"Femenino"));
				vector.add(new Persona("Coral",24,"Femenino"));
				
				System.out.println(vector);
		

	}

}
