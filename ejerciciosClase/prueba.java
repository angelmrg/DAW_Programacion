package ejerciciosClase;

public class prueba {
public static void main(String[] args) {
	
	
	
	
}

public static int factorial(int num) {
	int res = 1;
	if (num>1) {
		res = num*factorial(num-1);
	}
	return res;
}
}
