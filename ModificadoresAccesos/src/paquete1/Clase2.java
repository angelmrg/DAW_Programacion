package paquete1;

public class Clase2 {
	public static void main(String[] args) {
		
		//Creamos los objetos 
		Clase1 objeto1 = new Clase1();
		Clase1 objeto2 = new Clase1();
		
		//Les damos los valores por medio de los setters
		objeto1.setEdad(15);
		objeto2.setNombre("Angel");
		
		//Mostramos los valores por medio de los getters.
		System.out.println("Tengo " + objeto1.getEdad() + " y me llamo " + objeto2.getNombre());
		
	}

}
