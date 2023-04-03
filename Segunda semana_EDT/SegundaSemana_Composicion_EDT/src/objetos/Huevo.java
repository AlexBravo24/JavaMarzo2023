package objetos;

public class Huevo {

		
	private String preparacion;
	private int price;
	public Huevo(String preparacion, int price) {
		super();
		this.preparacion = preparacion;
		this.price = price;
	}
	public String getPreparacion() {
		return preparacion;
	}
	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Huevo [preparacion=" + preparacion + ", price=" + price + "]";
	}
	
	
	
}
