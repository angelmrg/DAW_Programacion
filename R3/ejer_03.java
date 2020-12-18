package R3;

/*Diseñar una función que calcule la potencia enésima de un número, es decir que calcule Xn para X, real y n entero */

import java.util.Scanner;
public class ejer_03 {
	
static int pot;	
static int num1;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Escribe el numero que quieres que se elevar: ");
	int num1 = sc.nextInt();
	System.out.println("A que pontencia lo quieres elevar: ");
	int pot = sc.nextInt();
	
	System.out.println("El resultado de elevar " + num1 + " a " + pot + " es: " + Math.pow(num1, pot) );
	
	System.out.println("El resultado de la funcion es: " + potEnesima(num1, pot));
	
	
	sc.close();	
}


public static int potEnesima(int num1, int pot) {
	int resul = (int) Math.pow(num1, pot);
	return resul;
}


}