package com;

public class Perro {
	
	/*
	 * Una clase funciona como una plantilla para modelar un objeto.
	 */
	
	/*
	 * Caemos en el primer pilar de la POO, que es la ABSTRACCI�N.
	 * Traer la idea del objeto en la vida real, de acuerdo a lo que
	 * necesitemos en Java. Es decir, vamos a definir del objeto, sus atributos y algunos comportamientos
	 * expresados a trav�s de m�todos.
	 */

	//Primero definimos los atributos del objeto
	/*
	 * El ENCAPSULAMIENTO es otro pilar de la POO, que lo que hace es proteger el acceso a nuestra informaci�n,
	 * esto se llave a cabo mediante los modificadores de acceso:
	 * 	"Private, Default, Protected, Public".
	 */
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	/*
	 * M�todos constructores, nos ayudan a crear o construir al objeto como tal,
	 * con sus respectivos atributos.
	 * 
	 * Regularmente o convensionalmente van a encontrar dos m�todos construtores:
	 * 		El primero es el constructor vac�o, el cual nos sive como un "comod�n", para instanciar a un objeto sin iniciarlo,
	 * 		sin asignarle valores a�n.
	*/
	
	public Perro() {  //Ejemplo de constructor vac�o.
		
	}
	
	/*
	 * M�todo contructor con todos los parametros.
	 * 	Este m�todo ayudara a instanciar a nuestro objeto pero aqu�
	 * 	si vamos a requerir declarar todos sus atributos.
	 */

	public Perro(String nombre, int edad, double peso, String color) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	
	/*
	 * Podemos generar los constructores que sean necesarios. Y no hay l�mite.
	 */
	
	/*
	 * M�todos Getters & Setters
	 */
	
	
	/*
	 * Getter - Devolvernos el valor asignado de un atributo.
	 * Setter - Nos permite establecer o asignar valor a un atributo.
	 */

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

	
	/*
	 * M�todo toString:
	 * 		Nos permite mostrar los atributos del objeto en una salida de datos en consola, actuando como una "radiograf�a" de nuestro objeto.
	 */
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}		
}