
package UD04_R1;

import java.util.Scanner;

/**
 * @author angel
 *
 *         Crear una clase fecha con los siguientes atributos: 
 *        	 a) ​int dia,mes,año: Todos ellos privados. 
 *         	Los métodos públicos: 
 *        	 b) ​ModificarFecha 
 *        	 c) ​ModificarDia, ModificarMes, ModificarAño 
 *         	d) ​DevoverDia,DevolverMes,DevolverAño 
 *         	e) ​toString 
 *         	Un metodo privado, que se llama al modificar: 
 *         	f)ComprobarFecha: Que hace una comprobación simple: 
 *         		1<dia<31 ; 1<mes<12: Si la fecha no es correcta
 *         		se da un error y no se cambia la fecha
 */
public class ejer_2 {
	static Scanner cs = new Scanner(System.in);
	public static void main(String[] args) {
		
		int day, month, year;
		int temperaMaxima, temperaMinima;
		
		System.out.println("Introduce una fecha: ");
		System.out.println("Que dia es: ");
		day = cs.nextInt();
		System.out.println("Que mes es: ");
		month = cs.nextInt();
		System.out.println("Que año es: ");
		year = cs.nextInt();
					
		ejer_2 fecha = new ejer_2(day,month,year);
		
		if(fecha.comprobarFecha()) {    //si la fecha es correcta la mostramos utilizando el metodo toString()
			System.out.println("La fecha introducida es: " + fecha);
			System.out.println();
		}else {
			System.out.println("Los parametros introducidos no son correctos");
		}
		
		
		System.out.println("Introduce la Temperatura Máxima y Mínima");
		System.out.println("****************************************");
		System.out.println("Introduce la Temperatura Máxima: ");
		temperaMaxima = cs.nextInt();
		System.out.println("Introduce la Temperatura Mínima: ");
		temperaMinima = cs.nextInt();
		
		System.out.println("Has escrito " + temperaMaxima + " como Máxima");
		System.out.println();
		System.out.println("Has escrito " + temperaMinima + " como Mínima");
		
		Temperatura tem = new Temperatura(temperaMaxima, temperaMinima);
		System.out.println(tem.toString());
		
	}	
	
	//metodos externos
	
	//atributos
	private int dia;
	private int mes;
	private int anio;

	//constructor de los parametros
	public ejer_2(int dia, int mes, int anio) {
		this.dia= dia;
		this.mes= mes;
		this.anio= anio;
	}
	
	//setters y getters. Devolver y modificar
	
	public void setDia(int day) {
		dia = day;
	}
	
	public void setMes(int month) {
		dia = month;
	}
	
	public void setAnio(int year) {
		anio = year;
	}
	
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	//metodo toString para mostrar la fecha
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(dia < 10) {
			sb.append("0");
		}
		sb.append(dia);
		sb.append("/");
		if(mes < 10) {
			sb.append("0");
		}
		sb.append(mes);
		sb.append("/");
		sb.append(anio);
		return sb.toString();
	}
	
	//metodo para comprobar que la fecha introducida es correcta
	public boolean comprobarFecha() {
		boolean diaCorrecto = dia >= 1 && dia <= 31;
		boolean mesCorrecto = mes >= 1 && mes <= 12;
		boolean anioCorrecto = anio > 0;
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}
	
	
	
}
