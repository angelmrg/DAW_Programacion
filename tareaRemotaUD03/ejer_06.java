package tareaRemotaUD03;

/*6.	Dise�ar una funci�n que calcule la potencia en�sima de un n�mero, es decir que calcule Xn para X, real y n entero*/

import java.util.Scanner;

public class ejer_06 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pot;																		//definimos las diferentes variable 
		int num1;
		
		System.out.println("Escribe un n�mero para el ejercicio: ");					//le pedimos los datos por teclado
		num1 = sc.nextInt();															//le asignamos a las variables el valor introducido
		System.out.println("Escribe a que potencia elevar el primer n�mero: ");
		pot = sc.nextInt();

		System.out.println("Quieres elevar " + num1 + " a la potencia " + pot);			//imprimimos los datos que se han introducido

		System.out.println(num1 + " elevado a " + pot + " es " + Math.pow(num1, pot));	//Utilizamos el metodo pow de la clase Math para hacer la operacion

		sc.close();
	}

}