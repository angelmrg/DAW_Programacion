package R2;

/*Programa que muestre los n�meros pares entre 2 y 30.*/


public class ejer_03 {
	public static void main(String[] arg) {
		
		int i=2;
		
		while(i<=30) {	
			if(i%2==0) {
				System.out.println(i);
				i++;
			}else {
				i++;
			}
		}
	}
}
 