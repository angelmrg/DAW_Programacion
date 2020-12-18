package R1;

/*Realizar un programa que reciba tres valores reales y escriba las frases
 * "SON IGUALES" si los tres números son iguales y "SON DISTINTOS" en caso 
 * contrario*/

import java.util.Scanner;

public class ejer_11 {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tres numeros reales");
		System.out.println("**********************");
		System.out.println("Escribe el primer número: ");
		double num1 = sc.nextDouble();
		System.out.println("Escribe el segundo número: ");
		double num2 = sc.nextDouble();
		System.out.println("Escribe el tercer número: ");
		double num3 = sc.nextDouble();
		
		if((num1==num2)&&(num2==num3)) {
			System.out.println("SON IGUALES");
		}else {
			System.out.println("SON DISTINTOS");
		}
		sc.close();
	}

}
