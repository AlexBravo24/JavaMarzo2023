package com;

/*La herencia nos permite reutilizar código de otra clase (de una clase padre).
 * Se realiza con la palabra reservada "extends" despues del nombre de la clase que b¿va a heredar 
 * dichos atributos
 */

public class Empleado extends Persona{
	
	//Un empleado también es una persona, pero tiene otros atributos que lo vuelven especifícamente
	//un empleado

	private double salario;
	private String puesto;
	private int idEmpleado;
	private String rfc;
	
	public Empleado () {}

	
	/*Para generar un constructor con los parámetros heredados de la clase padre, primero realizamos
	 *  herencia con la palabra extends y al general el constructor elegimos la opción del
	 *  constructor de la clase padre
	 */
	
	public Empleado(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
		super(nombre, sexo, edad);
		this.salario = salario;
		this.puesto = puesto;
		this.idEmpleado = idEmpleado;
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	
	//Para poder tener los atributos de la clase heredada seleccionar en inheret methods
	//ahí ya se heredan, seleccionas cada uno o toString
	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", puesto=" + puesto + ", idEmpleado=" + idEmpleado + ", rfc=" + rfc
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + "]";
	}


	
	//En la subclase o clase hija una vez heredando de una clase padre, se obliga a heredar
	//atributos y comportamientos (métodos) e implementarlos i es necesario o si los métodos son 
	//abstractos.
	@Override
	public void trabajar() {
		System.out.println("Trabajando...");
	}

	
	
	
}
