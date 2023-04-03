package com;

public class Perro {
//una clase funciona como una plantilla
//para modelar un objeto
	
	//Caemos en el primer ilar de laprogramacion orientada a objetos/
	//traer laidea dek objeto en la vida real de acuerdo a lo que necesitamos en Java
	//Es decir, vamos a definir delobjeto sus atributos y algunos comportamientos
	//expresados a traves del metodo
	
	
	//primero definimos los atributos
	
	//l encapsulamiento es otro pilar de POO QUE LO QUE HACEES 
	//proteger  el acceso a nuetra inf.
	//esto se lleva acabo mediante los modificadores de acceso
	//Private, Default, Protected, Public
	
	
	private String nombre;
	private int edad;
	private double peso;
	private String  color;
	 //metodos constructores nos ayudan a crear o construir al objeto como tal
	
	//con sus respectivos atributos
	
	//Regularmente o convencionalmente van a encontrar los metodos constructores
	//elpriemro es el vacio nos sirve como comodin para instanciar a un objeto sin inicarlo es decor
	//sin agregarle valores y despues los podamos asignar
	
	public Perro (){}//COMODIN 
	
	//METODO CONSTRUCTOR CON TODOS LOS PARAMETROS
		//ESTE METODO NOS AYUDARA A INSTANCIAR A NUESTRO OBJETO/
		//PERO AQUI SI VAMOS A REQUERIR DECLARAR TODOS SUS ATRIBUTOS

	public Perro(String nombre, int edad, double peso, String color) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	//podemos generar los constructores que sean necesarios y no hay limite
	
		//Metodos conocidos como getters y setters
	
	//Getter nos devuelve el valor asignado deun atributo
	//Setter nos permite establecer o asignarle valor a un atributo
		

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
//nos permitre mostrar los atributos del objeto de una salida en consola
	//actuando como radiografia de nuestro objeto
	
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//cierra
