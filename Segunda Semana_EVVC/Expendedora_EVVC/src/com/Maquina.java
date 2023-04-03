package com;

import java.util.HashMap;

public class Maquina implements Métodos {
	
	private double dinero;

	
	private HashMap<String, Producto>productos;
	
	public Maquina () {}


	public Maquina(double dinero, HashMap<String, Producto> productos) {
		this.dinero = dinero;
		this.productos = productos;
	}








	@Override
	public Producto buscarProducto(String claveProducto) {
		Producto producto = productos.get(claveProducto);
		return producto;
	}

	@Override
	public Pantalla comprar (String claveProducto, double dinero) {
		Pantalla pantalla = null;
		if (this.buscarProducto(claveProducto)!=null) {
			Producto producto = this.buscarProducto(claveProducto);
			
			if(producto.getStock()>0) {
				producto.setStock(producto.getStock()-1);
	
				if (producto.getPrecio()<dinero) {
					double cambio=(dinero-producto.getPrecio());
					pantalla = new Pantalla (producto.getNombre(),producto.getPrecio(),dinero ,cambio);
					return pantalla;
				}else if (producto.getPrecio()>dinero) {
				System.out.println("Dinero insuficiente");
				return pantalla;
				}
			} else {
				System.out.println("Sin stock disponible");
				return pantalla;
			}
			
		} else {
			System.out.println("Producto no encontrado");
			return pantalla;
				}
			
		return pantalla;
		
	}
}
