package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero  implements Metodos{
	// la clase cajero va a permitirnos crear un objeto
	//que se encargara de realizar las operaciones
	//es decir, aqui se va  a implementar la lógica
	// atributos del cajero
	private String sucursal;
	private int folio=1;
	private int idcajero=1;
	// HashMap- me va a ayudar a similar una pequeña base de 
	//datos para buscar los datos de la cuenta, mediante
	//un valor numerico, que simularia el num.de cuenta
	
	//los HashMap almacenan sus datos en pares(clave,valor)
	//Mi clave seria el numero de cuenta y el valor es mi objeto cuenta
	private HashMap<Integer,Cuenta> cuentas;
	
	public Cajero() {}

	public Cajero(String sucursal, int idcajero, HashMap<Integer, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.idcajero = idcajero;
		this.cuentas = cuentas;
	}
    // primer metodo para identificar cuenta 
	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		//instanciamos un objeto cuenta para pasarle el valor de ese
		//objeto contenido en el HashMap
		Cuenta cuenta=cuentas.get(numCuenta);
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// instanciar a un Ticket, que de momento esta vacio
		Ticket ticket=null;
		
		// antes de hacer un deposito se busca una cuenta y si
		//existe la cuenta entonces podemos realizar operaciones con ella
		
		//si el metodo de buscar cuenta, encuentra una y es diferente de null
		
		if(this.buscarCuenta(numCuenta)!=null) {
			//asignamos dicho valor a una cuenta aqui, para poder
			//depositarle el saldo o monto.
			Cuenta cuenta=this.buscarCuenta(numCuenta);
			//  una vez hecho eso, necesitamos hacer ciertas validaciones
			
			// si el monto a depositar excede el saldo max de la cuenta
			if(monto>cuenta.getMax()) {
				System.out.println("el monto excede el saldo maximo de la cuenta");
				return ticket;
				//si el saldo que tiene mi cuenta mas el monto exceden el limite max
			}else if(cuenta.getSaldo()+monto>cuenta.getMax()){
			System.out.println("el monto excede el saldo maximo de la cuenta");
			return ticket;
			}
			else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//generamos el ticket
				ticket=new Ticket(folio++,new Date(),cuenta.getSaldo(),cuenta.getNombre(),this.sucursal,idcajero);
			    return ticket;
			}
		}else {
			System.out.println("no existe la cuenta");
			return ticket;
		}
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		// instanciar a un Ticket, que de momento esta vacio
				Ticket ticket=null;
				//si el metodo de buscar cuenta, encuentra una y es diferente de null
				if(this.buscarCuenta(numCuenta)!=null) {
					Cuenta cuenta =this.buscarCuenta(numCuenta);
					//validamos el monto maximo a retirar, que no exceda lo que permita el cajero
					if(monto>8000) {
						System.out.println("el monto excede el monto permitido");
						return ticket;
						//validamos si el monto a retirar es mayor al saldo de cuenta
					}else if(cuenta.getSaldo()<monto) {
						System.out.println("el saldo es insuficiente");
						return ticket;
					}else if(cuenta.getSaldo()-monto<cuenta.getMin()){
					System.out.println("el monto a retirar dejaria por debajo del valor minimo de la cuenta");
					return ticket;
					}else {
						cuenta.setSaldo(cuenta.getSaldo()-monto);
						ticket=new Ticket(folio++,new Date(),cuenta.getSaldo(),cuenta.getNombre(),this.sucursal,idcajero);
					    return ticket;
					}
					//si el retiro puede realizarse
				}
				else {
					System.out.println("no existe la cuenta");
					return ticket;
				}
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		// instanciar a un Ticket, que de momento esta vacio
		Ticket ticket=null;
	//buscamos tanto la cuenta de origen como la cuenta de destino
		if(this.buscarCuenta(cuentaOrigen)!=null && this.buscarCuenta(cuentaDestino)!=null) {
		Cuenta origen=this.buscarCuenta(cuentaOrigen);
		Cuenta destino=this.buscarCuenta(cuentaDestino);
			// si la cuenta origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("no hay fondos suficientes para realizar la transferencia");
				return ticket;
				//si el monto de la cuenta se quedara por debajo del minimo
				
			}else if(origen.getSaldo()-monto<origen.getMin()) {
				System.out.println("la transferencia dejaria por debajo del minimo a la cuenta");
				return ticket;
				//si el monto a transferir excede el maximo en la cuenta de destino
				
			}else if(monto>destino.getMax()) {
				System.out.println("el monto a transferir excede el limite permitido");
				return ticket;
				// si el saldo de la cuenta destino mas el monto que le van a transferir excede el monto max
				
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("el saldo de la cuenta destino excedera el maximo permitido");
				return ticket;
				
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket=new Ticket(folio++,new Date(),origen.getSaldo(),origen.getNombre(),this.sucursal,idcajero);
			    return ticket;
		}
		}else {
			System.out.println("no existe alguna de las cuentas");
			return ticket;
		}
		
	}
	
	

}
