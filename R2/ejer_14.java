package R2;

/*Realizar un programa en JAVA que muestre el valor de los argumentos
 *  que se le pasan por parámetros. En caso de no existir parámetros, 
 *  se lo comunicaremos al usuario. 
 */

public class ejer_14 {
public static void main(String[] args) {
	
	String num1 ="hola";
	String num2 = "adios";
	
	if(num1=="" || num2=="") {
		System.out.println("Falta algunos de los parámetros");
		
	}else {
	
		System.out.println("Los parametros son " + num1 + " y " + num2);
	}
}
}
