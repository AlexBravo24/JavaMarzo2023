package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos{
	
	//La clase cajero va a permitirnos crear un objeto que ese encargara de 
	//realizar las operciones, es decir, a qui se implementara la logica
	
	//Atributos del cajero
	private String sucursal;
	private int idcajero=1;
	private int folio=1;
	
	//HashMap -Me va ayudar a simular una pequeña base de datos
	//Para buscar los datos de la cuenta, mediante un valor numerico
	//que simularia el numero de cuenta
	
	//Los HashMap almacenan los datos en pares (clave, valor)
	//Mi clave seria el numero de cuenta y el valor es mi objeto
	private HashMap<Integer, Cuenta> cuentas;
	
	public Cajero () {
		
	}

	public Cajero(String sucursal, int idcajero, HashMap<Integer, Cuenta> cuentas) {
		this.sucursal = sucursal;
		this.idcajero = idcajero;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta buscarCuenta(int numCuenta) {
		// Instanciamos un objeto cuenta para 
		//pasar el valor de ese objeto contenido en el HashMap
		Cuenta cuenta = cuentas.get(numCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket depositar(int numCuenta, double monto) {
		//Intanciar a un ticket, que de momento esta vacio
		Ticket ticket = null;
		//Antes de hacer un desposito se busca una cuenta y si existe una
		//cuenta podemos realizar operaciones con ella
		
		//Si el metodo de buscar cuenta, encuentra una y es diferente de null
		if(this.buscarCuenta(numCuenta)!=null) {
			//Asignamos dicho valor a una cuenta aqui, para poder 
			//Depositarle el saldo o monto
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Una vez dicho esto, necesitamos hacer ciertas validaciones
			
			//Si el monto a depositar es mayor que el saldo máximo de la cuenta
			if(monto>cuenta.getMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return ticket;
				//Si el saldo que tiene mi cuenta más el monto exceden el limite max
			}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El monto excede el saldo máximo permitido en la cuenta");
				return ticket;
				//Si el deposito puede realizarse, actualizamos saldo sumandole el monto
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Generamos un ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getSaldo(),cuenta.getNombre(), this.sucursal, idcajero);
				return ticket;
			}
		}else {
			System.out.println("No existe la cuenta");
			return ticket;
		}
		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		//Intanciar a un ticket, que de momento esta vacio
				Ticket ticket = null;
		//Si el metodo de buscar cuenta, encuentra una y es diferente de null
				if(this.buscarCuenta(numCuenta)!=null) {
					Cuenta cuenta = this.buscarCuenta(numCuenta);
		//Validamos el monto maximo a retirar, que no exceda el que el cajero permite
				if(monto>8000) {
					System.out.println("El monto excede el máximo permitido para el retiro ");
					return ticket;
				//Validamos si el monto a retirar es mayor al saldo de la cuenta
				}else if(cuenta.getSaldo()<monto) {
					System.out.println("El saldo es insuficiente");
					return ticket;
				}else if(cuenta.getSaldo()-monto<cuenta.getNim()) {
				//Validamos si el monto a retirar deja por debajo del saldo minimo a la cuenta
				System.out.println("El retorno a retirar dejaria por debajo del minimo a la cuenta");
				return ticket;
				//Si el retiro puede realizarse	
				}else {
					cuenta.setSaldo(cuenta.getSaldo()-monto);
					ticket = new Ticket(folio++, new Date(), cuenta.getSaldo(),cuenta.getNombre(), this.sucursal, idcajero);
					return ticket;			}	
				}else {
					System.out.println("No existe la cuenta");
					return ticket;
				}
			
	}

	@Override
	public Ticket tranferir(int cuentaOrigen, int cuentaDestino, double monto) {
		Ticket ticket = null;
		
		//Buscamos tanto la cuenta de origen como la cuenta de destino
		if(this.buscarCuenta(cuentaOrigen) !=null && this.buscarCuenta(cuentaDestino) !=null) {
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
			//Si la cuenta origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay montos suficiente para realizar la transferencia");
				return ticket;
				
				//Si el monto de la cuenta origen se quedara por debajo del minimo
			}else if (origen.getSaldo()-monto<origen.getNim()) {
				System.out.println("La transferencia te dejaria por debajo del minimo a la cuenta");
				return ticket;
				
				//Si el monto a transferir excede el máximo en la cuenta de destino
			}else if(monto>destino.getMax()) {
				System.out.println("El monto a transferir excede el limite máximo permitidoa a la cuenta destino ");
			    return ticket;
				//Si el saldo de la cuenta destino más el monto que le van a transferir excede el maximo
				}else if(destino.getSaldo()+monto>destino.getMax()) {
				  System.out.println("El saldo de la cuenta destino excederia el limite maximo permitidos ");
				  return ticket;
				}else {
					origen.setSaldo(origen.getSaldo()-monto);
					destino.setSaldo(destino.getSaldo()+monto);
					ticket = new Ticket(folio++, new Date(), origen.getSaldo(),origen.getNombre(), this.sucursal, idcajero);
					return ticket;
				}
			}else {
				System.out.println("");
				
				return ticket;
			}
		
	}
	
}


