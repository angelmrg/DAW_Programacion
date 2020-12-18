
package sobrecargaMetodos;

/**
 * @author angel
 *
 */
public class Persona {
	
		//atributos
		String nombre;
		int edad;
		String DNI;
		
		//Constructor de Persona
		public Persona(String nombre, int edad, String DNI) {
			this.nombre = nombre;
			this.edad = edad;
			this.DNI = DNI;
		}
		
		//otro constructor
		public Persona(String DNI) {
			this.DNI = DNI;
		}
		
		//metodos
		public void correr() {
			System.out.println("Me llamo " + nombre + " , tengo " 
					+ edad);
		}
		
		public void correr(double Km) {
			System.out.println("He corrido  " + Km + " km.");
		}
		
		public void mostrarDatos() {
			System.out.println("El nombre es: " + nombre);
			System.out.println("La edad es: " + edad);
			System.out.println("El DNI es: " + DNI);
		}
		
		
}
