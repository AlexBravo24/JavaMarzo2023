package com;

public class uso_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortuga my_tortuga = new Tortuga("Reptil", "Omnívoro", true, "verde", 70, "Oceano", true);
		System.out.println(my_tortuga.toString());		
		
	}

}

		class Animal{
			
			
			private String tipo;
			private String procedencia;
			private boolean carnivoro;
			private String color;
			private int tamañoCM;
			
			public Animal(String tipo, String procedencia, boolean carnivoro, String color, int tamañoCM) {
				super();
				this.tipo = tipo;
				this.procedencia = procedencia;
				this.carnivoro = carnivoro;
				this.color = color;
				this.tamañoCM = tamañoCM;
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
			public int getTamañoCM() {
				return tamañoCM;
			}
			public void setTamañoCM(int tamañoCM) {
				this.tamañoCM = tamañoCM;
			}
			@Override
			public String toString() {
				return "Animal [tipo=" + tipo + ", procedencia=" + procedencia + ", carnivoro=" + carnivoro + ", color="
						+ color + ", tamañoCM=" + tamañoCM + "]";
			}
			
		}
		
		
		class Tortuga extends Animal{

			private String habitat;
			private boolean aletas;
			
			
			public Tortuga(String tipo, String procedencia, boolean carnivoro, String color, int tamañoCM, String habitat, boolean aletas) {
				super(tipo, procedencia, carnivoro, color, tamañoCM);
				
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
						super.isCarnivoro() + ", color=" + super.getColor() + ", tamañoCM=" + super.getTamañoCM() + "]" +
						" Tortuga [habitat=" + habitat + ", aletas=" + aletas + "]";
			}
			
			
			
		}
