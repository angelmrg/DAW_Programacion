package R3;
/*Utilizando la funci�n anterior, hacer un programa que escriba los primeros 8 factoriales, mostrando en pantalla lo siguiente: 
El factorial de 1 es 1 
El factorial de 2 es 2 
El factorial de 3 es 6 
El factorial de 4 es 24 
El factorial de 5 es 120 
El factorial de 6 es 720 
El factorial de 7 es 5040 
El factorial de 8 es 40320 
*/


public class ejer_02 {
	public static void main(String[] args) {
		System.out.println("Bien venido a este programa");										//presentacion del programa
		System.out.println("***************************");
		int i = 1;
				
		int resul = 1;
		while(i <=8) {
		resul = resul*i;
		i++;
		System.out.println("El factorial de " + i + " es " + resul);
		}
		
		/*
		 * for(int i=n; i>=0; i++){
		 * resul = resul*i;
		 */
		
		/*
		 * SOLUCION RECURSIVA
		 * public static int fact(int n){
		 * int res=1;
		 * if(n>1)
		 * res = n* fact(n-1);
		 * return res;
		 */
		
		
		
	}
	}
