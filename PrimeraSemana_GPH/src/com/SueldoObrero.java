package com;
import java.util.Scanner;//importamos libreria Scaner
/**Un obrero necesita calcular su salario
semanal el cualse obtiene de la siguiente manera:
	Si trabaja 40 horaso menos se le pagara a $16 por hora, si trabaja más de40 
	horas se le pagara $16 por cada una de las primeras40 horas y 20 por cada hora
	extra
	*/
	
public class SueldoObrero {    
	public static void main(String[] args) { 
		//creamos las variables
		int hora,sueldo,he,se;       
		Scanner Sueldo = new Scanner (System.in);//nombramos a la variable scanner como "sueldo" para pedir datos por consola       
		System.out.println("Ingresa las horas que trabajaste:");      
		hora = Sueldo.nextInt();//llamamos a la variable scanner para pedir datos por consola      
		if (hora<=40)        {         //si la hora es menor a 40  
		sueldo = hora*16;           //sueldo es igual a hora por 16
		System.out.println("Su sueldo es:" + sueldo);        }      
		else         {       //si no     
		he = hora - 40;       //he es igual a hora menos 40     
		se = he*20;            //se es igual a he por 20
		sueldo = se + (40*16);    //sueldo es igual a 40 por 16      
		System.out.println("Su sueldo es:" + sueldo);       
		} 
		}
	}