package com;

public class Perro {
	// Una clase funciona como una plantilla para modelar un objeto
	
	/*Caemos en el primer pilar de la POO, que es la abstracci�n que es la idea del objeto en la
	 * vida real, de acuerdo a lo que necesitaos en Java. Es decir, vamos a definir del objeto, sus
	 * atributos y algunos comportamientos expresados a trav�s de m�todos.
	 */

	// definimos los atributos del objeto
	
	private String nombre; //El segundo pilar que ser�a el encapsulamiento, que lo que hace es
							//proteger el acceso a nuestra informaci�n. Esto se lleva a cabo 
							//mediante los modificadores de acceso. Son cuatro: 
							//Private(tiene alcance para una sola clase) 
							//Default(se tiene acceso dentro de la clase y del mismo paquete
							//Protected (se tiene acceso dentro y fuera del paquete y en sub clases
							//Public(en esta clase, en el paquete, en otras clases y fuera de el
	private int edad;
	private double peso;
	private String color;
	
	/*M�todos constructores:
	 * Nos ayudan a crear o construir el objeto como tal, con sus respectivos atributos
	 * Convencionalmente van a encontrar dos m�todos constructores
	 */


	 /* El primero es el constructor vacio el cual nos sirve como un comod�n para instanciar a un 
	 * objeto sin iniciarlo, sin asignarle valores a�n y que despu�s se le de valores
	 */
	public Perro () {} //Ejemplo de constructor vac�o, tiene que tener el nombre identico al de la
						//clase
	
	/*M�todo constructor con todos los parametros
	 * Este m�todo nos ayudar� a instanciar a nuestro objeto pero aqu� si vamos a requerir declarar
	 * todos sus atributos.
	 */

	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	//Podemos generar los constructores que sean necesarios y no hay l�mite
	
	
		//M�todos Getters and Setters,  se saca dando clic derecho, source y getters and setters

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
	
	//El m�todo toString nos da la impresi�n en consola de los valores de los atributos
	//Actuando como una radiograf�a de nuestro objeto

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
						
	
	
	
	
	
}
