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
	
	//Métodos
	
	//Método para leer los operadores
	public void leerNumeros() {
		System.out.println("Escribe el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		num2 = sc.nextInt();
	}
	
	//Método para hacer la suma de los dos numeros
	public void hacerSuma() {
		suma = num1+num2;
	}
	
	//Metodo para hacer la resta de dos numero
	public void hacerResta() {
		resta = num1-num2;
	}
	
	//Metodo para hacer la multiplicacion de dos numeros
	public void hacerMulti() {
		multiplicacion = num1*num2;
	}
	
	//Metodo para hacer la division de dos numeros
	public void hacerDivi() {
		division = num1/num2;
	}
	
	//Metodo para mostrar los resultados
	public void mostarResultados() {
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("La multiplicacion es " + multiplicacion);
		System.out.println("La division es : " + division);
	}
	
}
