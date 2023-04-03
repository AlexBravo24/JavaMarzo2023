package objetos;

public class Azucar {

	private String tipo;
	private String color;
	
	public Azucar() {
		
	}
	
	public Azucar(String tipo, String color) {
		super();
		this.tipo = tipo;
		this.color = color;
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

	@Override
	public String toString() {
		return "Azucar [tipo=" + tipo + ", color=" + color + "]";
	}
	
	
	
	
}
