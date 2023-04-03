package com;

public class Cientifica extends Calculadora implements ITermometro{

	
	private String version;
	private String ID;
	public Cientifica() {}
	public Cientifica(String marca, String modelo, int precio, String color, String paisfabricacion, String version,
			String iD) {
		super(marca, modelo, precio, color, paisfabricacion);
		this.version = version;
		ID = iD;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Cientifica [version=" + version + ", ID=" + ID + ", toString()=" + super.toString() + "]";
	}
	

	@Override
	public void suma() {
		// 
		int nu1=1;
		int nu2=3;
		int resultado;
		resultado=nu1+nu2;
//		System.out.println("resultado de suma es :"+resultadosuma);
		System.out.println("resultado de suma es :"+resultado);
	}
	@Override
	public void resta() {
		/*
		 * 
		 * y en public void resa() que esa arriba se le meterian los valores a regresar en este caso iria asi resta(int nu1,int nu2);
		 * en caso de que quiera que pida los valores se hara de esta forma mostrare un ejemplo
		 *Scanner entrada=new Scanner(System.in);
		 *int nu1=0,nu2=0,resultado=0;
		 *entrada.close();
		 *syso("resultado es"+(a+b));
		 * 
		 * esto seria todo aqui.
		 * pero en la parte padre tendramos que ponerlo de esta forma
		 * public abstract void resta(int nu1,int nu2);
		 * pero practicamente hariamos lo mismo con los demas
		 * 
		 * ojo despues esto nos vamos al main principal
		 * y tendremos que poner esto
		 * cienti1.resta(0,0); pero no quiero ponerlo entonce se quita del public void resta que esta aqui y los nu1 y nu2 los pongo dentro del programa
		 * 
		 * 
		 * 
		 */
		int nu1=5;
		int nu2=2;
		int resultadoresta=nu1-nu2;
		System.out.println("restado de la resta es:"+resultadoresta);
		
	}
	@Override
	public void multiplicacion() {
		// TODO Auto-generated method stub
		int nu1=5;
		int nu2=2;
		int resultadomulti=nu1*nu2;
		System.out.println("resultado de la multiplicacion"+resultadomulti);
	}
	@Override
	public void divicion() {
		// TODO Auto-generated method stub
		int nu1=5;
		int nu2=2;
		int resultadodivi=nu1/nu2;
		System.out.println("restado de la divicion es: "+resultadodivi);
	}
	//para la temperatura
	//
	
	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando temperatura.....36.65C normal");
		
	}
	//¿como obtienen comportamiento las clases? o de donde obtienen comportamiento las clases? (estan hablano de metodos)
	//los obtiene de metodos propios
	//de las clases abstractas- heredados- nos obliga a tener herencia
	//desde las interfaces
	
	
	
	
}
