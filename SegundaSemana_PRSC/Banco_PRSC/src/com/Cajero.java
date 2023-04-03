package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {
	//La clase Cajero va a permitirnos crear un objeto
	//que se encargar� de realizar las operaciones
	//Es decir, aqu� se va a implementar la l�gica

	//Atributos del cajero
	private String sucursal;
	private int idCajero=1;
	private int folio=1;
	
	//HashMAp - Me va a ayudar a simular una peque�a base de datos
	//Para buscar los datos de la cuenta, mediante un valor num�rico
	//que simular�a el n�mero de cuenta
	private HashMap<Integer, Cuenta> cuentas;
	
	//Los HashMap almacenan sus datos en pares (clave, valor)
	//Mi clave ser�a el n�mero de cuenta y el valor es mi ojeto cuenta
	
	public Cajero () {}

	
	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}

	//Primer m�todo para identificar la cuenta
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta para
		//pasarle el valor de ese objeto contenido
		//en el HashMap
		Cuenta cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Instanciar a un ticket, que de moemnto est� vac�o
		Ticket ticket = null;
		
		//Antes de hacer un deposito se busca una cuenta y si
		//existe entonces podemos realizar operaciones con ella
		
		//Si el m�todo de buscar cuenta, encuentra una y es diferente de nulo
		if(this.buscarCuenta(numCuenta)!=null) {
			//Asignamos dicho valor a una cuenta aqu�, para poder
			//Depositarle el saldo o monto
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Una vez hecho eso, necesitamos hacer ciertas validaciones
			
			//Si el monto a depositar es mayor que el saldo m�ximo de la cuenta
			if(monto>cuenta.getMax()) {
				System.out.println("El monto exceder�a el saldo m�ximo permitido en la cuenta");
				return ticket;
				//Si el saldo que tiene mi cuenta m�s el monto excede el l�mite m�ximo
			} else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El monto exceder�a el saldo m�ximo permitido en la cuenta");
				return ticket;
				//Si el d�posito puede realizarse
			} else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//generamos un ticket
				ticket = new Ticket(folio++, new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
		} else {
			System.out.println("No existe la cuenta.");
			return ticket;
		}
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		// Instanciar a un ticket, que de moemnto est� vac�o
			Ticket ticket = null;
			//Si el m�todo de buscar cuenta, encuentra una y es diferente de nulo
			if(this.buscarCuenta(numCuenta)!=null) {
				Cuenta cuenta = this.buscarCuenta(numCuenta);
		//Validamos el monto m�ximo a retirar, que no exceda el que el cajero permite
				if(monto>8000) {
					System.out.println("El monto excede el m�ximo permitido para el retiro");
					return ticket;
		//Validamos si el monto a retirar es mayor al saldo de la cuenta			
			} else if(cuenta.getSaldo()<monto) {
				System.out.println("El saldo es insuficiente");
				return ticket;
		//Validamos si el monto a retirar deja por debajo del saldo m�nimo a la cuenta
			} else if (cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("El monto dejar�a por debajo del m�nimo a la cuenta");
				return ticket;
				// Si el retiro puede realizarse
			} else { 
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket (folio++,new Date(), cuenta.getNombre(), cuenta.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
			}else {
				System.out.println("No existe la cuenta");
				return ticket;
			}
		}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		
		//Buscamos tanto la cuenta de origen como la cuenta de destino
		if(this.buscarCuenta(cuentaOrigen)!=null && this.buscarCuenta(cuentaDestino)!=null){
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
			//Si la cuenta origen tine un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realiazar la acci�n");
				return ticket;
				//Si el monto de la cuenta origen se quedara por debajo del m�nimo
			} else if(origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("La transferencia dejar�a por debajo del m�nimo");
				return ticket;
				//Si el monto a transferir excede el m�ximo en la cuenta de destino
			} else if (monto>destino.getMax()) {
				System.out.println("EL monto a transferir excede el l�mite m�ximo permitido en la cuenta de destino");
				return ticket;
				//Si el saldo de la cuenta destino m�s el monto que le van a transferir excede el monto m�ximo permitido
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El saldo de la cuenta destino exceder�a el l�mite m�ximo permitido");
				return ticket;
			} else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket (folio++,new Date(), origen.getNombre(), origen.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
		}else {
			System.out.println("No existe alguna de las cuentas");
			return ticket;
		}
	}
	
	
	
}
