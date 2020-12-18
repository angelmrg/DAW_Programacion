/**
 * 
 */
package PF07;

/**
 * @author angel
 *
 */
public class MainCuadrado {
	public static void main(String[] args) {
		
		
		Cuadrado a = new Cuadrado(4, "angel");		
		
		
		a.imprimeFigura();
		System.out.println(a);
		System.out.println("El area del cuadrado es: " + a.area());
		System.out.println("El perimetro del cuadrado es: " + a.perimetro());
	}

	
}
