/**
 * 
 */
package PF07;

/**
 * @author angel
 *
 */
public class Rectangulo extends FiguraGeometrica{
	private static String relleno = "* ";
	private float lado1;
	private float lado2;
	//private String nombre;
	
	public Rectangulo(float lado1, float lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public Rectangulo(float lado1, float lado2, String nombre) {
		super(nombre);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	@Override
	public float area() {
		return lado1 * lado2;
	}

	@Override
	public float perimetro() {
		return 2*lado1+2*lado2;
	}
	
	@Override
	public void imprimeFigura() {
		int lado1 = (int)this.lado1;
		
		for(int i=1;i<=lado1;i++) {
			System.out.print(relleno);
			if(lado2>1) {
				for(int j=2;j<=lado2;j++)
					System.out.print(relleno);
			}
			System.out.println("");
		}
		
	}
	
	/**
	 * @return the caracterRelleno
	 */
	public static String getCaracterRelleno() {
		return relleno;
	}

	/**
	 * @param caracterRelleno the caracterRelleno to set
	 */
	public static void setCaracterRelleno(String caracterRelleno) {
		Rectangulo.relleno = caracterRelleno;
	}	
}
