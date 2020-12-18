package PF07;

/**
 * @author angel
 *
 */
public class CuadradoBasico {
	
	/**
	 * Caracter espacio
	 */
	private static final String ESPACIO = "  ";

	/**
	 * Caracter de Relleno
	 */
	public static final String CARACTER_RELLENO = "# ";
	
	/**
	 * Propiedad lado del cuadrado.
	 */
	private int lado;
	
	/**
	 * Propiedad nombre del cuadrado
	 * Implementar getters and Setters. (Alt + Shift + S)
	 */
	private String nombre = "Sin nombre";
	
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
	 * Constructor por defecto
	 */
	public CuadradoBasico() {
		lado = 1;
	}
	
	/**
	 * Constructor sobrecargado que asigna un tama�o
	 * @param lado longitud en cent�metros del lado del cuadrado
	 */
	public CuadradoBasico(int lado) {
		this.lado = lado;
	}
	
	/**
	 * Constructor sobrecargado que asigna un tama�o de lado y un nombre
	 * @param lado longitud en cent�metros del lado del cuadrado
	 * @param nombre cadena que identifica al cuadrado
	 */
	public CuadradoBasico(int lado, String nombre) {
		this.lado = lado;
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el �rea del Cuadrado
	 * @return �rea en cent�metros del Cuadrado
	 */
	public int area() {
		return lado*lado;
	}
	
	/**
	 * Devuelve el per�metro del cuadrado
	 * @return per�metros en cent�metros del cuadrado.
	 */
	public int perimetro() {
		return 4*lado;
	}
	
	/**
	 * Devuelve una descripci�n del cuadrado.
	 */
	@Override
	public String toString() {
		return "Un cuadrado llamado "+ nombre  + " de " + lado + " cm de lado";
	}
	
	/**
	 * M�todo que informa que la finalizaci�n del objeto
	 */
	@Override
	public void finalize() throws Throwable {
		System.out.println("Destruyendo el cuadrado: " + nombre);
	}
	
	/**
	 * M�todo que realiza una representaci�n del cuadrado con caracteres de relleno
	 */
	public void imprimeCuadradoRelleno() {
		for(int i=1;i<=lado;i++) {
			System.out.print(CARACTER_RELLENO);
			if(lado>1) {
				for(int j=2;j<=lado;j++)
					System.out.print(CARACTER_RELLENO);
			}
			System.out.println("");
		}
	}
	
	/**
	 * Realiza una representaci�n del cuadrado vac�o
	 */
	public void imprimeCuadradoVacio() {
		
		System.out.println("Imprimiendo Cuadrado: " + nombre);
		if(lado>0) {
		int limite = lado + 2;
			for(int i=1; i<=limite-1; i++) {
				if(i==1)
					imprimeFilaBordeSuperior(limite);
				else if (i==limite-1)
					imprimeFilaBordeInferior(limite);
				else
					imprimeFilaInterna(limite);
				System.out.println("");
			}
		}
	}
	 
	/**
	 * M�todo interno que dibuja una fila de borde superior de la representaci�n vac�a
	 * @param tama�o longitud de la fila
	 */
	private void imprimeFilaBordeSuperior(int tamanio) {
		for(int i=1;i<=tamanio;i++) {
			if(i==1 || i == tamanio)
				System.out.print(" ");
			else
				System.out.print("__");
		}
	}
	
	/**
	 * M�todo interno que dibuja una fila de borde inferior de la representaci�n vac�a
	 * @param tama�o longitud de la fila
	 */
	private void imprimeFilaBordeInferior(int tamanio) {
		for(int i=1;i<=tamanio;i++) {
			if(i==1 || i == tamanio)
				System.out.print("|");
			else
				System.out.print("__");
		}
	}
	
	/**
	 * M�todo interno que dibuja una fila interna de la representaci�n vac�a
	 * @param tama�o longitud de la fila
	 */
	private void imprimeFilaInterna(int tamanio) {
		for(int i=1;i<=tamanio;i++) {
			if(i==1 || i == tamanio)
				System.out.print("|");
			else
				System.out.print(ESPACIO);
		}
	}
}
