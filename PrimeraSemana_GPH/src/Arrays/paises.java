package Arrays;

import java.util.Scanner;
public class paises {

    public static void main(String args []) {
        String [][] arrMulti =new String[4][4];
        String ax="";
        Scanner ingresoTeclado = new Scanner(System.in);

        for (int i=0;i<4;i++){
            System.out.print("Introduce el nombre del pais "+(i+1)+" : ");
            arrMulti[i][0] = ingresoTeclado.nextLine()+":";         
        }
        for (int j=0;j<4;j++){
            for (int i=1;i<4;i++){
                System.out.print("Introduce el nombre de la ciudad "+(i)+" del pais "+(j+1)+" : ");
                arrMulti[j][i] = ingresoTeclado.nextLine();             
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                ax+= arrMulti[i][j]+"        ";
            }
            ax+="\n";
        }
        System.out.print(ax);

    }
}

