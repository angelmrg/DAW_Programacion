package CLASES;

import java.util.Scanner;

public class prueba {
	public static void main(String[] arg) {

		// Creo el menu para que me pregunte si quiero empezar el programa.
		Scanner sr = new Scanner(System.in);
		System.out.println("Bien venidos al programas de Tablas de Java");
		System.out.println("*******************************************");
		System.out.println("¿Quieres que te diga alguna tabla? si/no");

		String res = sr.next();

		int i = 0;

		// si la contestacion es 'si' ya empieza a funcionar preguntando que tabla
		// aqui comienza el bucle que solo parará cuando la respuesta se no
		while (res.equals("si")) {
			System.out.println("¿Qué tablas quieres que te muestre?");
			int x = sr.nextInt();
			while (i <= 10) {
				System.out.println(x + " x " + i + " = " + x * i);
				i++;
			}
			
			System.out.println("¿quieres ver otra tabla?");
			res = sr.next();
			
		}
		sr.close();
		System.out.println("Esto es todo amigos");

	}

}
