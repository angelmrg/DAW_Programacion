package UD02;

/*Modifica el programa anterior para que cumpla los siguientes requisitos
Incluir una estructura do..while()  para que el programa se ejecute indefinidamente hasta que el usuario decida salir.
Solicitar al usuario cada vez, cuántos lanzamientos se harán del dado y cuántos de la Moneda. Implementar estos lanzamientos consecutivos mediante bucles tipo for().
Contabilizar y mostrar cuántas veces ha salido un número > 4 de todas las veces que se ha lanzado el dado durante la ejecución del programa.
Contabilizar y mostrar cuántas veces ha salido Cara de todas las veces que se ha lanzado la moneda durante la ejecución del programa.
*/

import java.util.Scanner;

public class UD02_2 {
	public static void main(String[] args) {
		System.out.println("Bien venidos al generador de numeros");
		System.out.println("Se generará un número de un dado");
		System.out.println("********************************");
		Scanner sc = new Scanner(System.in);
		String res;
		int num=0;
		int contdado = 0;
		int cara = 0;
		int cruz = 0;
		
		
		do {		
			System.out.println("¿Cuantas veces quieres que se tire el dado?");
			int numdado = sc.nextInt();
			int i;
		
		for(i=1 ; i<=numdado ; i++ )
			System.out.println("En el dado ha salido un " + lanzarDado());
			num = lanzarDado();
			if(num > 4) {
				contdado = contdado + 1;
			}
		
			System.out.println("¿Cuantas veces quieres que se tire la moneda?");
			int numoneda = sc.nextInt();
			int e;
			
			for(e=1 ; e<=numoneda ; e++)
				if (lanzarMoneda() == true) {
					System.out.println("La moneda ha salido cara");
					cara = cara + 1;
				}else {
					System.out.println("La moneda ha salido cruz");
					cruz = cruz + 1;
				}		
				System.out.println("¿Quieres jugar atra vez?");
				res = sc.next();
		
		}while(res.equals("si"));
			
		System.out.println("Hasta la proxima");
		System.out.println("Han salido " + contdado + " números mayores que 4.");
		System.out.println("Han salido " + cara + " cara y " + cruz + " cruz." );
		
		sc.close();
	}
		
	
	
	public static int lanzarDado() {		
		
		return  (int) (Math.random()*6+1);
	}	
	
	public static boolean lanzarMoneda() {
		return Math.random() < 0.5;
	}
	
	
}


