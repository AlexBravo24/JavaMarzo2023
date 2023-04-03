package com;

public class Videojuego {
	private String name;
	private String company;
	private int release_year;
	private String genre;
	
	public Videojuego() {};	//Constructor vacío
	
	public Videojuego(String name, String company, int release_year, String genre) {
		super();
		this.name = name;
		this.company = company;
		this.release_year = release_year;
		this.genre = genre;
	}

}
