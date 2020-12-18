package R1;

/*Programa que reciba dos números 'a' y 'b' e imprima 'OK'
 *  si ambos son positivos o 'a' es positivo. Debe imprimir 'NO' 
 *  en otro caso.*/

import java.util.Scanner;

public class ejer_17 {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe dos números");
		System.out.println("*******************");
		System.out.println("Escribe el primer número");
		double A = sc.nextDouble();
		System.out.println("Escribe el segundo número");
		double B = sc.nextDouble();
		System.out.println("positivos + y negativos -");
		
		
		if((A>0) && (B>0)) {
			System.out.println("OK");
		}
		if((A>0) && (B<0)){
			System.out.println("OK");	
		}
		if(A<0) {
			System.out.println("NO");
		}
		sc.close();
	}
}
