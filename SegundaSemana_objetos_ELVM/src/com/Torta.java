package com;

public class Torta {
	private String jamon;
	private String Adereso;
	private String TPan;
	private String TQueso;
	
	//Public Torta() {}
	public Torta() {}

	public Torta(String jamon, String adereso, String tPan, String tQueso) {
		//super();
		this.jamon = jamon;
		Adereso = adereso;
		TPan = tPan;
		TQueso = tQueso;
	}

	public String getJamon() {
		return jamon;
	}

	public void setJamon(String jamon) {
		this.jamon = jamon;
	}

	public String getAdereso() {
		return Adereso;
	}

	public void setAdereso(String adereso) {
		Adereso = adereso;
	}

	public String getTPan() {
		return TPan;
	}

	public void setTPan(String tPan) {
		TPan = tPan;
	}

	public String getTQueso() {
		return TQueso;
	}

	public void setTQueso(String tQueso) {
		TQueso = tQueso;
	}

	@Override
	public String toString() {
		return "Torta [jamon=" + jamon + ", Adereso=" + Adereso + ", TPan=" + TPan + ", TQueso=" + TQueso + "]";
	}
	
	

}
