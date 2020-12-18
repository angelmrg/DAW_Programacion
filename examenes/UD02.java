package examenes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//Imprime un men� de opciones a seleccionar
//Opciones:
//�1. Calcular la longitud de una circunferencia�
//�2. Lanzar un dado de 8 caras.�Lanzar un dado de 8 caras
//�3. Mostrar el tiempo transcurrido entre dos fechas.�
//�4. Salir.�
//La opci�n introducida llamar� al m�todo independiente correspondiente para ejecutar la funci�n escogida, discriminando con una estructura switch.
//Si la opci�n escogida no es ninguna entre la 1 y la 4 se vuelve a mostrar el men� de opciones y preguntar.
//El m�todo Salir termina el programa.
//M�todo calcular longitud circunferencia
//Con ayuda de la clase Math deber� realizar el c�lculo de la longitud del per�metro de una circunferencia. per�metro = 2 * PI * radio.
//El usuario deber� introducir el di�metro de la circunferencia. radio = di�metro / 2.
//M�todo lanzar dado de 8 caras.
//El usuario introduce el n�mero de veces para lanzar el dado
//El programa lanza N veces el dado de 8 caras y muestra los valores que han salido en cada lanzamiento.
//M�todo Mostrar el tiempo transcurrido entre dos fechas.
//El usuario introduce dos fechas por teclado.
//El programa indica la diferencia que existe en horas entre ambas fechas.

import java.util.Scanner;

public class UD02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String res;
		System.out.println("Esto es un Examen");
		System.out.println("***********************");
		System.out.println("�Quieres iniciar el programa?");
		res = sc.next();

		while (res.equals("si")) {
			System.out.println("Elige una opcion: " + "\n1: Calcular la longitud de una circunferencia "
					+ "\n2: Lanzar un dado de 8 caras " + "\n3: Mostrar el tiempo transcurrido entre dos fechas"
					+ "\n4: Salir.");

			int opcion = sc.nextInt();
			double pi = 2.14;

			switch (opcion) {

			case 1:// Calcular la longitud de una circunferencia (2*pi*r)
				longitudCircunferencia(pi);

				break;
			case 2:// Lanzar un dado de 8 caras
				System.out.println("En el dado ha salido un " + lanzarDado());
				break;
			case 3:// Mostrar el tiempo transcurrido entre dos fechas
				calcularFechas();
				break;
			case 4:// Salir

				break;
			}
			System.out.println("�Quieres seguir?");
			res = sc.next();
		}
		System.out.println("Nos vemos otro dia");

	}

	// metodos

	// metodo para pedir el radio de la circunferencia y nos da la longitud de esta
	public static void longitudCircunferencia(double pi) {
		System.out.println("Dime el radio de la circunferencia.");
		double r = sc.nextDouble();
		double resul = calculaLong(r, pi);
		System.out.println("La longitud de un circulo de " + r + " cm es de radio es " + resul + " cm.");
	}

	// petodo para encontrar la longitud de la circunferencia
	public static double calculaLong(double r, double pi) {
		double resul;
		resul = 2 * pi * r;
		return resul;
	}

	public static int lanzarDado() {

		return (int) (Math.random() * 8 + 1);

	}

	//metodo para introducir dos fechas y nos devuelve las horas transcurridas entre las dos fechas
	public static void calcularFechas() {
		String fecha1;
		String fecha2;
		LocalDateTime date1 = null;
		LocalDateTime date2 = null;

		// Solicitamos al usuario la primera fecha con su form�to
		System.out.println("Introduce la primera fecha en formato dd/mm/yyyy: ");
		// Leemos la primera fecha y la guardamos en la Cadena fecha1
		fecha1 = sc.next();

		// convertimos el texto String de la fecha en un objeto
		// de la clase LocalDateTime para que lo podamos manipular
		date1 = LocalDateTime.parse(fecha1 + " 00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy H:m"));

		// Solicitamos al usuario la segunda fecha con su form�to
		System.out.println("Introduce la segunda fecha en formato dd/mm/yyyy: ");
		// Leemos la primera fecha y la guardamos en la Cadena fecha2
		fecha2 = sc.next();

		// convertimos el texto String de la fecha en un objeto
		// de la clase LocalDateTime para que lo podamos manipular
		date2 = LocalDateTime.parse(fecha2 + " 00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy H:m"));

		System.out.println(
				"Horas transcurridas entre las dos fechas: " + ChronoUnit.HOURS.between(date1, date2) + " horas.");
	}

}
