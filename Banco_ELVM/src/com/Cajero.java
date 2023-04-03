package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos {
	//la clase cajero  va a permitirnos crear un objeto
	//que se le ecargara de realizar las operaciones
	//es decir, aqui se va a implementar la logica(comportamiento)
	
	//atributos
	private String sucursal;
	private int idCajero=1;
	private int folio=1;
	
	
	
	//declaramos el hashmap- va a ayudar a simular una pequeña
	//base de datos para buscar los datos de la cuenta, mediante
	//un valor numerico que simularia el numero de cuenta.
	
	//los HashMap almacenan sus datos en pares(claves,valor)
	//mi clave seria el numero de cuenta y el valor es mi objeto cuenta
	
	private HashMap<Integer, Cuenta> cuentas;
	
	public Cajero() {}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		//super();
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}

	
	
	//primer metodo para identificar la cuenta
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//instanciaos un objeto cuenta para pasarle el valor
		//de ese objeto contenido en el HashMap
		Cuenta cuenta=cuentas.get(numCuenta);
		
		
		
		return cuenta;
	}

	
	
	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// Instanciar a un ticket, que de momento esta vacio
		Ticket ticket=null;
		//antes de hacer un deposito se busca una cuenta y si existe entonces
		//podemos empezar operaciones con ella
		//si el metodo de buscar cuenta, encuentra una y es diferente
		//de nulo
		if(this.buscarCuenta(numCuenta)!=null) {
			//adigamos dicho valor a una cuenta aqui, para poder
			//depositar el saldo o moton
			Cuenta cuenta=this.buscarCuenta(numCuenta);
			//una vwez hecho eso, necesitamos hacer ciertas validaciones
			
			//si el moto a depositar es mayor que  el salgo maximo de la cuenta
			if(monto>cuenta.getMax()) {
			System.out.println("el moto excederia el saldo maximo de la cuenta");
			return ticket;
			
			//si el saldo que tiene mi cuenta mas el monto excede el limite maximo
			}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("el moto excederia el saldo maximo permitido en la cuenta");
				return ticket;
				//si el deposito puede realizarse. actualizamos saldo sumandole el monto
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//generamos un tcket
				ticket=new Ticket(folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
			}else {
				System.out.println("no existe la cuenta");
				return ticket;
			//que pasaria que llegase a encontrar no existe?
			//entonces ttenemos que poner un if
			
		}

		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
	Ticket ticket=null;
		// Instanciar a un ticket, que de momento esta vacio
		//si el metodo de buscar cuenta, encuentra una y es diferente
				//de nulo
				if(this.buscarCuenta(numCuenta)!=null) {
					Cuenta cuenta=this.buscarCuenta(numCuenta);
					//validar el monto maximo a retirar, que no xceda
					//el que el cajero permite
					if(monto>8000) {
						System.out.println("el monto excede el maximo permitido para el retiro");
						return ticket;
						//validamos si el monto a retirar es mayor al saldo de la cuenta
						
					}else if(cuenta.getSaldo()<monto) {
						System.out.println("el saldo es insuficiente");
						return ticket;
						//validamos si el monto a retir deja por debajo del saldo minimo a la cuenta
						
					}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
						System.out.println("e monto a retirar dejaria por debajo del minimo a la cuenta");
						return ticket;
						//si el retiro puede realizarse
					}else {
						cuenta.setSaldo(cuenta.getSaldo()-monto);
						ticket=new Ticket(folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
						return ticket;
						
					}
					
				}else {
					System.out.println("no existe la cuenta");
					return ticket;
				//que pasaria que llegase a encontrar no existe?
				//entonces ttenemos que poner un if
				
			}

			
		}
		
		
	

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		
		Ticket ticket=null;//instanciar
		
		//buscamos tanto la cuenta de origen, comola cuenta
		//del destino
		if(this.buscarCuenta(cuentaOrigen)!=null&& this.buscarCuenta(cuentaDestino)!=null) {
			Cuenta origen=this.buscarCuenta(cuentaOrigen);
			Cuenta destino=this.buscarCuenta(cuentaDestino);
			//validaciones anidadas, si la cuenta origen tene un
			//saldo menor  al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("no hya fondos suficientes para realizar la transferencia");
				return ticket;
				//si el monto de la cuenta origen se quedara por debajo
				//del minimo qe tampoco permita hacer la transaccion
				
			}else if(origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("la transferencia dejaria por debajo el minimo a la cuenta");
				return ticket;
				//si el moto a transferir exece el maximo en la cuenta destino
			}else if(monto>destino.getMax()) {
				System.out.println("el monto a transferir excede el limite maximo permitido en la cuenta destino");
				//si el saldo de la cuenta destino mas el monto que van a transferir excede el maximo
				return ticket;
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("el saldo de la cuenta destino excederia el limite maximo permitido");
				return ticket;
				
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket=new Ticket(folio++,new Date(),origen.getNombre(),origen.getSaldo(),this.sucursal,idCajero);
				return ticket;
				
			}
			
		
		}else {
			System.out.println("no existe alguna de las cuentas");
			return ticket;
		}
		
		
	}
	
	
	
	
	
	
	
	
	

}
