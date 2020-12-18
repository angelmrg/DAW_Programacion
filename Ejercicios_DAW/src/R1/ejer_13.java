package R1;

/*Realizar un programa que reciba un valor real y devuelva su raíz cuadrada. 
El programa debe controlar que el valor leído no sea negativo.*/

import java.util.Scanner;

public class ejer_13 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un valor real: ");
		System.out.println("***********************");
		double num = sc.nextDouble();
		System.out.println("La raiz de " + num + " es " + (Math.sqrt(num)));
		sc.close();
	}
}
