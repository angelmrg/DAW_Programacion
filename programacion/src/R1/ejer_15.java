package R1;

/*Escribir un programa que reciba un número entero y diga 
 * si es positivo, cero o negativo. */

import java.util.Scanner;

public class ejer_15 {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		int num = sc.nextInt();
		System.out.println("Ahora te diré si es +, - o cero");
		
		if(num==0) {
			System.out.println("Este número es el cero (0)");
		}
		if(num<0) {
			System.out.println("Este número es negativo (-)");
		}
		if(num>0) {
			System.out.println("Este número es positivo (+)");
		}
		sc.close();
	}
} 
