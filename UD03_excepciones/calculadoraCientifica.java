package UD03_excepciones;

/*1. Implementar en equipo una calculadora científica:
	- Operaciones aritméticas básicas
	- Potencias
	- Cálculo del resto
	- seno, coseno y tangente
	- logaritmos.

  2. Controlar los posibles errores
  3. Documentar con JavaDoc
*/

import java.util.Scanner;
public class calculadoraCientifica {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("**Opciones de la calculadora**");
	System.out.println("\n1: Sumar: "
			+ "\n2: Restar: "
			+ "\n3: Multiplicar: "
			+ "\n4: Dividir: "
			+ "\n5: Potencia: "
			+ "\n6: Resto de un numero: "
			+ "\n7: Seno de un numero: "
			+ "\n8: Coseno de un numero: "
			+ "\n9: Tangente de un numero: "
			+ "\n10: Logaritmos: ");
	int opcion = sc.nextInt();
	System.out.println("Has elegindo el número " );
	
	
	
	
	sc.close();
}

}
