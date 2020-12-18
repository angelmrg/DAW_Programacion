/*
 * Crea una clase BombillaLED que herede de la clase Bombilla:
 *	a) Esta clase tendr� la peculiaridad de que tiene tres tonalidades
 *	   de color diferentes entre las que puede intercambiar.
 *	b) La bombilla se enciende siempre por primera vez con el primer color, 
 *	   cambia al siguiente color cuando se apaga y enciende en un periodo de tiempo inferior a 3 segundos.
 *	c) Debe contener un m�todo toString que muestre, adem�s de la informaci�n del m�todo toString de la 
 *     clase padre, la tonalidad de color que tiene si la bombilla est� encendida.
 *
 */

package PF07_bombilla;

/**
 * @author angel
 *
 */
public class BombillaLED extends Bombilla{
private static final TipoBombilla tipo = TipoBombilla.LED;
	
	public BombillaLED(String nombre, String marca, String modelo, float consumo, long vidaUtil) {
		super(nombre, marca, modelo, consumo, vidaUtil);
	}

	@Override
	public TipoBombilla getTipo() {
		return tipo;
	}
}
