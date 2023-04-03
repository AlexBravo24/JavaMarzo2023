package objetos;

public class Chilaquiles {

	private String tama�o;
	private Tortilla tortilla;
	private Salsa salsa;
	private Huevo huevo;
	public Chilaquiles(String tama�o, Tortilla tortilla, Salsa salsa, Huevo huevo) {
		super();
		this.tama�o = tama�o;
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
