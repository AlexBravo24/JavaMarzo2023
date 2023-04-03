package com;

public class Principal {

	public static void main(String[] args) {
		// La clase principal debe ser �nica, es decir
		//S�lo existe una clase con el m�todo main
		// La cual se encargar� de ejecutar el proyecto
		//o aplicaci�n
		
		//Aqu� podemos instanciar a nuestro objeto
		//Instanciar = Crear objeto
		//Pregunta entrevista - Diferencia entre clase y objeto (instancia)
		
		//Instanciar o crear a un objeto Perro
		
		Perro doberman  = new Perro ();
		
		
		Perro d�lmata = new Perro("Fido",5,15.5,"Moteado" );
		
		//Con ayuda del constructor vac�o puedo establecer los
		//valores de sus atributos mediante los getters y setters
		
		doberman.setNombre("Terry");
		doberman.setEdad(6);
		doberman.setPeso(10.4);
		doberman.setColor("Caf�");
		
		System.out.println(doberman);
		System.out.println(d�lmata);
		System.out.println(" ");
		
		//Actividad
		//Modelar 5 objetos - m�nimo 3 atributos por objeto, m�ximo 5
		//Crear m�todos constructores
		//Getters y Setters
		//M�todo toString
		//Los van a instanciar aqu� en la clase principal
		//Instancian un objeto con todos los par�metros
		//Instancian otro de la misma, con uno o dos par�metros
		
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
		
		Televisi�n Plana = new Televisi�n ();
		Plana.setMarca("LG");
		Plana.setTama�o(32);
		Plana.setTransmisi�n("Satelital");
		
		Televisi�n Smart = new Televisi�n ("Samsung", 50, "4k", "Televisi�n por internet");
		
		System.out.println(Plana);
		System.out.println(Smart);
		System.out.println(" ");
		
		/*
		 * OBJETO 3
		 */

		Colch�n Individual = new Colch�n ();
		Individual.setLargo(190);
		Individual.setAncho(100);
		
		Colch�n Matrimonial = new Colch�n ("Kingsize",190,200,"Espuma");
		
		System.out.println(Individual);
		System.out.println(Matrimonial);
		System.out.println(" ");
		
		/*
		 * OBJETO 4
		 */
		
		Planta Azucena = new Planta();
		Azucena.setEspecie("Azucena");
		
		Planta Orqu�dea = new Planta ("Orqu�dea", "Morada", "Alta");
		
		System.out.println(Azucena);
		System.out.println(Orqu�dea);
		System.out.println(" ");
		
		/*
		 * OBJETO 5
		 */
		
		Playeras Larga = new Playeras();
		Larga.setTipo("Manga larga");
		Larga.setColor("Blanca");
		Larga.setMaterial("Algod�n");
		
		Playeras Corta = new Playeras("Adidas","Manga Corta","Azul","Sin estampado","Algod�n");
		
		System.out.println(Larga);
		System.out.println(Corta);
		
	}

}
