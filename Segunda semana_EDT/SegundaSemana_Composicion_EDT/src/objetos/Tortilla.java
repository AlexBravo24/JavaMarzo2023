package objetos;

public class Tortilla {

	
	
	private String tipo;
	private String color;
	private int price;
	
	public Tortilla(String tipo, String color, int price) {
		super();
		this.tipo = tipo;
		this.color = color;
		this.price = price;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Tortilla [tipo=" + tipo + ", color=" + color + ", price=" + price + "]";
	}
	
}
