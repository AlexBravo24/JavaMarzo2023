package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {
	
	//La clase cajero va a permitirnos crear un objeto que se encargara de realizar las operaciones
	//Es decir aqui se va implementar la logica
	
	//ATRIBUTOS DEL CAJERO
	private String sucursal;
	private int idCajero=1;
	private int folio=1;
	
	//HashMap - me va ayudar a simular una peque;a base de datos, para buscar los datos de la cuenta
	//mediante un valor numerico que simularia el numero de cuenta
	
	//Los HashMap almacenan sus datos en pares (clave, valor)
	//Mi clave seria el numero de cuenta y el valor es mi objeto cuenta
	private HashMap<Integer, Cuenta> cuentas;
	
	public Cajero() {}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}

	//Pimer metodo para identificar la cuenta
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//Instanciamos un objeto cuenta para pasarle el valor de ese objeto obtenido en el HashMap
		Cuenta cuenta = cuentas.get(numCuenta);
				
		return cuenta;
		
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Instanciar un ticket, que de momento este vacio
		Ticket ticket = null;
		//Antes de hacer un deposito se busca una cuenta y si existe entonces podemos realizar operaciones con ella
		
		//Si el metodo de buscar cuenta, encuentra una y es diferente de nulo
				if(this.buscarCuenta(numCuenta) !=null) {
					//Asiganamos dicho valor a una cuenta aqui, para poder
					//Depositarle el saldo o monto
					Cuenta cuenta = this.buscarCuenta(numCuenta);
					
					//Una vez hecho eso, necesitamos hacer ciertas validaciones
					
					//si el monto a depositar es mayor que el saldo maximo de la cuenta
					if(monto>cuenta.getMax()) {
						System.out.println("EL MONTO EXCEDERIA EL SALDO MAXIMO PERMITIDO EN LA CUENTA");
						return ticket;
						//Si el saldo que tiene mi cuenta mas el monto exceden el limite maximo de la cuenta
					}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
						System.out.println("EL MONTO EXCEDERIA EL SALDO MAXIMO PERMITIDO EN LA CUENTA");
						return ticket;
						//si el deposito puede realizarse actualizamos saldo sumandole el monto
					}else {
						cuenta.setSaldo(cuenta.getSaldo()+monto);
						//generamos un ticket
						ticket = new Ticket(folio++, new Date(), cuenta.getNombre(), cuenta.getSaldo(), this.sucursal,idCajero);
						return ticket;
					}
					
					
				}else {
					System.out.println("NO EXISTE LA CUENTA");
					return ticket;
				}
		
			
	}
	

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		//Instanciar un ticket que de momento este vacio
		Ticket ticket = null;
		//si el metodo de buscar cuenta, encuentra una y es diferente de nulo
		if(this.buscarCuenta(numCuenta)!=null) {
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Validamos el monto maximo a retirar, que no exceda el que el cajero permite
			if(monto>8000) {
				System.out.println("EL MONTO EXCEDE EL MAXIMO PERMITIDO PARA EL RETIRO");
				return ticket;
			//VALIDAMOS SI EL MONTO A RETIRAR ES MAYOR A SALDO DE LA CUENTA		
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("EL SALDO ES INSUFICIENTE");
				return ticket;
			//validamos si el monto a retirar deja por debajo del saldo minimo de a la	
			}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("EL MONTO A RETIRAR DEJARIA POR DEBAJO DEL MINIMO A LA CUENTA");
				return ticket;
				//si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
		}else {
			System.out.println("NO EXISTE LA CUENTA");
			return ticket;
		}
		
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		//Instanciar un ticket, que de momento este vacio
		Ticket ticket = null;
		
		//Buscamos tanto la cuenta de origen como la cuenta de destino
		if(this.buscarCuenta(cuentaOrigen)!=null && this.buscarCuenta(cuentaDestino)!=null) {
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
			//SI la cuenta origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("NO HAY FONDOS SUFICIENTES PARA REALIZAR LA TRANSFERENCIA");
				return ticket;
			//si el monto de la cuenta origen se quedara por debajo del monto minimo
			}else if(origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("LA TRANSFERENCIA DEJARIA POR DEBAJO DEL MINIMO A LA CUENTA");
				return ticket;
			//si el monto a transferiri excede del maximo en la cuenta destino	
			}else if(monto>destino.getMax()) {
				System.out.println("EL MONTO A TRANSFERIR EXCEDE EL LIMITE MAXIMO PERMITIDO EN LA CUENTA DESTINO");
				return ticket;
				//SI EL SALDO DE LA CUENTA DESTINO MAS EL MONTO QUE LE VAN A TRANSFERIR EXCEDE EL MAXIMO
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("EL SALDO DE LA CUENTA DESTINO EXCEDERIA EL LIMITE PERMITIDO");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), origen.getNombre(),origen.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
		}else {
			System.out.println("NO EXISTE ALGUNA DE LAS CUENTAS");
			return ticket;
		}
		
	}
	
	

}
