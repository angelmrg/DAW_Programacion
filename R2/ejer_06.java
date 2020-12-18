package R2;

/*Programa que reciba dos números, a y b, y muestre los 
 * números que hay entre a y b, ambos incluidos. Si a es 
 * mayor que b, debe mostrar un mensaje de error. 
 */

import java.util.Scanner;

public class ejer_06 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe dos números");
		System.out.println("Escribe el primer número a: ");
		int num1 = sc.nextInt(); 
		System.out.println("Escribe el segundo número b: ");
		int num2 = sc.nextInt();
		
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=num2);
		sc.close();
	}
}
