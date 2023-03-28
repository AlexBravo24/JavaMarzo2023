package Arrays;
import javax.swing.JOptionPane;//libreria para ventana de texto

//Crea un array de 10 posiciones de números con valores pedidos por teclado.
//Muestra por consola el índice y el valor al que corresponde.
public class Array10Positions {

	public static void main(String[] args) {
		
		final int tam=10;
		int num[]=new int[tam];
        rellenarArray(num);
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce 10 Números");//ventana de texto
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }

	}

}
