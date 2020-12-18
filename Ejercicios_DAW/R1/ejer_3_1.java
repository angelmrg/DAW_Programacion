package R1;

import java.util.Scanner;

/*Escribe un algoritmo que pida tres números y los muestre ordenados*/

public class ejer_3_1 {
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	System.out.println("Escribe tres numero en la consola");
	System.out.println("Primer numero: ");
	int mayor = sr.nextInt();
	System.out.println("Segundo numero: ");
	int num = sr.nextInt();
	//System.out.println("Tercer numero");
	 //num = sr.nextInt();
	int medio;
	int menor = 0;
	
	if(num > mayor) {
		medio = mayor;
		mayor = num;
	}else {
		medio = num;
	}
	
	System.out.println("Tercer numero");
	 num = sr.nextInt();
	 if(num > mayor) {
		 menor = medio;
		 medio = mayor;
		 mayor = num;
	 }else if(num>medio){
		 menor = medio;
		 medio=num;		 
	 }else {
		 menor = num;
	 }
	 
	System.out.println(mayor + " " + medio + " " + menor);
	
	sr.close();
}
}
