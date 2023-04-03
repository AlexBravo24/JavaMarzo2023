package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {

	//La clase cajero va a permitirnos crear un objeto 
	//que se encargar� de realizar las operaciones 
	//Es decir, aqu� se va a implementar la l�gica
	
	//Atributos del cajero
	private String sucursal;
	private int idCajero=1;
	private int folio=1;
	
	//HashMap-  me va a ayudar a simular peque�a base de datos
	//para buscar los datos de la cuenta, mediante un valor num�rico, 
	//que simular�a el n�mero de cuenta
	
	
	//Los HashMaps almacenan sus datos en pares (clave,valor)
	//Mi clave ser�a el n�mero de cuenta y el valor es mi objeto cuenta
	
	private HashMap<Integer, Cuenta> cuentas;
	
	public Cajero () {}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}
//primer m�todo para identificar la cuenta
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta 
		//para pasarle el valor de ese objeto contenido 
		//en el HashMap
		Cuenta cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Instanciar a un ticket, que de momento est� vaci� 
		Ticket ticket = null; {
		
	//Antes de hacer un deposito se busca una cuenta
	//y si existe podemos realizar operaciones con �sta.
	
		//si el m�todo de buscar cuenta encuentra una y es 
		//diferente del valor nulo 
		if(this.buscarCuenta(numCuenta)!= null) {
		//asignamos dicho valor a una cuenta aqu�, para poder 
		// depositarle el saldo o monto 
			Cuenta cuenta = this.buscarCuenta(numCuenta);
	//una vez hecho, necesitamos hacer ciertas validaciones 
	
		//Si el monto a depositar excede el saldo m�ximo de la cuenta
		if(monto>cuenta.getMax()) {
System.out.println("El monto exceder�a el saldo m�ximo de la cuenta");
//Si el saldo que tiene mi cuenta m�s el monto exceden el l�mite m�ximo permitido
		}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
			System.out.println("El monto exceder�a el saldo m�ximo permitido en la cuenta");
			return ticket;
	//Si el deposito puede realizarse acualizamos el saldo sumandole el monto
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			//Generamos un ticket
			ticket=new Ticket(folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
			return ticket;
		}
		} else {
			System.out.println("No existe la cuenta");
			return ticket;
		}
		return ticket;
	}
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		//Instanciar a un ticket, que de momento est� vaci� 
				Ticket ticket = null;
				if(this.buscarCuenta(numCuenta)!= null) {
				Cuenta cuenta = this.buscarCuenta(numCuenta);
		//Validamos el monto m�ximo a retirar, que no exceda el que el cajero permite
			if(monto>8000) {
				System.out.println("El monto excede el m�ximo permitido para el retiro");
		//validamos si el monto a retirar es mayor al saldo de la cuenta 
				
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("El saldo es insuficiente");
				return ticket;
	//validamos si el monto a retirar deja por debajo del saldo minimo a la cuenta 
			}else if (cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("El monto a retirar dejar�a por debajo del m�nimo la cuenta");
				return ticket;
		//si el retiro puede realizarse 
				}else  {
					cuenta.setSaldo(cuenta.getSaldo()-monto);
					ticket=new Ticket(folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
					return ticket;
				}
			}else {
				System.out.println("No existe la cuenta");
			return ticket;
			}
				return ticket;
	} 
	
	
	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		//Instanciar a un ticket, que de momento est� vaci� 
		Ticket ticket = null;

		//Buscamos tanto la cuenta de origen, como la cuenta de destino
		if(this.buscarCuenta(cuentaOrigen)!= null && this.buscarCuenta(cuentaDestino)!= null) {
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
		//Si la cuenta origen tiene un saldo menor al que quiere transferir 
			if (origen.getSaldo()<monto) {
			System.out.println("No hay fondos suficientes para realizar la transferencia");
			return ticket;
		//Si el monto de la cuenta origen se quedar� por debajo del m�nimo 
	
			}else if (origen.getSaldo()-monto<origen.getMin()) {
		System.out.println("La transferencia dejar�a por debajo del m�nimo a la cantidad");	
		return ticket;
		//Si el monto a transferir excede el m�ximo en la cuenta de destino 
			}else if (monto>destino.getMax()) {
			System.out.println("El monto a transferir excede el l�mite m�ximo permitido en la cuenta destino ");
		return ticket;
			//Si el saldo de la cuenta destino m�s el monto que le van a transferir excele el l�mite
			}else if (destino.getSaldo()+monto>destino.getMax()) {
			System.out.println("El saldo de la cuenta destino excederia el l�mite m�ximo permitido ");	
			return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket=new Ticket(folio++,new Date(),origen.getNombre(),origen.getSaldo(),this.sucursal,idCajero);	
			return ticket;
			}
			
			}else {
				System.out.println("No existe alguna de las cuentas");
				return ticket;
			}
	}

	
	
	
	
	
}
