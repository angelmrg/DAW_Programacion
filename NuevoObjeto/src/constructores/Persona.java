
package constructores;

/**
 * @author angel
 *
 */
public class Persona {
	
		//atributos
		String nombre;
		int edad;
		
		//PRIMER METODO
		//metodos constructor. Inicializo dos variables _nombre y _edad
		//y les doy el valor cuando lo reciva desde el main.
//		public Persona(String _nombre, int _edad) {
//			nombre = _nombre;
//			edad = _edad;
//			
//		}
//		
//		public void mostrarDatos() {
//			System.out.println("El nombre es: " + nombre);
//			System.out.println("La edad es: " + edad);
//		}
	
		//SEGUNDO METODO
		public Persona(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
			
		}
		
		public void mostrarDatos() {
			System.out.println("El nombre es: " + nombre);
			System.out.println("La edad es: " + edad);
		}
		
		
}
