/**
 * @author angel
 *
 */
public class Coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	//Métodos
	public static void main(String[] args) {
		Coche coche1 = new Coche();
		
		//Valores de los atributos
		coche1.color = "verde";
		coche1.marca = "Seat";
		coche1.km = 0;
		
		System.out.println("El vehiculo coche1 es : " + coche1.color);
		System.out.println("El vehiculo coche1 es un: " + coche1.marca);
		System.out.println("El vehiculo coche1 tiene " + coche1.km + " Km");
		
		
		Coche coche2 = new Coche();
		
		coche2.color = "Blanco";
		coche2.marca = "Ferrari";
		coche2.km = 100;
		
		System.out.println("\nEl vehiculo coche1 es : " + coche2.color);
		System.out.println("El vehiculo coche1 es un: " + coche2.marca);
		System.out.println("El vehiculo coche1 tiene " + coche2.km + " Km");
		
	}
}
