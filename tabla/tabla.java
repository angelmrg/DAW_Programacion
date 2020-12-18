package tabla;

/*1. Codifica en Java el programa de las tablas de Multiplicar de Scratch (Intr$
1.1. El Programa pedirá en primer lugar al usuario cuál es la tabla a recita$
1.2. A continuación, el programa recitará la tabla con 10 mensajes del tipo $
1.3. Finalmente, el programa preguntará al usuario si desea recitar otra tab$
*/
import java.util.Scanner;


public class tabla {
	public static void main (String[]arg) {
				
		//Creo el menu para que me pregunte si quiero empezar el programa.
		Scanner sr = new Scanner(System.in);
		System.out.println("Bien venidos al programas de Tablas de Java");
		System.out.println("*******************************************");
		System.out.println("¿Quieres que te diga alguna tabla? si/no");					//pedimos al usuario que inserte los datos
				
		String res = sr.next();															//leemos los datos insertados
				
		//mientras que la contestacion es 'si' ya empieza a funcionar preguntando que tabla quiero				
		while(res.equals("si")) {														//aqui empieza el bucle con la condicion de que en dato insertado sea "si"
			int i = 0;
			System.out.println("¿Qué tablas quieres que te muestre?");					//aqui introducimos el dato de que tabla queremos ver
			int x = sr.nextInt();														//leemos el dato de que tabla queremos ver
			while(i <= 10) {
				System.out.println(x + " x " + i +" = " + x*i);							//mediante un while hacemos la operacion de la tabla de multiplicar
				i++;																	//para que se repita la operacion mientras que el contador sea menor o igual a 10
		}
			System.out.println("¿quieres ver otra tabla?");								//nos preguntar si queremos ver otra tabla 
			res = sr.next();			
		
		}
		
			System.out.println("hasta la proxima");										//si la contestación es algo diferente a si nos mostrará esta cadena de caracteres.
			sr.close();
	}

}
