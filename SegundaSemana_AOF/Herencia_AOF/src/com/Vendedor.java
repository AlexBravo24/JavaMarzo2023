package com;

public class Vendedor extends Empleado{

	//Dos opciones paracrear los constructores añado un atributo
	//y genero los constructores incluyendo del de la super clase
	//PRIMERA FORMA
	private double comision;
	public Vendedor () {}
	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rFC,
			double comision) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rFC);
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
	
	
	//METODO PROPIO 
	public void vender() {
		System.out.println("Finalizando ventas...");
	}
	
	
	
	
	//SEGUNDA FORMA 
	//Constructores desde la super clase
//	public Vendedor () {}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rFC) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rFC);
//		// TODO Auto-generated constructor stub
//	}
	
	
	
}
