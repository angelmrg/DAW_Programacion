package R2;

/*Realizar una aplicaci�n Factorial que calcule el factorial de un n�mero introducido por teclado. 
 * 
 */
import java.util.Scanner;

public class ejer_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un n�mero para saber su vectorial");
		System.out.println("*****************************************");
		int num = sc.nextInt();
		int resul = 1;
		int con = 2;

		while (con <= num) {
			resul = resul * con;
			con++;
		}

		System.out.println("El vectorial de " + num + " es " + resul);

		sc.close();
	}
}
