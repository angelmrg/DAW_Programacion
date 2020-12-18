package R1;

/* Algoritmo que pida un número entero entre uno y doce e imprima el número de días que tiene el 
 * el mes correspondiente.*/

import java.util.Scanner;
public class ejer_05 {
	public static void main(String[] arg) {
		
		System.out.println("Escribe un número entre 1 y 12");
		Scanner sr = new Scanner(System.in);
		int mes = sr.nextInt();
		
		System.out.println("Has elegido el mes numero " + mes );
		
		if(mes==1) {
			System.out.println("El mes es Enero y tiene 31 dias");
		}
		if(mes==2) {
			System.out.println("El mes es Febrero y tiene 29 dias según el año");
		}
		if(mes==3) {
			System.out.println("El mes es Marzo y tiene 31 dias");
		}	
		if(mes==4) {
			System.out.println("El mes es Abril y tiene 30 dias");
		}
		if(mes==5) {
			System.out.println("El mes es Mayo y tiene 31 dias");	
		}
		if(mes==6) {
			System.out.println("El mes es Junio y tiene 30 dias");
		}
		if(mes==7) {
			System.out.println("El mes es Julio y tiene 31 dias");
		}
		if(mes==8) {
			System.out.println("El mes es Agosto y tiene 31 dias");	
		}
		if(mes==9) {
			System.out.println("El mes es Septiembre y tiene 30 dias");	
		}
		if(mes==10) {
			System.out.println("El mes es Octubre y tiene 31 dias");	
		}
		if(mes==11) {
			System.out.println("El mes es Noviembre y tiene 30 dias");	
		}
		if(mes==12) {
			System.out.println("El mes es Diciembre y tiene 31 dias");	
		}else {
			System.out.println("Ese número no corresponde a ningún mes de nuestro calendario");
		}
	
		sr.close();
	}
}
