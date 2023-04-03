package com;

public class uso_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortuga my_tortuga = new Tortuga("Reptil", "Omn�voro", true, "verde", 70, "Oceano", true);
		System.out.println(my_tortuga.toString());		
		
	}

}

		class Animal{
			
			
			private String tipo;
			private String procedencia;
			private boolean carnivoro;
			private String color;
			private int tama�oCM;
			
			public Animal(String tipo, String procedencia, boolean carnivoro, String color, int tama�oCM) {
				super();
				this.tipo = tipo;
				this.procedencia = procedencia;
				this.carnivoro = carnivoro;
				this.color = color;
				this.tama�oCM = tama�oCM;
			}
			public String getTipo() {
				return tipo;
			}
			public void setTipo(String tipo) {
				this.tipo = tipo;
			}
			public String getProcedencia() {
				return procedencia;
			}
			public void setProcedencia(String procedencia) {
				this.procedencia = procedencia;
			}
			public boolean isCarnivoro() {
				return carnivoro;
			}
			public void setCarnivoro(boolean carnivoro) {
				this.carnivoro = carnivoro;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public int getTama�oCM() {
				return tama�oCM;
			}
			public void setTama�oCM(int tama�oCM) {
				this.tama�oCM = tama�oCM;
			}
			@Override
			public String toString() {
				return "Animal [tipo=" + tipo + ", procedencia=" + procedencia + ", carnivoro=" + carnivoro + ", color="
						+ color + ", tama�oCM=" + tama�oCM + "]";
			}
			
		}
		
		
		class Tortuga extends Animal{

			private String habitat;
			private boolean aletas;
			
			
			public Tortuga(String tipo, String procedencia, boolean carnivoro, String color, int tama�oCM, String habitat, boolean aletas) {
				super(tipo, procedencia, carnivoro, color, tama�oCM);
				
				this.habitat = habitat;
				this.aletas = aletas;
			}
			

			public String getHabitat() {
				return habitat;
			}

			public void setHabitat(String habitat) {
				this.habitat = habitat;
			}

			public boolean isAletas() {
				return aletas;
			}

			public void setAletas(boolean aletas) {
				this.aletas = aletas;
			}

			@Override
			public String toString() {
				return "Animal [tipo=" + super.getTipo() + ", procedencia=" + super.getProcedencia() + ", carnivoro=" + 
						super.isCarnivoro() + ", color=" + super.getColor() + ", tama�oCM=" + super.getTama�oCM() + "]" +
						" Tortuga [habitat=" + habitat + ", aletas=" + aletas + "]";
			}
			
			
			
		}
