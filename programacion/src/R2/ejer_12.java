package R2;

/*Realizar una aplicación Factorial que calcule el factorial de un número introducido por teclado. 
 * 
 */
import java.util.Scanner;

public class ejer_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número para saber su vectorial");
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
