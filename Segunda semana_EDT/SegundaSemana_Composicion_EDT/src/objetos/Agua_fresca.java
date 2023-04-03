package objetos;

public class Agua_fresca {

	private String tamaño;
	private Fruta fruta;
	private Azucar azucar;
	private Tipo_agua agua;
	
	public Agua_fresca(String string, Fruta fruta, Azucar azucar, Tipo_agua agua) {
		super();
		this.fruta = fruta;
		this.azucar = azucar;
		this.agua = agua;
	}

	public Fruta getFruta() {
		return fruta;
	}

	public void setFruta(Fruta fruta) {
		this.fruta = fruta;
	}

	public Azucar getAzucar() {
		return azucar;
	}

	public void setAzucar(Azucar azucar) {
		this.azucar = azucar;
	}

	public Tipo_agua getAgua() {
		return agua;
	}

	public void setAgua(Tipo_agua agua) {
		this.agua = agua;
	}

	@Override
	public String toString() {
		return "Agua_fresca [fruta=" + fruta + ", azucar=" + azucar + ", agua=" + agua + "]";
	}

	
	
}
