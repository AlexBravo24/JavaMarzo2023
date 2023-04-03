package com;

public class Principal {

	public static void main(String[] args) {
		
		Habitación habitación = new Habitación ("Beige",2,1,"Azulejo");
		Baño wc = new Baño ("Medio baño", "Espejo", "Planta Baja");
		Cochera garage = new Cochera ("Eléctrico","Beige",6.5,5);
		
		Casa casa = new Casa ("Ladrillo",2,"Losa de cemento",4,habitación,wc,garage);
		
		System.out.println(casa);

	}

}
