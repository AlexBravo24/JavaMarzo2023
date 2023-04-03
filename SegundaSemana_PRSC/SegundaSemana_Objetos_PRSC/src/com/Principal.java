package com;

public class Principal {

	public static void main(String[] args) {
		// La clase principal debe ser única, es decir
		//Sólo existe una clase con el método main
		// La cual se encargará de ejecutar el proyecto
		//o aplicación
		
		//Aquí podemos instanciar a nuestro objeto
		//Instanciar = Crear objeto
		//Pregunta entrevista - Diferencia entre clase y objeto (instancia)
		
		//Instanciar o crear a un objeto Perro
		
		Perro doberman  = new Perro ();
		
		
		Perro dálmata = new Perro("Fido",5,15.5,"Moteado" );
		
		//Con ayuda del constructor vacío puedo establecer los
		//valores de sus atributos mediante los getters y setters
		
		doberman.setNombre("Terry");
		doberman.setEdad(6);
		doberman.setPeso(10.4);
		doberman.setColor("Café");
		
		System.out.println(doberman);
		System.out.println(dálmata);
		System.out.println(" ");
		
		//Actividad
		//Modelar 5 objetos - mínimo 3 atributos por objeto, máximo 5
		//Crear métodos constructores
		//Getters y Setters
		//Método toString
		//Los van a instanciar aquí en la clase principal
		//Instancian un objeto con todos los parámetros
		//Instancian otro de la misma, con uno o dos parámetros
		
		/*
		 * OBJETO 1
		 */
		
		Lapicero BIC = new Lapicero ();
		BIC.setMarca("Bic");
		BIC.setColor("Negro");
		BIC.setForma("Hexagonal");
		
		Lapicero InkJoy = new Lapicero ("PaperMate", "Azul", "Triangular", "fina");
		
		System.out.println(BIC);
		System.out.println(InkJoy);
		System.out.println(" ");
		
		/*
		 * OBJETO 2
		 */
		
		Televisión Plana = new Televisión ();
		Plana.setMarca("LG");
		Plana.setTamaño(32);
		Plana.setTransmisión("Satelital");
		
		Televisión Smart = new Televisión ("Samsung", 50, "4k", "Televisión por internet");
		
		System.out.println(Plana);
		System.out.println(Smart);
		System.out.println(" ");
		
		/*
		 * OBJETO 3
		 */

		Colchón Individual = new Colchón ();
		Individual.setLargo(190);
		Individual.setAncho(100);
		
		Colchón Matrimonial = new Colchón ("Kingsize",190,200,"Espuma");
		
		System.out.println(Individual);
		System.out.println(Matrimonial);
		System.out.println(" ");
		
		/*
		 * OBJETO 4
		 */
		
		Planta Azucena = new Planta();
		Azucena.setEspecie("Azucena");
		
		Planta Orquídea = new Planta ("Orquídea", "Morada", "Alta");
		
		System.out.println(Azucena);
		System.out.println(Orquídea);
		System.out.println(" ");
		
		/*
		 * OBJETO 5
		 */
		
		Playeras Larga = new Playeras();
		Larga.setTipo("Manga larga");
		Larga.setColor("Blanca");
		Larga.setMaterial("Algodón");
		
		Playeras Corta = new Playeras("Adidas","Manga Corta","Azul","Sin estampado","Algodón");
		
		System.out.println(Larga);
		System.out.println(Corta);
		
	}

}
