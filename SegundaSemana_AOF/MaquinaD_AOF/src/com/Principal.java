package com;
import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Compra> compras = new HashMap<Integer, Compra>();
		compras.put(2001, new Compra("Doritos",10,1,12,"Efectivo"));
		compras.put(2002, new Compra("Sabritas",11,2,12,"Efectivo"));
		compras.put(2003, new Compra("Chetos",11,3,12,"Efectivo"));
		
		Maquina papitas = new Maquina("PlazaAmericas, Toluca", 1517,compras);
		
//PROBAMOS EL METODO DE DEPOSITar
		//el limite son 12 productos
		
		System.out.println(papitas.llenar(2003,2));
		
		
		//venta
		
		System.out.println(papitas.venta(2003,10));
		
	}

}
