package PF04_Loteria;

import java.util.*;

public class loteria {
	static int nboleto,boleto1,boleto2,boleto3,boleto4,boleto5,boleto6,boleto7,boleto8,boleto9,boleto10;
	static int premio1,premio2,premio3;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos boletos quieres comprar?");
		nboleto = sc.nextInt();
		comprarboleto(nboleto);
		sc.close();
	}
	public static void comprarboleto(int nboleto) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca cada número uno a uno (introducir un número y darle al botón intro) entre el 1 y el 20,\n"
				+ "si pones otro número no sea del 1 al 20 no tendrás ninguna posibilidad de ganar.");
		switch(nboleto) {
		case 10:
			boleto10 = sc.nextInt();
		case 9:
			boleto9 = sc.nextInt();
		case 8:
			boleto8 = sc.nextInt();
		case 7:
			boleto7 = sc.nextInt();
		case 6:
			boleto6 = sc.nextInt();
		case 5:
			boleto5 = sc.nextInt();
		case 4:
			boleto4 = sc.nextInt();
		case 3:
			boleto3 = sc.nextInt();
		case 2:
			boleto2 = sc.nextInt();
		case 1:
			boleto1 = sc.nextInt();
			break;
		default:
			System.out.println("Al no haber introducido un número entre el 1 y el 10, se accederá a la compra de 1 boleto.");
			boleto1 = sc.nextInt();
			break;
		}
		/*System.out.println(boleto1 + " " + boleto2 + " " + boleto3 + " " + boleto4 + " " + boleto5 + " " + boleto6 + " " + boleto7 + " " +
		boleto8 + " " + boleto9 + " " + boleto10);*/
		sc.close();
		
	}
}
