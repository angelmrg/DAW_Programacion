package UD03_arrays;
/*un programa que le pida al usuario un grupo de numeros enteros(como maximo 10) y se deben
 * guardar en un array y cuando termine que los muestre por pantalla.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejer_clase_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int veces;

		//int arr[] = new int[10];

			try {//este sirve para poder pedir cualquier tama�o pero depende del if 
				System.out.println("�Cuantos numeros quieres que tenga el array?");
				System.out.println("********************************************");
				veces = sc.nextInt();
				int arr[] = new int[veces] ;

				if (veces >= 0 && veces <= 10) {
					pedirMostrarDatos(arr, veces);//poblar array
					ordenarValores(arr, veces);//ordenar array
					mostrarOrdenados(arr, veces);//imprimir array
				}else {
					throw new ArrayIndexOutOfBoundsException();//creo la exception que quiero
				}

			} catch (InputMismatchException e) {
				System.out.println("Debes escribir un numero");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("No puedes crear un array de mas de 10");
			}	
	}

	// Metodos
	// Metodo para pedir los datos y mostrar los datos
	public static void pedirMostrarDatos(int arr[], int veces) { 

		try {
		System.out.println("Escribe los numeros que desees:");
		System.out.println("*******************************");

		for (int i = 0; i < veces; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			System.out.print("arr[" + i + "] = ");
			System.out.println(arr[i]);
		}
		} catch (InputMismatchException e) {
			System.out.println("Debes escribir un valor numerico");
		}
		System.out.println("******************************");
		System.out.print("\n");
		System.out.println("Has escrito los siguientes numeros:");
		System.out.print("arr[");
		for (int i = 0; i < veces; i++) {

			System.out.print(arr[i]);
			if (i < veces - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
		System.out.println("**********************************");
	}

	
	// Metodo para ordenar los valores introducidos
	public static void ordenarValores(int arr[], int veces) { 
		System.out.println("Ordenados de menor a mayor");
		System.out.println("**************************");
		System.out.println(veces);
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
	
	// Muestra los datos introducidos
	public static void mostrarOrdenados(int arr[], int veces) { 

		System.out.print("arr = [ ");
		for (int i = 0; i < veces; i++) {
			System.out.print(arr[i]);
			if (i < veces - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(" ]");
	}

}
