package calculadora;

public abstract class Calculadora {
	private String color;
	private int price;
	private String marca;
	
	
	public Calculadora(String color, int price, String marca) {

		this.color = color;
		this.price = price;
		this.marca = marca;
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


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public abstract void sumar (int num1, int num2);
	public abstract void restar(int num1, int num2);
	public abstract void multiplicar(int num1, int num2);
	public abstract void dividir(int num1, int num2);
}
