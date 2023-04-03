package com;

public class Vendedor extends Empleado {
	
	//Si no le agrego atributos a esta clase, entonces genero los constructores desde la super clase
	//en source generate constructors from superclase
	
//	public Vendedor() {}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
//	
	
	/*Dos opciones para crear los constructores:
	 * Añado un atributo a vendedor y genero los constructores incluyendo los de la superclase
	 */

private double comisión;

	public Vendedor() {}
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
	return "Vendedor [comisión=" + comisión + ", toString()=" + super.toString() + "]";
}
	
// Método propio

	public void vender () {
		System.out.println("Finalizando ventas...");
	}
	
	

}
