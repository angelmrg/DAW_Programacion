package tareaRemotaUD03;

/*10.	Algoritmo que pida números hasta que se introduzca un cero. 
 * Debe imprimir la suma y la media de todos los números introducidos.
 */

import java.util.Scanner;

public class ejer_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ve escribiendo todos los número que quieras: ");			//pedimos por teclado los datos
		System.out.println("Para salir escribe un cero (0)");
		float num = sc.nextFloat();														//leemos los datos que se han introducido 
		float suma = 0;																	//variables definidas y con su valor
		int i = 0;

		while (num != 0) {																//mientras el dato introducido sea diferente a cero
			suma = suma + num;															//se iran sumando los diferentes datos que se introduzcan
			i++;
			num = sc.nextFloat();
		}

		System.out.println(i);
		System.out.println("la suma de todos los números introducidos es " + suma + " y su media es " + (suma / i));
		sc.close();

	}
}
