package R1;

/*Escribe un algoritmo que pida cinco números y muestre los que sean mayores que la media */

import java.util.Scanner;

public class ejer_04 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe cinco numeros");
		System.out.println("Escribe el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("Escribe el tercer número: ");
		int num3 = sc.nextInt();
		System.out.println("Escribe el cuarto número: ");
		int num4 = sc.nextInt();
		System.out.println("Escribe el quinto número: ");
		int num5 = sc.nextInt();
		System.out.println("Has escrito los siguientes números: " + num1 + " , " + num2 + " , " 
		+ num3 + " , " + num4 + " y " + num5);
		int media = (num1+num2+num3+num4+num5)/5;
		System.out.println("Y su media es: " + media);
		
		if(num1>media) {
			System.out.println(num1);
		}
		if(num2>media) {
			System.out.println(num2);
		}
		if(num3>media) {
			System.out.println(num3);
		}
		if(num4>media) {
			System.out.println(num4);
		}
		if(num5>media) {
			System.out.println(num5);
		}
		sc.close();
	}
}
