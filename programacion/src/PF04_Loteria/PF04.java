package PF04_Loteria;

/*Requisitos:
- La entrada al programa est� protegida por un c�digo PIN. Se recoje mediante el m�todo JOptionPane con ***
- El programa se bloquea durante 30 segundos cuando el c�digo PIN se introduce mal 3 veces.
- El Sorteo de loter�a es escogiendo 3 N�meros al azar entre 1 y 20.
- El usuario puede comprar hasta 10 Boletos.
- El usuario puede jugar tantos sorteos como quiera.
*/



//import java.util.Timer;
//import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PF04 {

	public static void main(String[] args) {

		int fallos = 3; 		// este es el contador de errores de pin
		String password = ""; 	// el password es 1234

		do {//comienzo del programa en el que nos pide el pin correcto
			JPasswordField pf = new JPasswordField();
			int okCxl = JOptionPane.showConfirmDialog(null, pf, "INSERTE EL PIN CORRECTO", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE);
			if (okCxl == JOptionPane.OK_OPTION);			
			password = new String(pf.getPassword());
			
			
			if (password.equals("1234")) {	//si se introduce bien el pin
											//nos muestra que hemos accedido
				JOptionPane.showConfirmDialog(null, "Pin correcto Acceso permitido");
				break;

			} else {// entrada de pin incorrectos
				System.out.println("Contrase�a incorreta, int�ntelo de nuevo");
				fallos--;					//contador de fallos
				JOptionPane.showConfirmDialog(null, "Pin incorrecto, tienes " + fallos + " intentos.");

				if (fallos == 0) {// entrada de tres pines incorrectos
					JOptionPane.showConfirmDialog(null,
							"Acceso restringido, debes esperar para volver a escribir el pin");
					
				}

			}
		} while (fallos != 0);

	}

}