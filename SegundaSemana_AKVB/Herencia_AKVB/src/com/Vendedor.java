package com;

public class Vendedor extends Empleado{
	
	/*
	 * Dos formas de  crear el constructor. Añado un atributo 
	 * a Vendedor y genero los constructores incluyendo los 
	 * de la superclase
	 */
	
	private double comision;
//	
//	public Vendedor() {}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc,
//			double comision) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		this.comision = comision;
//	}
	
	/*
	 * Si no le agrego atributos a la clase, entonces genero el 
	 * constructor desde la superclase.
	 */
	public Vendedor() {}

	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
		// TODO Auto-generated constructor stub
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return "Vendedor [comision=" + comision + ", toString()=" + super.toString() + "]";
	}
	
	public void finalizarVentas() {
		System.out.println("Finalizando ventas...");
	}
	
		
	
}
