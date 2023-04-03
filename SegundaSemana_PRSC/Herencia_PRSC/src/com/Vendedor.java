package com;

public class Vendedor extends Empleado {

	//Dos opciones para crear los constructores
	//Añado un atributo a Vendedor y genero los constructores
	//incluyendo los de la super clase
	
	private double comisión;
	
	public Vendedor () {}

	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc,
			double comisión) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
		this.comisión = comisión;
	}
	
	
	

	public double getComisión() {
		return comisión;
	}

	public void setComisión(double comisión) {
		this.comisión = comisión;
	}

	@Override
	public String toString() {
		return "Vendedor [" + super.toString() + ", comisión=" + comisión + "]";
	}
	
	
	//Método propio
	
	public void vender() {
		System.out.println("Finalizando ventas...");
	}
	
	
	
	
	//Si no le agrego atributos a esta clase, entonces genero 
	//los construstores desde la superclase
//	
//	public Vendedor () {}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
	


	
	
	
}
