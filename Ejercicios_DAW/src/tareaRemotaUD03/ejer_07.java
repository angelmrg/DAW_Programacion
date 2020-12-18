package tareaRemotaUD03;

/*7.	Crea una función en java que reciba como parámetro un número entero y devuelva el como resultado su factorial.*/
import java.util.Scanner;

public class ejer_07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número para obtener su factorial: ");		//pedimos por teclado los datos
		int num = sc.nextInt();														//leemos los datos introducidos

		int resul = 1;																//variables definidas y con valors 1 y 2
		int con = 2;																//para que al ir sumandole al contador "con"				
																					//valla aumentando hasta llegar a num.
		while (con <= num) {
			resul = resul * con;
			con++;
		}

		System.out.println("El factorial de " + num + " es " + resul);

		sc.close();
	}
}
