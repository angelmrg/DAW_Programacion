package parametroArgumento;

import java.util.Scanner;

/**
 * @author angel
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//pedimos los datos al usuario
		System.out.println("Escribe un número: ");
		int num1 = sc.nextInt();
		System.out.println("Escribe un segundo número: ");
		int num2 = sc.nextInt();
		
		//creamos un objeto de la clase Operaciones
		Operaciones op = new Operaciones();
		
		//Les damos a las diferentes operaciones dos parametros
		op.hacerSuma(num1, num2);
		op.hacerResta(num1, num2);
		op.hacerMulti(num1, num2);
		op.hacerDivi(num1, num2);
		//mostramos los resultados
		op.mostarResultados();
		
		sc.close();
	}
}
