package R1;
/*Algoritmo que pida una letra e imprima si es vocal o consonante. */

import java.util.Scanner;

public class ejer_06 {
	public static void main(String[] args) {
		
		System.out.println("Escribe una letra: ");
		Scanner sc = new Scanner(System.in);
		
		char letra = sc.next().charAt(0); 		
		 
		 System.out.println("Has escrito la letra: " + letra);
		 
		 if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			 System.out.println("Es una vocal");
		 }else {
			 System.out.println("Es una consonante");
		 }
		sc.close();
	}
}
