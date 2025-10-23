package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int sumaImpares = 0, sumaPares= 0;
		
		for (int i = 100;i < 200; i++) {
			 
			if (i % 2 == 0) {
	                sumaPares = sumaPares + i;
	            }else {
	            	sumaImpares = sumaImpares + i;
	            }
			
		}
		System.out.println("Los numeros pares suman: " + sumaPares + "\nLos numeros impares suman: " + sumaImpares);

	}

}
