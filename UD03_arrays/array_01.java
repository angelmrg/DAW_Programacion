package UD03_arrays;


/*Crear un array con 4 elementos, meterlos en el orden que queramos. 
 * hacer un afuncion que las ordene de menor a mayor.
 */

public class array_01 {
	static int[] enteros = {6, 25, 7, 14};					//definimos un arrays y le damos 4 elementos
	static int i;
	static int e;
	static int extra;
public static void main(String[] args) {
	ordenarArray(i,e);
	
	
	/*Arrays.sort(enteros);
	for(i=0 ; i<enteros.length ; i++) {				//utilizamos el metodos sort() de la clase Arrays para ordenarlos
		System.out.print(enteros[i] + " ");			//con el for lo ponermos para que muestre del menor al mayor
	}*/	
	
	
	
}
	public static void ordenarArray(int i, int e) {
		for(i=0; i<4; i++) {
			for(e=i+1; e<4; e++) {
				
				if(enteros[i]>enteros[e]) {
					extra = enteros[i];
					enteros[i] = enteros[e];
					enteros[e] = extra;
				}				
			}
		}
		System.out.print("enteros = { ");
		for(i=0; i<4; i++) {
			System.out.print(enteros[i] +  ", ");
		}
		System.out.print(" }");
		return;
	}

}
