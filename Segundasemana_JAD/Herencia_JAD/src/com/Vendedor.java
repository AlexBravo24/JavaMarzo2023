package com;

public class Vendedor extends Empleado {
	
	//opciones para crear los contructores
	//añado un atributo  a vendedor y genero los constructores
	//incluyendo los de la superclase
	
	private double comision;
	
	public Vendedor() {
		
	}

	public Vendedor(String nombre, String genero, int edad, double salario, String puesto, int idempleado, String rfc,
			double comision) {
		super(nombre, genero, edad, salario, puesto, idempleado, rfc);
		this.comision = comision;
	}
	// si no le agregan atributos se hace de esta manera

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
	
//     public Vendedor() {}
//
//	public Vendedor(String nombre, String genero, int edad, double salario, String puesto, int idempleado, String rfc) {
//		super(nombre, genero, edad, salario, puesto, idempleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
     
	
}
