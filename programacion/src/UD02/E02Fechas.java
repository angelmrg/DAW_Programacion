package UD02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class E02Fechas {
	
	//Creando la variable para la clase Scanner fuera con la palabra static
	//Conseguimos que est� disponible para todos los m�todos est�ticos
	static Scanner teclado;

	public static void main(String[] args) {
		
		//Asignamos la Entrada est�ndar de teclado a nuestra variable teclado de Scanner
		 Scanner teclado = new Scanner(System.in);
		
		//Solicitamos al usuario una fecha con un formato espec�fico
		System.out.println("Introduce una fecha en formato dd/mm/yyyy");
		//Leemos la fecha y la guardamos como cadena
		String fechaIntroducida = teclado.next();
		
		//Convertimos el texto de fecha a un Objeto para manipular Fechas y horas.
		//La clase para hacer esto es LocalDateTime del paquete java.time
		LocalDateTime fecha = LocalDateTime.parse(fechaIntroducida + " 00:00",DateTimeFormatter.ofPattern("dd/MM/yyyy H:m"));
		
		//Comprobamos que la fecha se ha creado bien imprimi�ndola en formato de fecha conocido
		System.out.println("La fecha es " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy H:m")));
		
		//Los siguientes m�todos nos muestran el tiempo transcurrido desde la fecha introducida hasta la actualidad
		//haciendo uso de diferentes unidades de tiempo. Se Calcula con ayuda de la Clase ChronoUnit de java.util
		//Puedes observar que el m�todo between recibe dos Objetos del tipo LocalDateTime
		//La fecha introducida y la fecha de hoy
		//Modifica el c�digo para completar las l�neas que dan fallos.
		System.out.println("Milisegundos transcurridos: " + ChronoUnit.MILLIS.between(fecha,LocalDateTime.now()));
		System.out.println("Segundos transcurridos: " + ChronoUnit.SECONDS.between(fecha,LocalDateTime.now()));
		System.out.println("Minutos transcurridos: " + ChronoUnit.MINUTES.between(fecha, LocalDateTime.now()));
		System.out.println("Horas transcurridas: " + ChronoUnit.HOURS.between(fecha,LocalDateTime.now()));
		System.out.println("Dias transcurridos: " + ChronoUnit.DAYS.between(fecha,LocalDateTime.now()));
		System.out.println("Semanas transcurridas: " + ChronoUnit.WEEKS.between(fecha,LocalDateTime.now()));
		System.out.println("A�os transcurridos: " + ChronoUnit.YEARS.between(fecha, LocalDateTime.now()));
								
		teclado.close();

	}
}
