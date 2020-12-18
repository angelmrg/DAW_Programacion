package R1;


/*Escribir un programa que reciba una nota e imprima por pantallala calificación
 *en formato "Apto" o "No Apto" según si la nota es mayor o menor que 5 */

import java.util.Scanner;

public class ejer_07 {
	public static void main(String[] arg) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("¿Que nota has sacado en el examen?");
		int nota = sr.nextInt();
		if(nota==0 || nota==1 || nota==2 || nota==3 || nota==4) {
			System.out.println("No Apto");
		}
		if(nota==5 || nota==6 || nota==7 || nota==8 || nota==9 || nota==10) {
			System.out.println("Apto");
		}else {
			System.out.println("Esa nota no se puede procesar");
		}
		sr.close();
	}
}
