package R1;

/*Escribe un programa que pida dos números 'nota' y 'edad' y un carácter 'sexo' y muestre 
 * el mensaje 'ACEPTADA' si la nota es mayor o igual a cinco, la edad es mayor o igual a 
 * dieciocho y el sexo es 'M'. En caso de que se cumpla lo mismo, pero el sexo sea 'V', 
 * debe imprimir 'POSIBLE'. */

import java.util.Scanner;

public class ejer_02 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Respondeme a algunas preguntas");
		System.out.println("******************************");

		System.out.println("Dame una nota:");
		int nota = sc.nextInt();
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		System.out.println("Dime si eres hombre o mujer: V/M ");
		char sexo = sc.next().charAt(0);

		if (nota >= 5 && edad >= 18 && sexo == 'M') {
			System.out.println("ACEPTADA");
		}
		if (nota >= 5 && edad >= 18 && sexo == 'V') {
			System.out.println("POSIBLE");
		} else {
			System.out.println("LOS DATOS NO SON CORRECTOS");
		}
		sc.close();
	}

}
