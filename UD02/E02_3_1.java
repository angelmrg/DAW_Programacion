package UD02;

/*Crea un programa que tenga dos métodos estáticos que trabajen con la clase Random.
public static int lanzarDado()
Que simula el lanzamiento de un dado de 6 caras y devuelve la cara arriba.
public static boolean lanzarMoneda() 
Simula el lanzamiento de una moneda y devuelve true cuando es cara y false en caso contrario.
El programa lanza el dado y la moneda y muestra los resultados.
*/


public class E02_3_1 {
	public static void main(String[] args) {
		System.out.println("Bien venidos al generador de numeros");
		System.out.println("Se generará un número de un dado");
		System.out.println("********************************");
		
		System.out.println("En el dado ha salido un " + lanzarDado());
		
		if (lanzarMoneda() == true) {
			System.out.println("La moneda ha salido cara");
		}else {
			System.out.println("La moneda ha salido cruz");
		}		
		
		
	}
	
	public static int lanzarDado() {		
		
		return (int) (Math.random()*6+1);
	}	
	
	public static boolean lanzarMoneda() {
		return Math.random() < 0.5;
	}
	
	
}

