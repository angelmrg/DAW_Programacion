package tareaRemotaUD03;

/*El siguiente método main permite leer por teclado y escribir en pantalla un carácter. Compruébalo. 
 * 
	public static void main (String args[]) throws java.io.IOException { 
		char caracter;
		 int ascii=0;
		System.out.println("Introduzca un caracter por teclado");
		ascii = System.in.read();
		caracter = (char)ascii;
		System.out.print(caracter);
	}
a.	Sabiendo que el código ascii del salto de línea es el número 13 y utilizando el ejercicio anterior. 
	Escribe una clase en java cuyo método main lea por teclado una cadena de un máximo de 500 caracteres y a 
	continuación muestre por pantalla dicha cadena.
b.	Modifica el ejercicio anterior incluyendo en la clase una función denominada LeerCadena, que lea 
	por teclado una cadena de un máximo de 500 caracteres y retorne un String con su contenido.
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
