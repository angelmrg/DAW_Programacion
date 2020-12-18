package tareaRemotaUD03;

/*9.	Escribir un programa que permita jugar a doble o nada: El jugador apuesta
 *  una cantidad y tira una moneda. Si sale cara obtiene el doble de la cantidad apostada. 
 *  Si sale cruz la pierde todo.*/
import java.util.Scanner;

public class ejer_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cara = 0;														//variable definidas y con valor 0
		int cruz = 0;

		System.out.println("*****Bien venido al casino*****");				//pedimos los datos por teclado
		System.out.println("¿Cual es tu apuesta?");
		float apuesta = sc.nextFloat();										//leemos los datos del tipo float
		System.out.println("Has apostado " + apuesta);						//imprimimos el dato introducido

		if (lanzarMoneda() == true) {										//si el resultado del metodo lanzarMoneda es true 
			System.out.println("La moneda ha salido cara");					//te lo imprime y ganas el doble de lo apostado
			cara = cara + 1;
			System.out.println("Has ganado " + (2 * apuesta));
		} else {															//de lo contrario te imprime que has perdido
			System.out.println("La moneda ha salido cruz");
			cruz = cruz + 1;
			System.out.println("Lo has perdido todo");
			System.out.println("Undete en la miseria");
		}

		sc.close();
	}

	public static boolean lanzarMoneda() {									//metodo static para el lanzamiento de la moneda
		return Math.random() < 0.5;
	}
}
