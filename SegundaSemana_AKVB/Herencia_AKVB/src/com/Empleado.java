package com;

public class Empleado extends Persona{
	/*
	 * La herencia nos permite reutilizar codigo de otra clase
	 * (De una clase padre). La HERENCIA se realiza con la palabra
	 * reservada extends después del nombre de la clase que va
	 * a heredar dichos atributos.
	 * 
	 * Un empleado también es una persona, pero tiene otros
	 * atributos que lo vuelven específicamente un empleado.
	 */
	
	private double salario;
	private String puesto;
	private int idEmpleado;
	private String rfc;

	public Empleado() {}

	/*
	 * Para generar un constructor con los parámetros heredados de la
	 * clase padre, primero realizamos herencia con la palabra extends.
	 * Al generar el constructor elegimos la opción de el costructor de
	 * la clase padre.
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

	@Override
	public String toString() {
		return "Empleado [" + super.toString() + " salario=" + salario + ", puesto=" + puesto + ", idEmpleado=" + idEmpleado + ", rfc=" + rfc
				 +  "]";
	}

	/*
	 * En la subclase o clase hija, una vez heredando la clase padre
	 * se obliga a heredar atributos y comportamientos (métodos) o 
	 * implementarlos si es necesario, o si los métodos son abstractos.
	 */
	
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajando... ");
		
	}

	
	
}
