package com;

public class Pizza {
	private int CArina;
	private int CsalsaT;
	private String TBase;
	private String TQueso;
	
	public Pizza() {}

	public Pizza(int cArina, int csalsaT, String tBase, String tQueso) {
		//super();
		CArina = cArina;
		CsalsaT = csalsaT;
		TBase = tBase;
		TQueso = tQueso;
	}

	public int getCArina() {
		return CArina;
	}

	public void setCArina(int cArina) {
		CArina = cArina;
	}

	public int getCsalsaT() {
		return CsalsaT;
	}

	public void setCsalsaT(int csalsaT) {
		CsalsaT = csalsaT;
	}

	public String getTBase() {
		return TBase;
	}

	public void setTBase(String tBase) {
		TBase = tBase;
	}

	public String getTQueso() {
		return TQueso;
	}

	public void setTQueso(String tQueso) {
		TQueso = tQueso;
	}

	@Override
	public String toString() {
		return "Pizza [CArina=" + CArina + ", CsalsaT=" + CsalsaT + ", TBase=" + TBase + ", TQueso=" + TQueso + "]";
	}
	

}
