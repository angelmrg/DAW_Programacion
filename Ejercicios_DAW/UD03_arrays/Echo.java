package UD03_arrays;

public class Echo {
	public static void main(String[] args) {

		for(String cad : args) {
			cad = "hacker";
			System.out.println(cad);
		}
		
		for(String cad: args){
			System.out.println(cad);
		}
		
	}
	}