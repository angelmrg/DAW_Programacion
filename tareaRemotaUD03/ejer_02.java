package tareaRemotaUD03;

/*Escribir un programa en Java que imprima 200 veces la palabra “hola”. Nota: en el código fuente 
 * que usted escriba debe figurar solamente una vez la palabra “hola”.
 */

public class ejer_02 {
	public static void main(String[] args) {

		int i;
		for (i = 1; i <= 200; i++) { 		// utilizamos un for para que repita 200 veces la cadena
			System.out.println("hola " + i);
		}
	}
}