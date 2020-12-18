/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * @author angel
 *
 */
public class CrearArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = new int[0];
		int veces = 0;

		crearArray();
		poblarArray(arr, veces);
		ordenarArray(arr, veces);
		imprimirArray(arr, veces);

	}

	// Metodos

	public static int crearArray() {
		System.out.println("De cuando quieres que sea el array");
		//int veces = sc.nextInt();
		//int arr[] = new int[veces];
		int arr[]=new int [sc.nextInt()];
		//System.out.println("Has elegido un array de " + veces);
		return arr[sc.nextInt()];
	}

	public static int poblarArray(int arr[], int veces) {

		System.out.println("Escribe los numeros que desees");
		System.out.println("******************************");

		for (int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			System.out.println("arr[" + i + "] = ");
			System.out.println(arr[i]);
			
			System.out.println("Has escrito los siguientes numeros:");
			System.out.print("arr[");
			for ( i = 0; i < arr.length; i++) {

				System.out.print(arr[i]);
				if (i < arr.length - 1) {
					System.out.print(", ");
				}
			}
		}
		return arr[arr.length];
	}

	public static void ordenarArray(int arr[], int veces) {
		System.out.println("vamos a ordenar los numeros introducidos");
		System.out.println("****************************************");

		for (int i = 0; i < veces; i++) {
			for (int e = i + 1; e < veces; e++) {

				if (arr[i] > arr[e]) {
					int extra = arr[i];
					arr[i] = arr[e];
					arr[e] = extra;
				}
			}
		}
	}

	public static void imprimirArray(int arr[], int veces) {
		System.out.println("Ahora te mostraremos los numero ordenados de menor a mayor");
		System.out.println("**********************************************************");
		System.out.print("arr =[");
		for (int i = 0; i < veces; i++) {
			System.out.print(arr[i]);
			if (i < veces - 1) {
				System.out.println(", ");
			}
		}
		System.out.print("]");

	}

}