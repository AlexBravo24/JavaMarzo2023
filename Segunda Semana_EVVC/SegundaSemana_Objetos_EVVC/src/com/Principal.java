package com;

public class Principal {

	public static void main(String[] args) {
		// La clase principal debe ser �nica, es la que se encarga de ejecutar el proyecto
		// y es la �nica que debe tener el m�todo main
		
		//Aqu� podemos instanciar nuestro objeto, instanciar=crear un objeto
		//Pregunta entrevista- Diferencia entre clase y objeto o intancia
		//El objeto esta creado a partir de la clase
		//La clase es la plantilla y la instancia es la creaci�n del objeto
		
		//Instanciar o crear a un objeto Perro, doberman ser�a el objeto de mi clase
		
		Perro doberman = new Perro();
		Perro dalmata= new Perro("Fido",5,15.5, "Moteado");
		
		//Con ayuda del constructor vac�o puedo establecer los valores de sus atributos mediante los
		//getters y setters
		
		doberman.setNombre("Firulais");
		doberman.setEdad(2);
		doberman.setPeso(10.6);
		doberman.setColor("Negro");
		
		
		System.out.println(doberman);
		System.out.println(dalmata+"\n");

		/*Actividad
		 * Modelar 5 objetos m�nimo 3 atributos por objeto m�ximo 5
		 * Crear m�todos constructores
		 * Getters y Setters
		 * M�todo toString
		 * Instanciarlos en la clase principal
		 * Instanciar un objeto con todos los par�metros 
		 * Instanciar otro de la misma clase con uno o dos par�metros
		 */
		//Primer Objeto
		Helado grande = new Helado();
		Helado mediano = new Helado ("Fresa", "Galleta oreo","Dorado", 2);
		
		grande.setSabor("Vainilla");
		grande.setToping("Brownie");
		
		System.out.println(grande);
		System.out.println(mediano+"\n");
		
		//Segundo objeto
		Bicicleta mtb = new Bicicleta ();
		Bicicleta ruta=new Bicicleta(24, 26, "Aluminio", "Sin suspensi�n","V");
		
		mtb.setSuspensi�n("Doble");
		mtb.setFrenos("De disco, hidrauilica");
		mtb.setN�meroVelocidades(21);
		
		System.out.println(mtb);
		System.out.println(ruta+"\n");
		
		//Tercer objeto
		Autom�vil carro = new Autom�vil();
		Autom�vil camioneta= new Autom�vil ("Diesel", "4x4", 5, "B�sica");
		
		carro.setCombuestibleUsado("Gasolina");
		carro.setTracci�n("Trasera");
		
		System.out.println(carro);
		System.out.println(camioneta+"\n");
		
		//Cuarto objeto
		Blusas Croptop = new Blusas();
		Blusas Corset = new Blusas("Coraz�n","Cuero",3);
		
		Croptop.setEscote("Halter");
		Croptop.setMaterial("Seda");
		
		System.out.println(Croptop);
		System.out.println(Corset+"\n");
		
		
		//Quinto objeto
		AkumaNoMi Paramecia = new AkumaNoMi();
		AkumaNoMi Zoan = new AkumaNoMi ("Tori Tori No Mi","Phoenix","Le permite transformarse en "
				+ "f�nix", "Marco");
		
		Paramecia.setNombre("Nagi Nagi");
		Paramecia.setUsuario("Donquixote Rosinante");
		
		System.out.println(Paramecia);
		System.out.println(Zoan);
		
	}

}
