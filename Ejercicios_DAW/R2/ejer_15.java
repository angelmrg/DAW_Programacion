package R2;

/*Realizar un programa que nos muestre la tabla de multiplicar
 *  de un n�mero entero pasado por par�metro. 
 */

public class ejer_15 {
public static void main(String[] args) {
	int tabla = 7;
	
	for(int i = 0;i<=10;i++) {
		int resul = i*tabla;
		System.out.println(tabla + " x " + i + " = " + resul);
	}
}
}
