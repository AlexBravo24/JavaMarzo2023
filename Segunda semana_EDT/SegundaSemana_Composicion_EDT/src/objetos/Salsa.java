package objetos;

public class Salsa {

	private String verdura;
	private String color;
	private boolean dulce;
	public Salsa(String verdura, String color, boolean dulce) {
		super();
		this.verdura = verdura;
		this.color = color;
		this.dulce = dulce;
	}
	public String getVerdura() {
		return verdura;
	}
	public void setVerdura(String verdura) {
		this.verdura = verdura;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isDulce() {
		return dulce;
	}
	public void setDulce(boolean dulce) {
		this.dulce = dulce;
	}
	
	@Override
	public String toString() {
		return "Salsa [verdura=" + verdura + ", color=" + color + ", dulce=" + dulce + "]";
	}
	
}
