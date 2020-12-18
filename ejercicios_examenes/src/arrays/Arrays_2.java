/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * @author angel
 *
 */
public class Arrays_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("¿De cuanto quieres que sea el array?");
		int res = sc.nextInt();
		String array[] = new String[10];
		
		rellenarArray(res, array);
		mostrarArray(res, array);
	}

	//metodos
	
	public static void rellenarArray(int res, String array[]) {
		for(int i=0; i<res;i++) {
			System.out.println("Escribe letra en el indice " + i);
			String letra = sc.next();
			array[i] = letra;			
		}
	}
	
	public static void mostrarArray(int res, String array[]) {
		System.out.println("Has escrito las siguientes letras;");
		for(int i=0; i<res; i++) {
			System.out.println("En el indice " + i + " has escrito la letra " + array[i]);
		}
	}
	
	
	
}
