package UD03_arrays;
/*un programa que le pida al usuario un grupo de n�meros enteros(como m�ximo 10) y se deben
 * guardar en un array y cuando termine que los muestre por pantalla.
 */

import java.util.Scanner;

public class ejer_clase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		int e;
		int extra;
		int arr[] = new int[10]; // leemos los datos del teclado

		System.out.println("�Cuantos numeros quieres que tenga el array?");
		System.out.println("************************************************************");
		int veces = sc.nextInt();
		System.out.println("Escribe los numeros que desees, con un limite de 10 numeros:");
		System.out.println("************************************************************");
		
		for (i = 0; i <= veces - 1; i++) {
			arr[i] = sc.nextInt();
			System.out.print("arr[" + (i) + "] = ");
			System.out.println(arr[i]);
		}
		
		System.out.print("arr[");
		for (i = 0; i < veces; i++) {

			System.out.print(arr[i]);
			System.out.print(", ");
		}
		
		System.out.print("]\n");

		System.out.println("Ordenados de menor a mayor");
		System.out.println("**************************");

	

		for (i = 0; i < veces; i++) {
			for (e = i + 1; e < veces; e++) {

				if (arr[i] > arr[e]) {
					extra = arr[i];
					arr[i] = arr[e];
					arr[e] = extra;
				}

			}
		}
		System.out.print("enteros = { ");
		for (i = 0; i < veces; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(" }");
		
	}

}
