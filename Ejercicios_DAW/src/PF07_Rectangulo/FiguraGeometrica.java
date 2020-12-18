
package PF07_Rectangulo;

/**
 * @author angel
 *
 */
public abstract class FiguraGeometrica {

	
	private String nombre;
	
	public FiguraGeometrica() {
		nombre="Sin Nombre";
	}
	
	public FiguraGeometrica(String nombre) {
		this.nombre=nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * M�todo que devuelve el �rea de la figura geom�trica
	 * @return �rea de la figura geom�trica en cent�metros cuadrados
	 */
	public abstract float area();
	
	/**
	 * M�todo que devuelve el per�metros de la figura geom�trica
	 * @return per�metro de la figura geom�trica en cent�metros
	 */
	public abstract float perimetro();
	
	/**
	 * M�todo que realiza una representaci�n de la figura por Consola.
	 */
	public abstract void imprimeFigura();
	
	@Override
	public String toString() {
		return "Figura Geom�trica: " + nombre + ". " + super.toString();
	}

}
