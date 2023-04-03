package com;

public class Conectividad {
	private String wife;
	private String Bluetooth;
	private String Bateria;
	
	public Conectividad(){
		
	}

	public Conectividad(String wife, String bluetooth, String bateria) {
		
		this.wife = wife;
		Bluetooth = bluetooth;
		Bateria = bateria;
	}

	public String getWife() {
		return wife;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}

	public String getBluetooth() {
		return Bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		Bluetooth = bluetooth;
	}

	public String getBateria() {
		return Bateria;
	}

	public void setBateria(String bateria) {
		Bateria = bateria;
	}

	@Override
	public String toString() {
		return "Conectividad [wife=" + wife + ", Bluetooth=" + Bluetooth + ", Bateria=" + Bateria + "]";
	}
	
	

}
