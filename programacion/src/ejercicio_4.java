import java.util.*;

public class ejercicio_4 {
	public static void main(String[] arg) {
		/*
		 * preparamos la presentaci�n del programa en forma de un menu para poder elegir
		 * la opci�n deseada
		 */
		System.out.println("Bien venido a la calculadira de Java");
		System.out.println("1.- Hacer una suma");
		System.out.println("2.- Hacer una resta");
		System.out.println("3.- salir");

		Scanner sr = new Scanner(System.in);
		int num = sr.nextInt();

		// aqui entra en accion la condici�n del bucle
		// mientras no se pulse el 3 el bucle seguira funcionando
		while (num != 3) {

			// aqui nos pide los numero que vamos a utilizar para la operacion
			System.out.println("Dime el primer n�mero para la operaci�n");
			int num1 = sr.nextInt();
			System.out.println("Dime el segundo n�mero para la operaci�n");
			int num2 = sr.nextInt();

			// en este paso seg�n lo que hallamos elegido tomar� un paso u otro
			// y despues de eso nos lo muestra en la pantalla
			if (num == 1) { // 1 para sumar
				System.out.println("El resultado es: ");
				System.out.println(num1 + num2);
			}
			if (num == 2) { // 2 para restar
				System.out.println("El resultado es: ");
				System.out.println(num1 - num2);
			}

			System.out.println("--------------------------------");

			// cuando termina la operaci�n nos muestra de nuevo el men�
			// y seg�n lo que pongamos empieza de nuevo el bucle o salimos.
			System.out.println("�Quieres seguir con las operaciones?");
			System.out.println("1.- Hacer una suma");
			System.out.println("2.- Hacer una resta");
			System.out.println("3.- salir");
			num = sr.nextInt();
		}
		sr.close();
		// si hemos elegido el n�mero 3 el programa salta hasta aqu� y nos muestra
		// algo por la ventana se termina el programa.
		System.out.println("Gracias por utilizar nuestros servicios.");
		return;
	
	}
}
