package tareaRemotaUD03;

/*5.	Realiza un programa que lea una cadena de caracteres y la escriba al revés.*/
import java.util.Scanner;

public class ejer_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);					
		String caracter = "";													//variable vacia
		System.out.println("Escribe una palabra: ");							//pedimos por teclado los datos
		String cadena = sc.next();												//leemos la cadena escrita
		System.out.println("la cadena que has escrito es: " + cadena);			//aqui nos imprime la cadena que hemos escrito

		for (int i = cadena.length() - 1; i >= 0; i--) {						//este for recorre la cadena que hemos escrito desde el final al principio de esta
			caracter += cadena.charAt(i);										//aqui le asignamos uno de los caracteres cada vez que se produce el bucle

		}

		System.out.println(caracter);											//nos imprime el caracter

		sc.close();
	}
}
