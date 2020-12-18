package R2;

/*Programa que muestre la tabla de multiplicar de los números 1,2,3,4 y 5. 
 * 
 */

public class ejer_10 {
	public static void main(String[] args) {
		System.out.println("Este programa muestra las tablas del 1, 2, 3, 4 y 5");
		System.out.println("***************************************************");
		int tabla = 1;

		while (tabla <= 5) {
			int i = 1;
			System.out.println("Tabla del " + tabla);
			System.out.println("***************");
			while (i <= 10) {
				System.out.println(tabla + " x " + i + " = " + tabla * i);
				i++;
			}
			System.out.println("****************");
			tabla++;
		}
	}
}
