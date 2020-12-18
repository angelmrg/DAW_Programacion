package tareaRemotaUD03;

/*Escribir un programa en Java que sume los cuadrados de los cien primeros números 
 * naturales, mostrando el resultado en pantalla.
 */

public class ejer_03 {
	public static void main(String[] args) {

		System.out.println("hola");

		for (int i = 0; i <= 100; i++) { 		// aqui le decimos cuantas veces se repite el bucle
			int resul = i * i; 					// aqui declaramos la variable y su valor es la multiplicación del contador por
												// si mismo.

			System.out.println("El cuadrado de " + i + " es " + resul);
		}
	}
}
