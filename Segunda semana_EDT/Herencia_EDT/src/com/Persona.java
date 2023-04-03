package com;

public class Persona {

	
	private String name;
	private String sexo;
	private int age;
	
	public Persona() {

	}
	
	public Persona(String name, String sexo, int age) {
		super();
		this.name = name;
		this.sexo = sexo;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", sexo=" + sexo + ", age=" + age + "]";
	}
	
	
}
