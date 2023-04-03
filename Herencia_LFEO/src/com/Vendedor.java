package com;

public class Vendedor extends Empleado {
	
	//Dos opciones para crear los constructores
	//AÑADO un atributo a Vendedor y genero los constructores
	//incluyendo los de la super clase
	
	//atributo
	private double comision;
//	
	//cosntructor vacio
	public Vendedor() {}
//
	//constructor con todo los parametros incluyendo los de la superclase
	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc,
			double comision) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
		this.comision = comision;
	}
	

	//Si no le agrego atributos a esta clase, entonces genero los cosntructores desde la superclase
	
//	public Vendedor() {
//		
//	}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
	
	
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
	
	public void vender() {
		System.out.println("FINALIZANDO VENTAS....");
	}
	
	
	
	
	
	
	

}
