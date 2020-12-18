package R1;
/*Escribir un programa que reciba tres valores enteros y muestre por pantalla el máximo y el mínimo de ellos.*/

import java.util.Scanner;
public class ejer_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int maxtotal = 0;
		int min = 0;
		int mintotal = 0;
		
		
		System.out.println("Escribe tres valores enteros:");
		System.out.println("Escribe el primer valor: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo valor: ");
		int num2 = sc.nextInt();
		System.out.println("Escribe el tercer valor: ");
		int num3 = sc.nextInt();
		
		max = Math.max(num1, num2);
		maxtotal = Math.max(max, num3);
		System.out.println("El mayor es el " + maxtotal);
		
		min = Math.min(num1, num2);
		mintotal = Math.min(min, num3);
		System.out.println("El menor es el " + mintotal);
		
		sc.close();
	}
}
