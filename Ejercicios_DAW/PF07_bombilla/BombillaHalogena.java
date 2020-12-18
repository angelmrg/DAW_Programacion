package PF07_bombilla;

/**
 * @author angel
 *
 */
public class BombillaHalogena extends Bombilla {

	private static final TipoBombilla tipo = TipoBombilla.HALOGENA;
	
	public BombillaHalogena(String nombre, String marca, String modelo, float consumo, long vidaUtil) {
		super(nombre, marca, modelo, consumo, vidaUtil);
	}

	@Override
	public TipoBombilla getTipo() {
		return tipo;
	}

}
