package PF06_Recursividad;

/*
 * @author Angel Ramos Gonzalez
 * @version 
 * Realiza un programa que calcule el factorial en base a dos metodos
 * 	-Iterativo
 *  -Recursivo
 */
import java.util.Scanner;

public class PF06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escribe un numero para hacer su factorial: ");
		int num = sc.nextInt();

		System.out.println("Por el metodo por repeticion es " + factorialNumero(num));
		System.out.println("Por el metodo por recursividad es " + factorialFormula(num));

		sc.close();
	}

//metodos

	public static int factorialNumero(int num) { // metodo iterativo

		int res = 1;
		for (int i = num; i > 0; i--) {
			res = res * i;
		}
		return res;
	}

	public static int factorialFormula(int num) { // metodo por recursividad
		int res = 1;
		if (num > 1) {
			res = num * factorialFormula(num - 1);
		}
		return res;
	}

}
