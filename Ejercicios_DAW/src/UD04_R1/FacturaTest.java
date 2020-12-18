/**
 * Crea un programa(FacturaTest) que compruebe el correcto funcionamiento 
 * de la implementaciÃ³n realizada
 */
package UD04_R1;

/**
 * @author angel
 *
 */
public class FacturaTest {
	public static void main(String[] args) {
		
		//creamos el objeto de la factura
		FacturaTest fact = new FacturaTest(1111, "Monitor 24p", 288, "Pedro", "Perez Ruiz", "Calle la liebre", "23987654l", 1);
		
		System.out.println("<<<<<Factura de la compra realizada>>>>>");
		System.out.println();
		fact.producto();
		fact.cliente();
		fact.unidades();
		double total = 0;
		double IVA = 0.18;
		precioTotal(IVA, total);
	}
	//Creamos variables: tipo static para poder usarse en el médodo precioTotal dentro del main
	int codigo;
	String descripcion;
	static int precio;
	String nombre;
	String apellidos;
	String direccion;
	String DNI;
	static int unidades;
	
	//Creamos el constructor Factura y hacemos que coincidan con los parametros
	public FacturaTest(int codigo, String descripcion, int precio, String nombre, String apellidos, 
			String direccion, String DNI, int unidades) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		FacturaTest.precio = precio;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion= direccion;
		this.DNI = DNI;
		FacturaTest.unidades= unidades;
		
		
	}
	
	/**
	 * Metodo producto que se usa para estructurar los datos del producto
	 */
	
	public void producto() {
		System.out.println("Datos del producto");
		System.out.println("******************");
		System.out.println("El Código del producto es: " + codigo);
		System.out.println("Descripción del producto: " + descripcion);
		System.out.println("Precio del producto: " + precio + "€");
		System.out.println("*****************");
		System.out.println();
	}
	/**
	 * Metodo cliente que se usa para estructurar los datos del cliente
	 */
	public void cliente() {
		System.out.println("Datos del cliente");
		System.out.println("*****************");
		System.out.println("Nombre del cliente: " + nombre);
		System.out.println("Apellidos del cliente: " + apellidos);
		System.out.println("Direccion del cliente: " + direccion);
		System.out.println("DNI del cliente: " + DNI);
		System.out.println("*****************");
		System.out.println();

	}
	
	/**
	 * Metodo cliente que se usa para publicar en numero de unidades
	 */
	
	public void unidades() {
		System.out.println("*****************");
		System.out.println("Las Unidades son: " + unidades);
		System.out.println("*****************");
		System.out.println();
	}
	
	public static void precioTotal(double IVA, double total ) {
		double precioIVA = precio*IVA;
		total = (precioIVA+precio)*unidades;
		System.out.println("*********************");
		System.out.println("El precio total es " + total);
	}

}
