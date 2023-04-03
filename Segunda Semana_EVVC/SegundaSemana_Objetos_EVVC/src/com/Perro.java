package com;

public class Perro {
	// Una clase funciona como una plantilla para modelar un objeto
	
	/*Caemos en el primer pilar de la POO, que es la abstracción que es la idea del objeto en la
	 * vida real, de acuerdo a lo que necesitaos en Java. Es decir, vamos a definir del objeto, sus
	 * atributos y algunos comportamientos expresados a través de métodos.
	 */

	// definimos los atributos del objeto
	
	private String nombre; //El segundo pilar que sería el encapsulamiento, que lo que hace es
							//proteger el acceso a nuestra información. Esto se lleva a cabo 
							//mediante los modificadores de acceso. Son cuatro: 
							//Private(tiene alcance para una sola clase) 
							//Default(se tiene acceso dentro de la clase y del mismo paquete
							//Protected (se tiene acceso dentro y fuera del paquete y en sub clases
							//Public(en esta clase, en el paquete, en otras clases y fuera de el
	private int edad;
	private double peso;
	private String color;
	
	/*Métodos constructores:
	 * Nos ayudan a crear o construir el objeto como tal, con sus respectivos atributos
	 * Convencionalmente van a encontrar dos métodos constructores
	 */


	 /* El primero es el constructor vacio el cual nos sirve como un comodín para instanciar a un 
	 * objeto sin iniciarlo, sin asignarle valores aún y que después se le de valores
	 */
	public Perro () {} //Ejemplo de constructor vacío, tiene que tener el nombre identico al de la
						//clase
	
	/*Método constructor con todos los parametros
	 * Este método nos ayudará a instanciar a nuestro objeto pero aquí si vamos a requerir declarar
	 * todos sus atributos.
	 */

	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	//Podemos generar los constructores que sean necesarios y no hay límite
	
	
		//Métodos Getters and Setters,  se saca dando clic derecho, source y getters and setters

	//Getter - Devolvernos el valor asignado de un atributo
	//Setter - Nos permite establecer o asignarle valor a un atributo

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
	
	//El método toString nos da la impresión en consola de los valores de los atributos
	//Actuando como una radiografía de nuestro objeto

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
						
	
	
	
	
	
}
