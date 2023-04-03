package objetos;

public class Tipo_agua {

	private String tipo;
	private int price;
	public Tipo_agua(String tipo, int price) {
		super();
		this.tipo = tipo;
		this.price = price;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tipo_agua [tipo=" + tipo + ", price=" + price + "]";
	}
	
	
	
}
