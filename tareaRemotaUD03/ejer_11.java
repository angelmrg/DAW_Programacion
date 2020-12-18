package tareaRemotaUD03;

/*Algoritmo que pida caracteres e imprima 'VOCAL' si son vocales y 'CONSONANTE' si no.*/

import java.util.Scanner;

public class ejer_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una letra: ");												//pedimos los datos por teclado 
		char letra = sc.next().charAt(0);														//leemos el datos introducio del tipo char
		System.out.println("Has escrito la letra " + letra);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {		//di es uno de las opciones es una vocal
			System.out.println("Es una vocal");													//imprimimos el resultado		
		} else {
			System.out.println("Es una consonante");											//de lo contrario imprime otracosa
		}

		sc.close();
	}
}
