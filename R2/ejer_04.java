package R2;

/*Programa que muestre los números del 1 al 100 sin 
 * contar aquellos que son múltiplos de 5 */


public class ejer_04 {
	public static void main(String[] arg) {
		
		int i=1;
		
		while(i<=100) {
			if(i%5==0) {
				i++;
			}else {
				System.out.println(i);
				i++;
			}
		}
	}
}
