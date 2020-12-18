/**
 * 
 */
package UD04_R1;

/**
 * @author angel
 *
 * Crea una clase Temperatura, con los siguientes atributos:
 * 	a) Una fecha (composición)
 *  b) Una temperatura máxima y una temperatura mínima.
 *  
 *  Los métodos:
 *  c) Los constructores
 *  d) Modificar temperaturas
 *  e) Devolver temp. max, temp. min y temp. media.
 *  f) toString: Que debe mostrar en pantalla la fecha, la temp.max, min y media.
 */
public class Temperatura {

	
	private int Max;
	private int Min;
	
	public Temperatura(int maxima, int minima) {
		
		this.Max = maxima;
		this.Min = minima;
	}
	
	public void DevolverMax(int temperaMaxima) {
		Max = temperaMaxima;
	}
	
	public void DevolverMin(int temperaMinima) {
		Min = temperaMinima;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("La temperatura máxima es " + Max);	
		sb.append(", la temperatura mínima es " + Min);
		sb.append(" y la temperatura media es: " + ((Max+Min)/2));
		return sb.toString();
		}
	
	
}
