package PF04_Loteria;


/*
 * Grupo 1, 1º DAW Grupo B
 * Angel
 * Juan Carlos
 * David
 */

import java.util.*;
import javax.swing.*;

public class LoteriaPF04 {
	
	//Variables estáticas
	static int numBoleto, numPremiados;
	static int boleto1, boleto2, boleto3, boleto4, boleto5, boleto6, boleto7, boleto8, boleto9, boleto10;
	static int premiado1, premiado2, premiado3; 
	
	//Scaner estático
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Variables
		String resp = "Si";													//Variable de continuación del programa o salida del mismo.
		String password = ""; 												// El password es 1234
		int fallos = 3;														// Este es el contador de errores de pin
		
		//Bucle 1
		 while (true) {																// Comienzo del programa en el que nos pide el pin correcto
			
			JPasswordField pf = new JPasswordField();
			int okCxl = JOptionPane.showConfirmDialog(null, pf, "INSERTE EL PIN CORRECTO", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE);
			if (okCxl == JOptionPane.OK_OPTION);
			password = new String(pf.getPassword());

			if (password.equals("1234")) { 									// Si se introduce bien el pin
																			// Nos muestra que hemos accedido
				JOptionPane.showConfirmDialog(null, "Pin correcto Acceso permitido");
				System.out.println("Ahora tenemos que saber el numero de boletos que quieres comprar");
				
				//Bucle 2
				while (true) {
					
					if (resp.equals("Si")) {
						
						// Comprar boletos
						System.out.println("****************************************************************");
						System.out.println("¿Cuantos boletos desea comprar?");
						numBoleto = sc.nextInt();
						
						//Se compra el número de boletos deseados.
						comprarboleto(numBoleto);
						
						//Muestra los boletos comprados.
						muestracompra(numBoleto);
						
						System.out.println("****************************************************************");
						
						// Ahora hacemos el sorteo de los tres numeros
						hacerSorteo(); 										// Este método realiza el sorteo matemáticamente de forma interna.
						mostrarSorteo(); 									// Imprime el resultado del sorteo.
						compruebaPremios(boleto1,boleto2,boleto3,boleto4,
								boleto5,boleto6,boleto7, boleto8,boleto9,	// Comparación de nº boleto y nº sorteo, podemos ganar de 0 a 3
								boleto10,premiado1,premiado2,premiado3,
								numBoleto); 
						System.out.println("****************************************************************");
						
						//Pregunta si desea realizar otro sorteo
						resp = respuesta();
						
					//Salida del bucle 2
					} else if (resp.equals("No")) {
						
						System.out.println("Vuelva cuando quieras.");
			        	break;
			        
			        /*Si no coincide con las respuestas "Si" o "No" volverá 
			        aquí hasta que sea una de las dos respuestas.*/
					} else {
						
			        	System.out.println("Disculpa, no entendí.");
			        	resp = respuesta();
				        
					}
					
				}
				
			// Entrada de pin incorrectos	
			} else {														
				
				System.out.println("Contraseña incorrecta, inténtelo de nuevo");
				
				fallos--; 													// Contador de fallos
				
				JOptionPane.showConfirmDialog(null, "Pin incorrecto, tienes " + fallos + " intentos.");

				if (fallos == 0) {											// Entrada de tres pines incorrectos
					
					JOptionPane.showConfirmDialog(null,
							"Acceso restringido, debes esperar para volver a escribir el pin");
					
					//El programa se detiene 30 segundos y se vuelve a iniciar.
				    try {
				    	
						Thread.sleep(30000);
						
					//Si surge algún problema, lo imprime por pantalla la traza de error.
					} catch (InterruptedException e) {						
						
						e.printStackTrace();
						
					}
				    
				    fallos = 3;

				}
				
			}
			
			if (resp.equals("No")) {
				
				break;
				
			}

		}
		

	}

	// METODOS

	// Hacer sorteo
	public static void hacerSorteo() {
		
		System.out.println(">>> ¡Vamos a realizar el sorteo!");
		
		for (int premios = 1; premios < 4; premios++) { 					// Este bucle solo sacará 3 números premiados
			numPremiados = (int) Math.floor((Math.random() * 20) + 1); 		// Número al azar del 1 al 20
			guardarPremio(premios, numPremiados); 							// Método de guardado
			
		}
	}
	
	//Recoge los números en cada boleto.
	public static void comprarboleto(int numBoleto) {	
		
		System.out.println("Por favor introduzca cada número uno a uno (introducir un número y darle al botón intro) entre el 1 y el 20,\n"
				+ "si pones otro número no sea del 1 al 20 no tendrás ninguna posibilidad de ganar.");
		
		//Recoge cada valor de cada boleto en cascada.
		switch(numBoleto) {
		case 10:
			boleto10 = sc.nextInt();
		case 9:
			boleto9 = sc.nextInt();
		case 8:
			boleto8 = sc.nextInt();
		case 7:
			boleto7 = sc.nextInt();
		case 6:
			boleto6 = sc.nextInt();
		case 5:
			boleto5 = sc.nextInt();
		case 4:
			boleto4 = sc.nextInt();
		case 3:
			boleto3 = sc.nextInt();
		case 2:
			boleto2 = sc.nextInt();
		case 1:
			boleto1 = sc.nextInt();
			break;
			
		//Si la cantidad de boletos deseadas no es entre el 1 y el 10 se compra 1 por defecto.
		default:
			System.out.println("Al no haber introducido un número entre el 1 y el 10, se accederá a la compra de 1 boleto.");
			boleto1 = sc.nextInt();
			break;
		}
		
	}
	
	//Muestra el valor del boleto comprado y el orden de compra.
	public static void muestracompra (int numBoleto) {
		
		switch(numBoleto) {
		case 10:
			System.out.println("Has elegido número " + boleto10 + " en el boleto número 10.");
		case 9:
			System.out.println("Has elegido número " + boleto9 + " en el boleto número 9.");
		case 8:
			System.out.println("Has elegido número " + boleto8 + " en el boleto número 8.");
		case 7:
			System.out.println("Has elegido número " + boleto7 + " en el boleto número 7.");
		case 6:
			System.out.println("Has elegido número " + boleto6 + " en el boleto número 6.");
		case 5:
			System.out.println("Has elegido número " + boleto5 + " en el boleto número 5.");
		case 4:
			System.out.println("Has elegido número " + boleto4 + " en el boleto número 4.");
		case 3:
			System.out.println("Has elegido número " + boleto3 + " en el boleto número 3.");
		case 2:
			System.out.println("Has elegido número " + boleto2 + " en el boleto número 2.");
		case 1:
			System.out.println("Has elegido número " + boleto1 + " en el boleto número 1.");
			break;
		default:
			System.out.println("Has elegido número " + boleto1 + " en el boleto número 1.");
			break;
		}
	}
	// Mostramos el sorteo realizado.
	public static void mostrarSorteo() { 										// Imprime en consola los 3 números ganadores.
		
		System.out.println(">>> Los siguientes números son los ganadores: ");
		System.out.println("1º Número: " + premiado1);							// Premio 1
		System.out.println("2º Número: " + premiado2); 							// Premio 2
		System.out.println("3º Número: " + premiado3); 							// Premio 3
		
	}

	//Guarda los premios que se han generado en cada posición.
	public static void guardarPremio(int premios, int numPremios) {
		
		switch (premios) {
		
		case 1:
			premiado1 = numPremios;
			break;
			
		case 2:
			premiado2 = numPremios;
			break;
			
		case 3:
			premiado3 = numPremios;
			break;
			
		}
	}
	
	//Método para cambiar el valor de respuesta.
	public static String respuesta () {
		
		String respuesta;
        System.out.println("¿Desea realizar otro sorteo? (Si/No)");
        respuesta = sc.next();
        return respuesta;
	}

	// Comparamos los número premiados con los numeros de los boletos
	public static void compruebaPremios(int boleto1, int boleto2, int boleto3, int boleto4, int boleto5,
			int boleto6, int boleto7, int boleto8, int boleto9, int boleto10, int premiado1,
			int premiado2, int premiado3, int numBoleto) {

		int premiado = 0;
		
		//Mostrará en que bolteo hemos ganado un premio en concreto.
		switch(numBoleto) {
		case 10:
			if (boleto10 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto10);
				premiado++;
				
			}
			
			if (boleto10 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto10);
				premiado++;
				
			}
			
			if (boleto10 == premiado3) {
				
				System.out.println("Has ganado el tercero premio con el número: " + boleto10);
				premiado++;
				
			}
		case 9:
			if (boleto9 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto9);
				premiado++;
				
			}
			
			if (boleto9 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto9);
				premiado++;
				
			}
			
			if (boleto9 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto9);
				premiado++;
				
			}
		case 8:
			if (boleto8 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto8);
				premiado++;
				
			}
			
			if (boleto8 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto8);
				premiado++;
				
			}
			
			if (boleto8 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto8);
				premiado++;
				
			}
		case 7:
			if (boleto7 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto7);
				premiado++;
				
			}
			
			if (boleto7 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto7);
				premiado++;
				
			}
			
			if (boleto7 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto7);
				premiado++;
				
			}
		case 6:
			if (boleto6 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto6);
				premiado++;
				
			}
			
			if (boleto6 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto6);
				premiado++;
				
			}
			
			if (boleto6 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto6);
				premiado++;
				
			}
		case 5:
			if (boleto5 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto5);
				premiado++;
				
			}
			
			if (boleto5 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto5);
				premiado++;
				
			}
			
			if (boleto5 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto5);
				premiado++;
				
			}
		case 4:
			
			if (boleto4 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto4);
				premiado++;
				
			}
			
			if (boleto4 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto4);
				premiado++;
				
			}
			
			if (boleto4 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto4);
				premiado++;
				
			}
		case 3:
			if (boleto3 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto3);
				premiado++;
				
			}
			
			if (boleto3 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto3);
				premiado++;
				
			}
			
			if (boleto3 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto3);
				premiado++;
				
			}
		case 2:

			if (boleto2 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto2);
				premiado++;
				
			}
			
			if (boleto2 == premiado2) {
				
				System.out.println("Has ganado el segundo premio con el número: " + boleto2);
				premiado++;
				
			}
			
			if (boleto2 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto2);
				premiado++;
				
			}
		case 1:
			if (boleto1 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto1);
				premiado++;
				
			}
			
			if (boleto1 == premiado2) {
				System.out.println("Has ganado el segundo premio con el número: " + boleto1);
				premiado++;
				
			}
			
			if (boleto1 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto1);
				premiado++;
				
			}
			break;
		default:
			if (boleto1 == premiado1) {
				
				System.out.println("Has ganado el primer premio con el número: " + boleto1);
				premiado++;
				
			}
			
			if (boleto1 == premiado2) {
				System.out.println("Has ganado el segundo premio con el número: " + boleto1);
				premiado++;
				
			}
			
			if (boleto1 == premiado3) {
				
				System.out.println("Has ganado el tercer premio con el número: " + boleto1);
				premiado++;
				
			}
			break;
		}
		
		//Muestra el número de premios si lo hemos obtenido.
		if (premiado == 0) {
			
			System.out.println("Lo sentimos, pero no ha obtenido ningún premio.");
			
		}
		
		if (premiado == 1) {
			
			System.out.println("¡Bien! Ha obtenido 1 premio de 3.");
			
		}
		
		if (premiado == 2) {
			
			System.out.println("¡Genial! Ha obtenido 2 premios de 3.");
			
		}
		
		if (premiado == 3) {
			
			System.out.println("¡Wow! Ha obtenido 3 premios de 3, ¡enhorabuena!");
			
		}
		
	}

}