package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero implements Metodos{
	/*La clase cajero va a permitirnos crear un objeto que se encargara de realizar las operaciones,
	 *es decir, aquí se va a implementar la logica.
	 */
	
	//Atributos del cajero.
	private String sucursal;
	private int idCajero = 1;
	private int folio = 0;
	
	/*HashMap - Me va a ayudar a simular una pequeña base de datos,para buscar los datos de la cuenta,
	 * mediante un valor numéricoque simularía el número de cuenta.
	 */
	
	//Los HashMap almacenan sus datos en pares (clave, valor)
	//Mi clave sería el número de cuenta y el valor es mi objeto cuenta.
	private HashMap<Integer, Cuenta> Cuenta;
	
	public Cajero() {}

	public Cajero(String sucursal, int idCajero, HashMap<Integer, com.Cuenta> cuenta) {
		super();
		this.sucursal = sucursal;
		this.idCajero = idCajero;
		this.Cuenta = cuenta;
	}

	/*
	 * Primer método para identificar la cuenta.
	 */
	@Override
	public com.Cuenta buscarCuenta(int numCuenta) {
		// TODO Auto-generated method stub
		//Instanciamos un objeto cuenta
		/*
		 * Pasarle el valor de ese objeto contenido en el HashMap
		 */
		Cuenta cuenta = Cuenta.get(numCuenta);
		
		return cuenta;
	}

	
	@Override
	public Ticket depositar(int numCuenta, double monto) {
		// TODO Auto-generated method stub
		//Instanciar a un ticket, que de momento está vacío.
		
		Ticket ticket = null;
		
		/*
		 * Antes de hacer un deposito se busca una cuenta y si existe entonces podemos
		 * realiza operaciones con ella.
		 */
		
		//Si el método de buscar, encuentra una y es diferente de nulo
		if(this.buscarCuenta(numCuenta)!=null) {
			//Asignamos dicho valor a una cuante aquí, para poder depositarle el saldo o monto. 
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Una vez hecho eso, necesitamos hacer ciertas validaciones.
			//Si el monto a depositar es mayor que el saldo máximo de la cuenta
			if(monto>cuenta.getMax()){
				System.out.println("El monto excedería el saldo máximo permitido en la cuenta");
				return ticket;
				//Si el saldo que tiene mi cuenta + el monto excede el límite máximo de la cuante
			}else if(cuenta.getSaldo()+monto>cuenta.getMax()) {
				System.out.println("El monto excedería el saldo máximo permitido en la cuenta");
				return ticket;
				//Si el deposito puede realizarse, actualizamos el saldo.
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				//Generamos un ticket
				ticket = new Ticket(folio++, new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
			
		}else {
			System.out.println("No hay una cuenta asosiada a ese cliente");
			return ticket;
		}
		
	}

	@Override
	public Ticket retirar(int numCuenta, double monto) {
		// TODO Auto-generated method stub		
		//Instanciamos a un ticket, que de momento esta vacio
		Ticket ticket = null;
		
		if(this.buscarCuenta(numCuenta)!=null) {
			Cuenta cuenta = this.buscarCuenta(numCuenta);
			//Validamos el monto máximo a retirar, que no exceda el que el cajero permite.
			if(monto>8000) {
				System.out.println("El monto excede el máximo permitido para el retiro");
				return ticket;
				//Validamos si el monto a retirar es mayor al saldo de la cuenta
			}else if(cuenta.getSaldo()<monto) {
				System.out.println("El saldo es insuficiente");
				return ticket;
				
				//Validamos si el monto a retirar deja por debajo del saldo mínimo a la cuenta
			}else if(cuenta.getSaldo()-monto<cuenta.getMin()) {
				System.out.println("El monto a retirar dejaría por debajo del mínimo la cuenta");
			return ticket;
			//Si el retiro puede realizarse
			}else {
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(),cuenta.getNombre(),cuenta.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
		}else {
			System.out.println("No existe la cuenta");
			return ticket;
		}
	}

	@Override
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto) {
		// TODO Auto-generated method stub
		
		Ticket ticket = null;
		//Buscamos tanto a la cuenta de origen, como a la cuante destino.
		if(this.buscarCuenta(cuentaOrigen)!=null && this.buscarCuenta(cuentaDestino)!=null) {
			Cuenta origen = this.buscarCuenta(cuentaOrigen);
			Cuenta destino = this.buscarCuenta(cuentaDestino);
			
			//Si la cuenta de origen tiene un saldo menor al que quiere transferir
			if(origen.getSaldo()<monto) {
				System.out.println("No hay fondos suficientes para realizar la operación");
				return ticket;
				//Si el monto de la cuanta de origen se quedara por debajo del mínimo 
			}else if (origen.getSaldo()-monto<origen.getMin()){
				System.out.println("La transferencia dejaría por debajo del mínimo a la cuenta");
				return ticket;
				
			}else if(monto>destino.getMax()) {
				System.out.println("El monto a transferir excede el límite máximo permitido en la cuenta destino");
				return ticket;
				//Si el saldo de la cuenta destino más el monto que le van a transferir excede el máximo
			}else if(destino.getSaldo()+monto>destino.getMax()) {
				System.out.println("El saldo de la cuenta destino excedería el límite máximo permitido");
				return ticket;
			}else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(),origen.getNombre(),origen.getSaldo(),this.sucursal,idCajero);
				return ticket;
			}
			
		}else {
			System.out.println("No existe alguna de las cuentas");
		}
		
		return ticket;
	}

	
	
	
	
	
}
