package tareaRemotaUD03;

/*El siguiente m�todo main permite leer por teclado y escribir en pantalla un car�cter. Compru�balo. 
 * 
	public static void main (String args[]) throws java.io.IOException { 
		char caracter;
		 int ascii=0;
		System.out.println("Introduzca un caracter por teclado");
		ascii = System.in.read();
		caracter = (char)ascii;
		System.out.print(caracter);
	}
a.	Sabiendo que el c�digo ascii del salto de l�nea es el n�mero 13 y utilizando el ejercicio anterior. 
	Escribe una clase en java cuyo m�todo main lea por teclado una cadena de un m�ximo de 500 caracteres y a 
	continuaci�n muestre por pantalla dicha cadena.
b.	Modifica el ejercicio anterior incluyendo en la clase una funci�n denominada LeerCadena, que lea 
	por teclado una cadena de un m�ximo de 500 caracteres y retorne un String con su contenido.
*/


import java.io.IOException;

public class ejer_08 {
	public static void main (String args[]) throws java.io.IOException { 
		
		System.out.println(lecturaCadena());
	}	
		
	public static String lecturaCadena() throws IOException{
				
		char caracter;
		int ascii=0;
		char[] cadena = new char[500];
		int i = 0;
				
		System.out.println("Introduzca un caracter por teclado");
		
		while(ascii != 13) {
			ascii = System.in.read();
			caracter = (char)ascii;
			System.out.print(caracter);
			i++;
		
	}
		return (String.valueOf(cadena));
	}
}
