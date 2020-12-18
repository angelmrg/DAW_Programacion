package UD02;
/*Crea un programa que lea dos fechas con hora por teclado y muestre la diferencia
 *  en minutos, horas, días, meses y años entre las mismas.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class E02_2 {
	public static void main(String[] args) {
		//asignamos la entrada estandar de tecladoco la variable de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos al usuario la primera fecha con su formáto
		System.out.println("Introduce la primera fecha en formato dd/mm/yyyy: ");
		//Leemos la primera fecha y la guardamos en la Cadena fecha1
		String fecha1 = sc.next();
		
		//convertimos el texto String de la fecha en un objeto
		//de la clase LocalDateTime para que lo podamos manipular
		LocalDateTime date1 = LocalDateTime.parse(fecha1 + " 00:00",DateTimeFormatter.ofPattern("dd/MM/yyyy H:m"));
				
		//Solicitamos al usuario la segunda fecha con su formáto
		System.out.println("Introduce la segunda fecha en formato dd/mm/yyyy: ");
		//Leemos la primera fecha y la guardamos en la Cadena fecha2
		String fecha2 = sc.next();
		
		//convertimos el texto String de la fecha en un objeto
		//de la clase LocalDateTime para que lo podamos manipular
		LocalDateTime date2 = LocalDateTime.parse(fecha2 + " 00:00",DateTimeFormatter.ofPattern("dd/MM/yyyy H:m"));
		
		
		//con los metodos de la clase ChronoUnit mostramos los datos que necesitamos y que nos ha pedido el ejercicio.
		//utilizamos el metodo between para que reciba las dos fechas (objetos que hemos transformados antes).
		System.out.println("La primera fecha elegida es " + date1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy H:m")));
		System.out.println("La segunda fecha elegida es " + date2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy H:m")));
		System.out.println("*******************************************************");
		
		System.out.println("Horas transcurridas entre las dos fechas: " + ChronoUnit.HOURS.between(date1, date2) + " horas.");
		System.out.println("Minutos transcurridos entre las dos fechas: " + ChronoUnit.MINUTES.between(date1, date2) + " minutos.");
		System.out.println("Segundos transcurridos entre las dos feches: " + ChronoUnit.SECONDS.between(date1, date2) + " segundos.");
		System.out.println("Días transcurridos entre las dos fechas : " + ChronoUnit.DAYS.between(date1, date2) + " días.");
		System.out.println("Meses transcurridos entr las dos fechas: " + ChronoUnit.MONTHS.between(date1, date2) + " meses.");
		System.out.println("Años transcurridos entre las dos fechas: " + ChronoUnit.YEARS.between(date1, date2) + " años.");
		
	sc.close();
	}
}
