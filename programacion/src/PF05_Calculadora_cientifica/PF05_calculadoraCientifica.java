package PF05_Calculadora_cientifica;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1. Implementar en equipo una calculadora cient�fica:
 *		- Operaciones aritm�ticas b�sicas
 *		- Potencias
 *		- C�lculo del resto
 *	 	- seno, coseno y tangente
 *		- logaritmos.
 *
 *	2. Controlar los posibles errores
 *	3. Documentar con JavaDoc
 *
 *@author angel
 *@version 
 *@param se introducimos que operacion queremos realizar y seguimos los pasos
 *
 */

public class PF05_calculadoraCientifica {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String res = " ";
		System.out.println("<<<Bien venido al programa>>>");
		System.out.println("*****************************");

		System.out.println("¿Quieres hacer una operacion?");
		res = sc.next();
		System.out.println("*****************************");

		while (res.equals("si")) {
			System.out.println("Elige la operacion que quieres hacer: " 
					+ "\n1: Sumar " 
					+ "\n2: Restar "
					+ "\n3: Multiplicar " 
					+ "\n4: Dividir " 
					+ "\n5: Potencia " 
					+ "\n6: Resto de un numero "
					+ "\n7: Seno " 
					+ "\n8: Coseno " 
					+ "\n9: Tangente " 
					+ "\n10: Logaritmo" 
					+ "\n11: Fuera");

			System.out.println("***********************");

			int operacion = sc.nextInt();

			switch (operacion) {
			case 1:// suma
				operacionSuma();
				break;
			case 2:// resta
				operacionResta();
				break;
			case 3:// multilicacion
				operacionMultiplicar();
				break;
			case 4:// division
				operacionDivision();
				break;
			case 5:// potencia de un numero
				operacionPotencia();
				break;
			case 6:// resto de una division
				operacionResto();
				break;
			case 7:// seno de un angulo
				operacionSeno();
				break;
			case 8:// coseno de un angulo
				operacionCoseno();
				break;
			case 9:// tangente de un angulo
				operacionTangente();
				break;
			case 10:// logaritmo de un numero
				operacionLogaritmo();
				break;
			default:// si no escribes alguna de las opciones te muestra el fallo
				System.out.println("*************************");
				System.out.println("Opcion inorrecta");
				System.out.println("*************************");
			}
			System.out.println("Quieres hacer otra operacion");
			res = sc.next();
		}
		if(res.equals("no")) {
		System.out.println("Hasta la otra");
		}
	}

	// METODOS EXTERNO

	/*
	 * este metodo te pide los sumando y regresa el resultado de la suma, 
	 * si pongo una letra me avisa pero no me deja escribir, en este y en los demás
	 */
	public static void operacionSuma() {
		try {
			System.out.println("Escribe el primer numero para la suma: ");
			int num1 = sc.nextInt();
			System.out.println("Escribe el segundo numero para la suma: ");
			int num2 = sc.nextInt();
			int sumar = Math.addExact(num1, num2);
			System.out.println("La suma es: " + sumar);

		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");
			System.out.println("****************************");
		}
	}

	/*
	 * este metodo te pide el minuendo y el sustraendo y regresa el resultado de la resta
	 */
	public static void operacionResta() {
		try {
			System.out.println("Escribe el primer numero para la resta: ");
			int num1 = sc.nextInt();
			System.out.println("Escribe el segundo numero para la resta: ");
			int num2 = sc.nextInt();
			int restar = Math.subtractExact(num1, num2);
			System.out.println("La resta es: " + restar);

		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");

		}
	}

	/*
	 * este metodo te pide los datos para regresar el resultado de una multiplicacion
	 */
	public static void operacionMultiplicar() {
		try {
			System.out.println("Escribe el multiplicando de la operacion: ");
			int num1 = sc.nextInt();
			System.out.println("Escribe el multilicador de la operacion: ");
			int num2 = sc.nextInt();
			int multi = Math.multiplyExact(num1, num2);
			System.out.println("La multiplicacion es: " + multi);

		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");
		}
	}

	/*
	 * este metodo te pide el dividendo y el divisor para regresar el resultado de la division
	 */
	public static void operacionDivision() {
		try {
			System.out.println("Escribe el dividendo para la division : ");
			int num1 = sc.nextInt();
			System.out.println("Escribe el divisor para la division : ");
			int num2 = sc.nextInt();
			int div = Math.floorDiv(num1, num2);
			System.out.println("La division es: " + div);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir un numero entre 0");
		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");
		}

	}

	/*
	 * este metodo te pide la base y el exponente y te regresa el resultado de la potencia
	 */
	public static void operacionPotencia() {
		try {
			System.out.println("Escribe la base de la potencia : ");
			int num1 = sc.nextInt();
			System.out.println("Escribe el exponente de la potencia : ");
			int num2 = sc.nextInt();
			double pot = (double) Math.pow(num1, num2);
			System.out.println("El resultado de la operacion es: " + pot);
		} catch (ArithmeticException e) {

		}
	}

	/*
	 *  este metodo te pide los datos para dividir dos numeros y te devuelve el resto resto
	 */
	public static void operacionResto() {
		try {
			System.out.println("Escribe el dividendo para la division : ");
			int num1 = sc.nextInt();
			System.out.println("Escribe el divisor para la division : ");
			int num2 = sc.nextInt();

			int resto = num1 % num2;
			System.out.println("El resto de la division es: " + resto);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir un numero entre cero");
		}
	}

	/*
	 *  este metodo nos pide un angulo y nos da el seno de ese angulo seno de un numero
	 */
	public static void operacionSeno() {

		System.out.println("Escribe el angulo para encontrar el Seno: ");
		int num1 = sc.nextInt();
		double seno = Math.sinh(num1);
		System.out.println("El seno del angulo " + num1 + "º" + " es: " + seno);

	}

	/*
	 *  este metodo nos pide un angulo y nos da el coseno de ese angulo coseno de un angulo
	 */
	public static void operacionCoseno() {
		try {
			System.out.println("Escribe el angulo para encontrar su Coseno: ");
			int num1 = sc.nextInt();
			double coseno = Math.cos(num1);
			System.out.println("El seno de ese angulo " + num1 + "º" + " es: " + coseno);
		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");
		}
	}

	/*
	 *  este metodo nos pide un angulo y nos da la tangente de ese angulo tangente de un angulo
	 */
	public static void operacionTangente() {
		try {
			System.out.println("Escribe el angulo para encontrar su Tangente: ");
			int num1 = sc.nextInt();
			double tangente = Math.tan(num1);
			System.out.println("La tangente del angulo " + num1 + "º" + " es " + tangente);
		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");
		}
	}

	/*
	 *  este metodo nos pide un numero y nos da el logaritmo de ese numero Loraritmo de un numero
	 */
	public static void operacionLogaritmo() {
		try {
			System.out.println("Escribe un numero para encontrar su logaritmo natural: ");
			int num1 = sc.nextInt();
			double logaritmo = Math.log(num1);
			System.out.println("El logaritmo natural de " + num1 + " es " + logaritmo);
		} catch (InputMismatchException e) {
			System.out.println("No has escrito ningun numero");
		}catch (ArithmeticException e) {
			System.out.println("El numero debe de ser positivo");
		}
	}

}
