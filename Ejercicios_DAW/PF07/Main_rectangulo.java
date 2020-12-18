/**
 * 
 */
package PF07;

/**
 * @author angel
 *
 */
public class Main_rectangulo {

	public static void main(String[] args) {
		Rectangulo a = new Rectangulo(9, 5, "angel");

		a.imprimeFigura();
		System.out.println(a);
		System.out.println("El area del cuadrado es: " + a.area());
		System.out.println("El perimetro del cuadrado es: " + a.perimetro());
	}
}