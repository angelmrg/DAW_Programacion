/**
 * 
 */
package UD03_arrays;

import java.util.Scanner;

/**
 * @author angel
 *
 */
public class Arreglos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[];
		int b[];
		int c[];

		a = new int[10];// array con 10 elementos
		b = new int[10];// array con 10 elementos
		c = new int[20];// array con 20 elementos

		// pedimos el array a
		System.out.println("Escribe el primer array");
		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe el indice " + i);
			a[i] = sc.nextInt();
		}

		// pedimos el array b
		System.out.println("Escribe el segundo array");
		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe el indice " + i);
			b[i] = sc.nextInt();
		}

		
		//Ahora vamos a mezclar los dos arrays en un tercer array
		//utilizaremos i para a y b
		// y utilizaremos j para c
		
		int j=0;
		for(int i=0; i<10; i++) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		
		System.out.println("El tercer array es el siguiente: ");
		for(int i=0; i<20; i++) {
			System.out.print("c[" +i+ "]=");
			System.out.println(c[i]);
			
		}
		
	}
}
