package PF06_Recursividad;

import java.util.Scanner;

/*
 * @author Angel Ramos Gonzalez
 * @version 
 * Realizar un programa que implemente el algoritmo de Euclides para calcular el MCD
 * - De forma directa
 * - Ilustrando el calculo con Arrays.
 */

public class PF06_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer numero: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int num2 = sc.nextInt();		
		
		int mcdRecursivo = maximoCDRecur(num1, num2);
		System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcdRecursivo);
		
		sc.close();
	}
	

	//metodos
	
	public static int maximoCDRecur(int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return maximoCDRecur(num2, num1 % num2);
	}
	
	
}
