/**
 * 
 */
package PF07;

/**
 * @author angel
 *
 */
public class Triangulo extends FiguraGeometrica{
	private static String relleno = "* ";
	private float base;
	private float altura;
	
	/**
	 * 
	 */
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Triangulo(float base, float altura, String nombre) {
		super(nombre);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float area() {
		return (base * altura)/2;
	}

	@Override
	public float perimetro() {
		int hipo = (int) Math.sqrt((base*base)+(altura*altura));
		return base + altura + hipo;
	}

	@Override
	public void imprimeFigura() {
		int base = (int)this.base;
		int altura = (int)this.altura;
		
		for(int i=1;i<=altura-1;i++){        
                System.out.println(relleno);
            }
        for(int e=1;e<=base;e++) {
        	System.out.print(relleno);
        }
        System.out.println();
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
		Triangulo.relleno = caracterRelleno;
	}

}
