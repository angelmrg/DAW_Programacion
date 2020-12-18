package R1;

/*Escribe un algoritmo que pida tres números y los muestre ordenados*/

import java.util.Scanner;

public class ejer_03 {
	public static void main(String[] arg){
		
		Scanner sr = new Scanner(System.in);
		System.out.println("Escribe tres numero en la consola");
		System.out.println("Primer numero: ");
		int num1 = sr.nextInt();
		System.out.println("Segundo numero: ");
		int num2 = sr.nextInt();
		System.out.println("Tercer numero");
		int num3 = sr.nextInt();
		//1,2,3
		if((num1>=num2)&&(num2>=num3)) {
			System.out.println(num1 + ", " + num2 + ", " + " y " + num3);
		}
		//1,3,2
		else if((num1>=num3)&&(num3>=num2)){
			System.out.println(num1 + ", " + num3 + ", " + " y " + num2);
		}
		//2,1,3
		else if((num2>=num1)&&(num1>=num3)) {
			System.out.println(num2 + ", " + num1 + ", " + " y " + num3);
		}
		//2,3,1
		else if((num2>=num3)&&(num3>=num1)) {
			System.out.println(num2 + ", " + num3 + ", " + " y " + num1);
		}
		//3,1,2
		else if((num3>=num1)&&(num1>=num2)) {
			System.out.println(num3 + ", " + num1 + ", " + " y " + num2);
		}
		//3,2,1
		else if((num3>=num2)&&(num2>=num1)) {
			System.out.println(num3 + ", " + num2 + ", " + " y " + num2);
		}
		System.out.println("Se ha terminado");
		
		sr.close();
	}

}
