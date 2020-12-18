/*Codifica un programa Calculadora Básica que tenga en cuenta los siguientes requisitos.
Debe ser capaz de realizar operaciones de suma, resta, multiplicación, división y potencia únicamente mediante llamadas a métodos de la clase Math.
Debe imprimir un menú de opciones interactivo para seleccionar la operación a realizar.
La operación a realizar seleccionada por el usuario debe distinguirse mediante una estructura selectiva de tipo Switch.
Todas las variables numéricas deben ser manipuladas a través de los Objetos Wrapper de tipos primitivos correspondientes.
*/

package UD02;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main(String[] arg) {//Presentación del menú
		System.out.println("Esto es una calculadora");
		System.out.println("***********************");
		System.out.println("Elige una opción: \n1: Sumar \n2: Restar \n3: Multiplicar \n4: Dividir \n5: Potencia");
		
		//aquí recibimos por teclado la eleccion del usuario
		Scanner sc = new Scanner(System.in);
		int operacion = sc.nextInt();
		//mostramos por pantalla la elección 
		System.out.println("Has elegido: " + operacion);
		//preguntamos por las dos variables para todas las operaciones
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer número: ")); 
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo número: "));
		
		switch (operacion) {
		case 1://suma			
			
			int sumar = Math.addExact(num1, num2);			
			JOptionPane.showInternalMessageDialog(null, "El resultado de sumar " + num1 + " con " + num2 + " es " + sumar);			
			break;
			
		case 2://resta 
			
			 int restar = Math.subtractExact(num1, num2);                   // .subtractExact(num1, num2);
			JOptionPane.showInternalMessageDialog(null, "El resultado de restar " + num1 + " con " + num2 + " es " + restar);
			break;
		
		case 3://multiplicación
			
			int multi = Math.multiplyExact(num1, num2);
			JOptionPane.showMessageDialog(null, "El resultado de multiplicar " + num1 + " con " + num2 + " es " + multi);
			break;
			
		case 4://divición
			
			int div = Math.floorDiv(num1,num2);
			JOptionPane.showMessageDialog(null, "El resultado de dividir " + num1 + " entre " + num2 + " es " + div);
			break;
			
		case 5://potencia
			
			double resulp = (double)Math.pow(num1, num2);
			JOptionPane.showMessageDialog(null, "El reusultado de elevar " + num1 + " a la potencia " + num2 + " es " + resulp);
			break;
			
		default:
			
			System.out.println("La opcion no es correcta");
		}
		sc.close();
	}
}
