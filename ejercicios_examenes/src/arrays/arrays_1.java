package arrays;

import java.util.Scanner;

/*
 * Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. Muestra por consola 
 * el indice y el valor al que corresponde. Haz dos m�todos, uno para rellenar valores y otro para mostrar.
 * 
 */

public class arrays_1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("�De cuanto quieres que sea el array?");
		int res = sc.nextInt();
		int array[] = new int[10];
		
		rellenarArray(res, array);
		mostrarArray(array, res);
		
		
	
	}
	//metodos
	
	//con este metodo pedimos los numeros
	public static void rellenarArray(int res, int array[]) {
		for(int i=0;i<res;i++) {
			System.out.println("Escribe el numero del array en el puesto " + i);
			int num= sc.nextInt();
			array[i]= num;
			
		}
	}

	//con este metodo mostramos los numeros introducidos
	public static void mostrarArray(int array[], int res) {
		for(int i=0;i<res;i++) {
			System.out.println("El indice " + i + " tiene el valor de " + array[i]);
		}
	}

}
