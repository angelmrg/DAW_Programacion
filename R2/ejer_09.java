package R2;

/*Programa que multiplique dos números introducidos 
 * por el usuario usando sumas sucesivas.
 */

import java.util.Scanner;

public class ejer_09 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe dos números");
		System.out.println("Escribe el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		
		int resul = 0;
		int i =1;
		
		do {
			resul = num1+num1;			
			i++;
			System.out.println(resul);
		}while(i==num2);
		
	sc.close();
	}
}
