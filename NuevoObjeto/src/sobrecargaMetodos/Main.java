package sobrecargaMetodos;

/**
 * @author angel
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//Creo el objeto p1 de la clase persona con dos parametros
		Persona p1 = new Persona("Angel", 42, "28628528z");
		
		//imprimimos el metodo mostrarDatos
		p1.mostrarDatos();
		
		p1.correr();
	
		Persona p2 = new Persona("28628528z");
		p2.correr(150);

	}
}
