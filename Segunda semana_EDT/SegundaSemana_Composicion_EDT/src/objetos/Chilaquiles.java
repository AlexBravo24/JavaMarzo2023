package objetos;

public class Chilaquiles {

	private String tamaño;
	private Tortilla tortilla;
	private Salsa salsa;
	private Huevo huevo;
	public Chilaquiles(String tamaño, Tortilla tortilla, Salsa salsa, Huevo huevo) {
		super();
		this.tamaño = tamaño;
		this.tortilla = tortilla;
		this.salsa = salsa;
		this.huevo = huevo;
	}

	public Tortilla getTortilla() {
		return tortilla;
	}
	public void setTortilla(Tortilla tortilla) {
		this.tortilla = tortilla;
	}
	public Salsa getSalsa() {
		return salsa;
	}
	public void setSalsa(Salsa salsa) {
		this.salsa = salsa;
	}
	public Huevo getHuevo() {
		return huevo;
	}
	public void setHuevo(Huevo huevo) {
		this.huevo = huevo;
	}
	@Override
	public String toString() {
		return "Chilaquiles [tortilla=" + tortilla + ", salsa=" + salsa + ", huevo=" + huevo + "]";
	}
	
	
}
