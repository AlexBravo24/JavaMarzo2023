package com;

public class Principal {

	public static void main(String[] args) {
		// La clase principal debe ser única, es la que se encarga de ejecutar el proyecto
		// y es la única que debe tener el método main
		
		//Aquí podemos instanciar nuestro objeto, instanciar=crear un objeto
		//Pregunta entrevista- Diferencia entre clase y objeto o intancia
		//El objeto esta creado a partir de la clase
		//La clase es la plantilla y la instancia es la creación del objeto
		
		//Instanciar o crear a un objeto Perro, doberman sería el objeto de mi clase
		
		Perro doberman = new Perro();
		Perro dalmata= new Perro("Fido",5,15.5, "Moteado");
		
		//Con ayuda del constructor vacío puedo establecer los valores de sus atributos mediante los
		//getters y setters
		
		doberman.setNombre("Firulais");
		doberman.setEdad(2);
		doberman.setPeso(10.6);
		doberman.setColor("Negro");
		
		
		System.out.println(doberman);
		System.out.println(dalmata+"\n");

		/*Actividad
		 * Modelar 5 objetos mínimo 3 atributos por objeto máximo 5
		 * Crear métodos constructores
		 * Getters y Setters
		 * Método toString
		 * Instanciarlos en la clase principal
		 * Instanciar un objeto con todos los parámetros 
		 * Instanciar otro de la misma clase con uno o dos parámetros
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
		Bicicleta ruta=new Bicicleta(24, 26, "Aluminio", "Sin suspensión","V");
		
		mtb.setSuspensión("Doble");
		mtb.setFrenos("De disco, hidrauilica");
		mtb.setNúmeroVelocidades(21);
		
		System.out.println(mtb);
		System.out.println(ruta+"\n");
		
		//Tercer objeto
		Automóvil carro = new Automóvil();
		Automóvil camioneta= new Automóvil ("Diesel", "4x4", 5, "Básica");
		
		carro.setCombuestibleUsado("Gasolina");
		carro.setTracción("Trasera");
		
		System.out.println(carro);
		System.out.println(camioneta+"\n");
		
		//Cuarto objeto
		Blusas Croptop = new Blusas();
		Blusas Corset = new Blusas("Corazón","Cuero",3);
		
		Croptop.setEscote("Halter");
		Croptop.setMaterial("Seda");
		
		System.out.println(Croptop);
		System.out.println(Corset+"\n");
		
		
		//Quinto objeto
		AkumaNoMi Paramecia = new AkumaNoMi();
		AkumaNoMi Zoan = new AkumaNoMi ("Tori Tori No Mi","Phoenix","Le permite transformarse en "
				+ "fénix", "Marco");
		
		Paramecia.setNombre("Nagi Nagi");
		Paramecia.setUsuario("Donquixote Rosinante");
		
		System.out.println(Paramecia);
		System.out.println(Zoan);
		
	}

}
