package com;

import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		
		//Para declararlo:
		HashMap<Integer, Empleado> Clientes = new HashMap<>();
		
		//Para ingresar datos:
		Clientes.put(24000,new Empleado("Carlos", "12345", "Director"));
		Clientes.put(17000,new Empleado("Ana", "12346", "Secretaria"));
		Clientes.put(36000,new Empleado("Alejandra", "12347", "Rectora"));
		Clientes.put(28000,new Empleado("Miguel", "12348", "Maestro"));
		
		//Para eliminar:
		Clientes.remove(17000);
		
		//Para sacar en pantalla un valor específico 
		System.out.println(Clientes.get(24000));
		
		//Para imprimir todos 
		System.out.println(Clientes);
		
		
		
		
		
		
		
		
	}

}
