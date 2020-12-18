package R1;

/*Escribir un programa que reciba un número entero y determine si es múltiplo de 2 y de 5 */

import java.util.Scanner;

public class ejer_09 {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero y te diré si es múltiplo de 2 y de 5");
		int num = sc.nextInt();
		
		if(num%2==0 && num%5==0) {
			System.out.println("Este número es múltiplo de 2 y 5");
		}else {
			System.out.println("Este número no es múltiplo de 2 y 5");
		}
		sc.close();
	}
}
