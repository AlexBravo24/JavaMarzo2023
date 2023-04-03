package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements IMetodos{
	//La clase cajero va a permitirnos crear un objeto que se 
	//encargara de realizar las operaciones, es decir, aqui
	//se va a implementar la logica
	
	//Atributos del cajero
	private String sucursal;
	private int folio = 1;
	private int idCajero = 1;
	
	//Declarar Hashmap - Me va a ayudar a similar una pequeña base de datos
	//Para buscar los datos de la cuenta mediante un valor numerico que simularia
	//el numero de cuenta
	
	//Los HashMap almacenan valores en pares (Clave, Valor)
	//mi clave seria el numero de cuenta y el valor es mi objeto cuenta
	private HashMap<Integer, Cuenta> cuentas;
	
	public Cajero () {}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}

	//Primer metodo para identificac cuenta
	@Override
	public Cuenta buscarcuenta(int numCuenta) {
		//Instanciamos un objeto cuenta
		//Pasarle el valor de ese objeto contenido en el HashMap
		Cuenta cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Instanciar a un ticket, que de momento esta vacio
		Ticket ticket = null; 
		
		//Antes de hacer un deposito se busca una cuenta y si
		//existe entonces podemos realizar operaciones con ella
		
		//Si el metodo buscar cuenta, encuentra una y es diferente de nulo
		if (this.buscarcuenta(numCuenta)!=null) {
			//asignamos dicho valor a una cuenta aqui, para poder 
			//depositarle el saldo o monto
			Cuenta cuenta = this.buscarcuenta(numCuenta);
			//Una vez hecho eso necesitamos realizar ciertas validaciones
			
			//Si el monto a depositar excede el saldmo maximo
			if (monto>cuenta.getMax()) {
				System.out.println("El monto excederia el saldo máximo permitido en la cuenta.");
				return ticket;
				//si el saldo que tiene mi cuenta más el monto exceden el limite maxino
			}else if (cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El monto excederia el saldo máximo permitido en la cuenta.");
				return ticket;
				//si el deposito puede realizarce
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Generamos un ticket
				ticket = new Ticket (folio++, new Date(),cuenta.getSaldo(), cuenta.getNombre(), this.sucursal, idCajero);
				return ticket;
			}

		} else {
			System.out.println("No existe la cuenta");
			return ticket;
		}
		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		// Instanciar a un ticket, que de momento esta vacio
		Ticket ticket = null; 
		//Si el metodo buscar cuenta, encuentra una y es diferente de nulo
		if (this.buscarcuenta(numCuenta)!=null) {
			Cuenta cuenta = this.buscarcuenta(numCuenta);
		//Validamos que el monto maximo a retirar, que no exceda el que el cajero permite
		if (monto>8000) {
			System.out.println("El monto excede el máximo permitido para el retiro.");
			return ticket;
		//Validamos si el monto a retirar es mayor al saldo de la cuenta
		}else if (cuenta.getSaldo()<monto) {
			System.out.println("Saldo insuficiente.");
			return ticket;
		//Validamos si el monto a retirar deja por de bajo del saldo minimo a la cuenta
		} else if (cuenta.getSaldo()-monto < cuenta.getMin()) {
			System.out.println("El monto a retirar dejaria por debajo del minimo la cuenta");
			return ticket;
		//si el retiro puede realizarse
		} else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			ticket = new Ticket (folio++, new Date(),cuenta.getSaldo(), cuenta.getNombre(), this.sucursal, idCajero);
			return ticket;
		}
		} else {
			System.out.println("No existe la cuenta");
			return ticket;
			
		}
		
	}

	@Override
	public Ticket transferir(int numCuenta, int cuentaDestino, double monto) {
		// 
		Ticket ticket = null; 
		
		// Buscamos tanto la cuenta de origen como la cuenta destino
		if (this.buscarcuenta(numCuenta)!=null && this.buscarcuenta(cuentaDestino)!=null) {
			Cuenta origen= this.buscarcuenta(numCuenta);
			Cuenta destino= this.buscarcuenta(cuentaDestino);
			
			// si la cuenta origen tiene un saldo menor al que quiere transferir
			if (origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia.");
				return ticket;
			//si el monto de la cuenta origen se quedara por debajo del minimo
			} else if (origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("La transferencia dejaria por debajo de minimo a la cuenta.");
				return ticket;
			//si el monto transferido excede el maximo de la cuenta
			} else if (monto>destino.getMax()) {
				System.out.println("El monto a transferir excede el liminte maximo permitido en la cuenta destino.");
				return ticket;
			//si el saldo de la cuenta destino mas el monto excede el saldo maximo hay que restringir
			} else if (destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El saldo de la cuena destino excederia el liminte maximo permitido.");
				return ticket;
			} else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket (folio++, new Date(),origen.getSaldo(), origen.getNombre(), this.sucursal, idCajero);
				return ticket;
			}
		}else {
			System.out.println("No existe alguna de las cuentas.");
			return ticket;
		}
		
	}
	
	
	
	
	

}
