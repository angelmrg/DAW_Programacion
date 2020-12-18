package PF03_IMC;
/*1. Busca en Internet cómo se calcula el IMC de una persona.
2. Elige un método de cálculo.
3. Realiza un programa que calcule el IMC en función de los parámetros de Entrada y devuelva la cadena con el diagnostico de complexión.
4. El programa calcula continuamente diagnósticos hasta que el usuario decida salir.
5. Usa métodos estáticos para las diferentes acciones el programa que serán usados desde el main para resolver el problema.
6. Incluye comentarios en el código que expliquen el funcionamiento de tu programa.
   
*/

import java.util.Scanner;

public class PF_03_imc {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		//IMC = peso (Kg)/ estatura (m)*estatura		
		/*En este paso es cuando vamos a insertar los datos*/
		
		System.out.println("**Bien venidos al programa**");
		System.out.println("Para saber tu IMC necesito dos datos:");
		//se pide el dato del peso en kg
		System.out.println("Escribe tu peso en Kg: ");
		//se leen los datos 
		double peso = sc.nextDouble();
		//se piden el dato de la estatura
		System.out.println("Ahora escribe tu estatura en metros (x,x): ");
		//se leen los datos y lo guardamos como cade
		double est = sc.nextDouble();
		
		//creamos las variables de resul y diagnostico y se le asigna los metodos que se han creado
		double resul = calculaIMC(peso, est);
		String diagnostico = calculaDiagnostico(resul);
		
		System.out.println("El IMC que se ha calculado es: " + resul);
		System.out.println("Y su diagnostico es; " + diagnostico);
		
		sc.close();	//cerramos la clase Scanner
		
	}
	
	//metodos para hacer la operacion del calculo del imc
	public static double calculaIMC(double peso, double est) {
		 double resul;
		 resul =peso/(est * est);
		 return resul;
	}
	
	//metodo para segun el resultado del imc te diga un diagnostico
	public static String calculaDiagnostico(double resul) {
		String diagnostico = "";//creo una variable y le asigno una cadena vacia
		
		if(resul < 18.5) {
			diagnostico = "ESTAS DELGADO";
		}
		if((resul >=18.5) && (resul <= 24.9)) {
			diagnostico = "TIENES UN PESO NORMAL";
		}
		if((resul >=25.0) && (resul <= 29.9)) {
			diagnostico = "TIENES SOBREPESO";
		}
		if(resul >=30.0) {
			diagnostico = "TIENES OBESIDAD";
		}
		return diagnostico;
		
	
	}
}
