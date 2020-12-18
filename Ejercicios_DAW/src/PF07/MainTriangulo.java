/**
 * 
 */
package PF07;

/**
 * @author angel
 * Crea una clase Triángulo que herede de la clase Figura Geométrica 
 *  y adapte toda la funcionalidad de la clase a un Triángulo.
 */
public class MainTriangulo {
	public static void main(String[] args) {
		
	
	Triangulo a = new Triangulo(6, 5);		
						
		a.imprimeFigura();
		System.out.println(a);
		System.out.println("El area del cuadrado es: " + a.area());
		System.out.println("El perimetro del cuadrado es: " + a.perimetro());

	}
}
