package com;

public class Principal {

	public static void main(String[] args) {
		
		Habitaci�n habitaci�n = new Habitaci�n ("Beige",2,1,"Azulejo");
		Ba�o wc = new Ba�o ("Medio ba�o", "Espejo", "Planta Baja");
		Cochera garage = new Cochera ("El�ctrico","Beige",6.5,5);
		
		Casa casa = new Casa ("Ladrillo",2,"Losa de cemento",4,habitaci�n,wc,garage);
		
		System.out.println(casa);

	}

}
