package sobrecargaConstructores;

/**
 * @author angel
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//Creo el objeto p1 de la clase persona con dos parametros
		Persona p1 = new Persona("Angel", 42, "28628528Z");
		
		//imprimimos el metodo mostrarDatos
		p1.mostrarDatos();

	}
}