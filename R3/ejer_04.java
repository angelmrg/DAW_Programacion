package R3;

/*Dise�ar una funci�n "aMayusculas()" que convierta una cadena de texto en may�sculas 
 * 
 */

import java.util.Scanner;

public class ejer_04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cadena = "buenos dias nos de dios";

		System.out.println("La siguiente cadena de texto se convertir� a mayusculas");
		System.out.println("*******************************************************");

		System.out.println(cadena);

		System.out.println(aMayusculas(cadena));

		sc.close();
	}

	public static String aMayusculas(String cadena) {
		String cadena2 = cadena.toUpperCase();
		return cadena2;
	}
}
