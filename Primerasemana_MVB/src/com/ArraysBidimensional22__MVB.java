package com;

public class ArraysBidimensional22__MVB {

	public static void main(String[] args) {
String matrizA [] [] = new String [3][5]; 
		
		matrizA [0][0] = "5";
		matrizA [0][1] = "x"; 
		matrizA [0][2] = "9"; 
		matrizA [0][3] = "4";
		matrizA [0][4] = "t";
		
	    matrizA [1][0] = "3"; 
		matrizA [1][1] = "z"; 
		matrizA [1][2] = "P";
		matrizA [1][3] = "c";
	    matrizA [1][4] = "6";
	    
	    matrizA [2][0] = "8"; 
		matrizA [2][1] = "3"; 
		matrizA [2][2] = "f";
		matrizA [2][3] = "i";
	    matrizA [2][4] = "7";
	    
//	    int [] [] matrizA = { {"5","x","9","4","t"},
//	            {"3","z","P","c","6"},
//	            {"8","3","f","i","7"}};
for(int i =0;i<5;i++) {
for(int j=0;j<5;j++){    
	System.out.print(matrizA[i][j] + " ");
}
System.out.println();
}
	    
String matrizB [] [] = new String [3][5]; 

matrizB [0][0] = "7";
matrizB [0][1] = "P"; 
matrizB [0][2] = "4"; 
matrizB [0][3] = "g";
matrizB [0][4] = "8";

matrizB [1][0] = "5"; 
matrizB [1][1] = "w"; 
matrizB [1][2] = "Y";
matrizB [1][3] = "10";
matrizB [1][4] = "2";

matrizB [2][0] = "4"; 
matrizB [2][1] = "7"; 
matrizB [2][2] = "v";
matrizB [2][3] = "o";
matrizB [2][4] = "6";

for(int k =0;k<5;k++) {
for(int l=0;l<5;l++){    
	System.out.print(matrizB[k][l] + " ");
}
System.out.println();
}





	}//cierre main

}//cierreclase
