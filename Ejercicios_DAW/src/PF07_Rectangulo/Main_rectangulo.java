/**
 * Crea una clase Rect�ngulo que herede de la clase Figura Geom�trica y adapte 
 * toda la funcionalidad de la clase a un Rect�ngulo.

 */
package PF07_Rectangulo;


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
