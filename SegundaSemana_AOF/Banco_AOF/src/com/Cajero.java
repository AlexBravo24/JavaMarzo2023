package com;

import java.util.Date;
import java.util.HashMap;

//se agregan cuando se pone implements (add)
public class Cajero implements Metodos {
	
	
	
	
	
	
	
	//La clase cajero va a permitir crear un objeto que se encargara de realizar las operaciones
	//es decir implementar la logica 
	//atributos del cajero
	private String sucursal;
	private int idCajero=1;
	private int folio=1;
	
	//HashMap valor que ayudara a simular una pequeña base de datos
	//para buscar los datos de la cta mediante un valor numerico que simularia
	//nuemero de cta
	
	//HashMap almacena los datos en pares CLAVE VALOR
	//CLAVE = NUMEROcuenta valor=objeto cta
	private HashMap<Integer, Cuenta> cuentas;
	
	public Cajero(){}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, Cuenta> cuentas) {
		//super();
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.cuentas = cuentas;
	}
//identificamos la cuenta
	
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		///instanciamos un objeto cta
		//ya cuando identifica en el HASh se asigna aqui a cta 
		//para pasarle el valor a ese obj 
		Cuenta cuenta  = cuentas.get(numCuenta);
		
		return cuenta;
	}

	
	
	
	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// instanciar de momento que esta vacio
		
		Ticket ticket= null;//objeto auxiliar
		
		//antes d ehacer un deposito de busca una cta y si existe la cta
		//entonces podemos hacer operaciones
		
		if(this.buscarCuenta(numCuenta)!=null) {
			
			//hacemos operaciones para hacer deposito asignando en valor a la cta
			
			Cuenta cuenta =this.buscarCuenta(numCuenta);
			
			//una vez hacemos validaciones 
			//si el monto a depositar excede el saldo maximo de la cta
			
			if(monto>cuenta.getMax()) {
				System.out.println("El monto excederia el maximo permitido en la cta");
				return ticket;
				
				//si el monto que tiene mi cta mas el monto que se deposita sumas y exede al limite max 
			}else if (cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El monto excederia el maximo permitido en la cta");
				return ticket;
				//si el deposito puede hacerse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				
				//generamos un tiket
				ticket = new Ticket (folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
			
				return ticket;
			}
			
			
		}else {
			System.out.println("No hay una cta asociada, NO EXISTE!");
			return ticket;
		}
			
	}
	

	@Override
	public Ticket retirar(int numCuenta, double monto) {
	
		//INSTANCIAMOS UN TICKET VACIO
		
		Ticket ticket= null;//objeto auxiliar
		
		if(this.buscarCuenta(numCuenta)!=null) {
			Cuenta cuenta =this.buscarCuenta(numCuenta);
			
			//validaciones
			//validamos el monto max a retirar que no exceda lo que el 
			//cajero permite
			
			if(monto>8000) {
				System.out.println("El monto excede el maximo permitido para su retiro");
				return ticket;
				//validamos si el monto a retirar es mayor al saldo de la cta
				
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente");
				return ticket;
				//validamos si el monto a retirar deja por debajo al saldomin a la cta
			}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("El monto a retirar dejaria por debajo del minimo la cta");
				return ticket;
				
				//si el retiro puede realizarse 
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket (folio++,new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
				
				return ticket;
			}
						
			}else {
				System.out.println("No hay una cta asociada, NO EXISTE!");
				return ticket;
			}
				
		}
	

	@Override
	public Ticket trasferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket= null;//objeto auxiliar
		//buscamos la cta origen y destino
		if(this.buscarCuenta(cuentaOrigen)!=null && this.buscarCuenta(cuentaDestino)!=null) {
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
			
			
			//si la cta origen tiene un saldo menor al que quiere transferir 
			
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la transferencia");
				return ticket;
				
				//si el monto de la cta origen se quedara por debajo delminimo
			}else if(origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("La transferencia dejaria por debajo del minimo a la cta");
				return ticket;
				//si el mopnto a transferir excede el max en la cta destino
			}else if(monto>destino.getMax()) {
				System.out.println("El monto a transferir excede el limite maximo en la cta de destino");
				return ticket;
				
				//si el saldo de la cta de destino mas el monto a transferir escede el max hay que impedir
				
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El saldo de la cta destino escederia el limite maximo permitido");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket (folio++,new Date(),origen.getNombre(),origen.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
		}else {
			System.out.println("No existe alguna de las cuentas");
			return ticket;
		}	
		}		
		}//cierra
