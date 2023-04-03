package com;

public class Vendedor extends Empleado{
	
	//Dos opciones para crear los constructores
	//Añado los atributos y genero los constructores
	//incluyendo los de la super clase
	
	private double comision;
	
	public Vendedor () {}

	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc,
			double comision) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
		this.comision = comision;
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
	
	//Metodo propio
	
	public void vender () {
		System.out.println("Finalizar ventas...");
	}
	
	
	//Segunda opcion (desde la super clase)
	//si no le agrego atributos a esta clase entonces genero los constructores
	//desde la superclase 
//	public Vendedor () {}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		
//	}
	
	
	

}
