package R2;

/*Imprimir los n�meros enteros comprendidos entre dos n�meros enteros n y m 
 * que se reciben como argumentos, siendo n menor o igual que m. 
 */
import java.util.Scanner;

public class ejer_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ESCRIBE DOS N�MEROS: ");
		System.out.println("Escribe el primer n�mero: ");
		int n = sc.nextInt();
		System.out.println("Escribe el segundo n�mero: ");
		int m = sc.nextInt();

		while (n <= m) {
			System.out.println(n);
			n++;
		}

		System.out.println("El programa ha terminado");
		sc.close();
	}
}
