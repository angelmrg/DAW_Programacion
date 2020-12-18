package R2;

/*Programa que reciba dos números, a y b, y cuente 
 * desde el menor hasta el mayor.
 */

//arreglar

import java.util.Scanner;

public class ejer_08 {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe dos números");
		System.out.println("Escribe el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		
		if(num1<num2) {
			do {
				System.out.println(num1);
				num1++;
			}while(num1<=num2);
		}else {
			do {
				System.out.println(num2);
				num2++;
			}while(num2<=num1);
		}
		sc.close();
	}
}
