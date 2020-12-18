/**
 * 
 */
package constante;

/**
 * @author angel
 *
 */
public class Constante {
	private final String nombre;
	private int edad;

	
	//Constructor
	public Constante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	

	public void mostrarDatos() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}
	
}
