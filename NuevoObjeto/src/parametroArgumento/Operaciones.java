package parametroArgumento;
import java.util.Scanner;



/**
 * @author angel
 *
 */
public class Operaciones {

	Scanner sc = new Scanner(System.in);
	//Atributos
	int num1;
	int num2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//M�todos
	
	//M�todo para leer los operadores
//	public void leerNumeros() {
//		System.out.println("Escribe el primer n�mero: ");
//		num1 = sc.nextInt();
//		System.out.println("Escribe el segundo n�mero: ");
//		num2 = sc.nextInt();
//	}
//	
	//M�todo para hacer la suma de los dos numeros
	public void hacerSuma(int num1, int num2) {
		suma = num1 + num2;
	}
	
	//Metodo para hacer la resta de dos numero
	public void hacerResta(int num1, int num2) {
		resta  = num1 - num2;
	}
	
	//Metodo para hacer la multiplicacion de dos numeros
	public void hacerMulti(int num1, int num2) {
		multiplicacion  = num1 * num2;
	}
	
	//Metodo para hacer la division de dos numeros
	public void hacerDivi(int num1, int num2) {
		division  = num1 / num2;
	}
	
	//Metodo para mostrar los resultados
	public void mostarResultados() {
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("La multiplicacion es " + multiplicacion);
		System.out.println("La division es : " + division);
	}
	
}
