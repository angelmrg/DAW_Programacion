package examenes;
/*Se pregunta al usuario que introduzca dos números con decimales. tipo float.
El programa deberá calcular cual es el mayor número entero que hay entre el mayor y 
el menor de los número introducidos por el usuario. Excluyendo los enteros correspondientes a 
los valores introducidos para los extremos.
El programa deberá mostrar un mensaje del tipo:
“El mayor número entero entre num1 y num2 es numEntero”

Se pregunta al usuario si quiere empezar de nuevo el programa.
El programa empieza de nuevo si se introduce el caracter ‘S’
El programa termina si se introduce la cadena ‘n’
El programa vuelve a preguntar al usuario la opción si no ha introducido un valor que coincida con ‘S’ o con ‘n’*/

import java.util.Scanner;

public class UD01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char res = 'n';
		System.out.println("Escribe dos número con decimales");
		System.out.println("********************************");
		do {
			
		
			System.out.println("Escribe el primer número: ");
			float num1 = sc.nextFloat();
			System.out.println("Escribe el segundo número: ");
			float num2 = sc.nextFloat();
			
			
			if(num1 > num2) {
				int numEntero = (int)num1 - 1;
				System.out.println("El mayor número entero entre " + num1 + " y " + num2 + " es el número " + numEntero);			
				System.out.println("¿Quieres empezar de nuevo?");
				if (num2 == num1) {
					continue;
				}
				res = sc.next().charAt(0);
				//if(res == 'n') {
					//System.out.println("Hasta luego");
				
			}else {
				int numEntero = (int)num2 - 1;
				System.out.println("El mayor número entero entre " + num2 + " y " + num1 + " es el número " + numEntero);			
				System.out.println("¿Quieres empezar de nuevo?");
				if (num2 == num1) {
					continue;
				}
				res = sc.next().charAt(0);
				//if(res == 'n') {
					
			}
		}while(res == 'S');		
		
		System.out.println("Hasta luego");
		
		sc.close();
	}
}


/*while (num1 < num2) { 		// creamos el bucle para cuando el primer numero sea
			num1++; 				// menor que el segundo,

			if (num1 == num2) { 	// aqui le decimos que si los dos numeros tienen el mismo valor
				continue; 			// continue con la ejecucion del programa.
			}
			System.out.println(num1);
		}
		while (num1 > num2) {
			num2++;
			if (num2 == num1) {
				continue;
			}
			System.out.println(num2);
		}*/





