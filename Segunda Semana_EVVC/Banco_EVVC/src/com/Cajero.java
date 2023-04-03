package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements M�todos {
	
	//La clase cajero va a permitirnos crear un objeto que se encargar� de realizar las operaciones
	//es decir, aqu� se va a implementar la l�gica
	
	private String sucursal;
	private int idCajero=1;
	private int folio=1;
	
	//HashMap - Me va  a ayudar a simular una peque�a base de datoss para buscar los datos de la 
	//cuenta, mediante un valor num�rico que simular�a el n�mero de cuenta
	//Los HashMap almacenan los datos en pares (key,valor), en este caso mi clave seria el n�mero
	//de cuenta y el valor es mi objeto cuenta
	private HashMap <Integer, Cuenta> cuentas;
	
	public Cajero () {}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}

	//Primer m�todo para identificar cuenta
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta para pasarle el valor de ese objeto contenido en el HasMap
		Cuenta cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Primero instanciamos un ticket que no tenga valor
		Ticket ticket =null;
		//Antes de hacer un deposito se busca una cuenta y si existe entonces podemos realizar
		//operaciones con ella 
		
		//Si el m�todo de buscar cuenta encuentra una y es diferente de nulo
		if(this.buscarCuenta(numCuenta) != null) {
			//Asignamos dicho valor a una cuenta aqu�, para poder depositarle el saldo o monto
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Una vez hecho eso necesitamos hacer ciertas validaciones
			//Si el monto a depositar excede el monto m�ximo de la cuenta
			if (monto>cuenta.getMax()) {
				System.out.println("El monto exceder�a el saldo m�ximo permitido en la cuenta.");
				return ticket;
				
			} else if (cuenta.getSaldo()+monto>cuenta.getMax()){ 
				System.out.println("El monto exceder�a el saldo m�ximo permitido en la cuenta.");
				return ticket;
				
			} else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Generamos un ticket
				ticket=new Ticket(folio++, new Date(),cuenta.getNombre(), cuenta.getSaldo(), this.sucursal,idCajero);

				return ticket;
			}
		}else {
			System.out.println("No existe una cuenta asociada a ese N�mero de cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		// Instanciar un ticket vac�o
		Ticket ticket=null;
		if(this.buscarCuenta(numCuenta) != null) {
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Validamos el monto m�ximo a retirar, que no exceda el que el cajero permite
			if(monto >8000) {
				System.out.println("El monto excide el m�ximo permitido para el retiro");
				return ticket;
				//Validamos si el monto a retirar es mayor al saldo de la cuenta
				
			}else if (cuenta.getSaldo()<monto){
				System.out.println("Saldo insuficiente");
				return ticket;
				
				//Validamos di el monto a retirar deja por debajo el saldo m�nimo de la cuenta
			}else if (cuenta.getSaldo()-monto <cuenta.getMin()){
				System.out.println("El monto a retirar dejar�a por debajo del m�nimo la cuenta");
				return ticket;
				
				//Si el retiro se puede realizar
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket=new Ticket(folio++, new Date(),cuenta.getNombre(), cuenta.getSaldo(), this.sucursal,idCajero);

				return ticket;
				
			}
			
		}else {
			System.out.println("No existe una cuenta asociada a ese N�mero de cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		// Generamos ticket en blanco
		Ticket ticket =null;
		
		//Buscamos la cuenta de origen y la cuenta de destino
		if(this.buscarCuenta(cuentaOrigen)!= null && this.buscarCuenta(cuentaDestino)!= null) {
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
			
			//Si la cuenta origen tiene un saldo menor a la que quiere transferir
			if(origen.getSaldo()<monto) {
			System.out.println("Saldo insuficiente para realizar transferencia");
			return ticket;
			
			//Si el monto de la cuentaa de origen se quedara pro debajo del m�nimo
			}else if (origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("La transferencia dejar�a el saldo por debajo del m�nimo en la cuenta.");
				return ticket;
				
				//Si el monto a transferir excede el m�ximo en la cuenta de destino
			}else if (monto>destino.getMax()) {
				System.out.println("El monto a transferir excede el m�ximo que permite la cuenta de destino");
				return ticket;
			}else if (destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El saldo de la cuenta destino exceder�a el l�mite m�ximo permitico");
				return ticket;
					
			} else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket=new Ticket(folio++, new Date(),origen.getNombre(), origen.getSaldo(), this.sucursal,idCajero);
				return ticket;	
			}		
		}else {
			System.out.println("No existe alguna de las cuentas");
			return ticket;
		}
		
	}
	

}
