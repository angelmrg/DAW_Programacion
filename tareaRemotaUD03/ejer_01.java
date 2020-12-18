package tareaRemotaUD03;

/*Escribir un programa en Java que imprima por pantalla los n�meros entre dos n�meros
 *  que se pasan c�mo argumentos en la l�nea de Comandos."quiere decir que se recoge por 
 *  args.
 */

public class ejer_01 {
	public static void main(String[] args) {
		
		System.out.println("El primer argumento es: " + args[0]);
		System.out.println("El segundo argumento es: " + args[1]);
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		
		
		//int num1 = 19; 				// declaramos las variables y les damos el valor
		//int num2 = 5;

		while (num1 < num2) { 		// creamos el bucle para cuando el primer numero sea
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
		}

	}
}
