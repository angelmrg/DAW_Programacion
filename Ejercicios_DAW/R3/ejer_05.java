package R3;

/*Diseñar dos funciones "EurosAPesetas()" y "PesetasAEuros()" que realicen las conversiones de monedas 
 * 
 */

import java.util.Scanner;

public class ejer_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Bien venidos al conversor de monedas");
	System.out.println("************************************");
	System.out.println("Cual es la cantidad que quierse convertir:");
	double dinero = sc.nextDouble();
	System.out.println("¿Quieres pasar a Pesetas o a Euros: pesetas/euros");
	System.out.println("*************************************************");
	String pasar = sc.next();
	
	System.out.println("Quieres pasar " + dinero + " a " + pasar);
	
	if(pasar.equals("pesetas")) {
		System.out.println("El cambio de " + dinero + " euro, son " + EurosAPesetas(dinero) + " pesetas.");
	}else if(pasar.equals("euros")){
		System.out.println("El cambio de " + dinero + " pesetas, son " + PesetasAEuros(dinero) + " euros.");
	}else {
		System.out.println("<<<<<<<No entiendo lo que has puesto>>>>>>>>");
		
	}
		
	
	sc.close();
}


public static double EurosAPesetas(double dinero) {
	double peseta = 166.386;
	double cambioPeseta = dinero*peseta;
	return cambioPeseta;
}

public static double PesetasAEuros(double dinero) {
	double euro = 166.386;
	double cambioEuro = dinero/euro; 
	return cambioEuro;
}


}
