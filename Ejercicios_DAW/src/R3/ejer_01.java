package R3;
//Crea una función en java que reciba como parámetro un número entero y devuelva el como resultado su factorial. 
import java.util.Scanner;


public class ejer_01 {
public static void main(String[] args) {
	System.out.println("Bien venido a este programa");										//presentacion del programa
	System.out.println("***************************");
	
	Scanner sc = new Scanner(System.in);													//se declara el constructor de la clase Scanner
	System.out.println("Escribe un número para que te digamos su factorial: ");	
	int num1 = sc.nextInt();																
	int i = 2;

	System.out.println("****************************************************");
	System.out.println("Has escrito el " + num1 + " para que te diga sus factorial");
	System.out.println("**********************************************************");
	
	
	int resul = 1;
	while(i <= num1) {
	resul = resul*i;
	i++;
		
	}
	System.out.println("El factorial de " + num1 + " es " + resul);	
	
	sc.close();
}
}
