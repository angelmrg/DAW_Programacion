package tareaRemotaUD03;

/*Escribir un programa en Java que lea un n�mero entero por el teclado e imprima todos
 *  los n�mero impares menores que �l.
 */
import java.util.Scanner;

public class ejer_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un n�mero entero: ");			//solicitamos entrada por consola
		int num = sc.nextInt();										//se lee el dato que se introduce

		while (num != 0) {											//creamos el bucle con la condicion 
			if (num % 2 == 0) {										//aqui especificamos que mientras sea un 
				num--;												//n�mero par siga adelante, y si es impar
			} else {												//lo imprima y que continue hasta que se 
				System.out.println(num);							//cumpla la condicion
				num--;
			}
		}

		sc.close();													//cerramos Scanner
	}
}
