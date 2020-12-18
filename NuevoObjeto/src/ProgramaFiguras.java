import figuras.CuadradoBasico;

/**
 * @author angel
 *
 */
public class ProgramaFiguras {
	public static void main(String[] args) {
		
	
	CuadradoBasico a = new CuadradoBasico(58);
	CuadradoBasico b = new CuadradoBasico(12);
	
	
	System.out.println("A: " + a.getLado());
	System.out.println("B: " + b.getLado());
	a.setLado(8);
	b.setLado(25);
	System.out.println("A: " + a.getLado());
	System.out.println("B: " + b.getLado());	
	
	
	
	}	
	
}
