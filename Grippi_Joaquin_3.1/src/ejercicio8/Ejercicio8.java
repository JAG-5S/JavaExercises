package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorR;
		double numeros[] = new double[102];
		
		for (int i = 0; i <= 100; i++) {
			numeros[i] = Math.random();
			System.out.println(numeros[i]);
		}
		System.out.println("Introduce el valor de R: ");
		valorR = teclado.nextDouble();
		
		for(int i = 0; i<=102; i++) {
			if (numeros[i] >= valorR) {
				System.out.println(numeros[i]);
			} else {
				System.out.println("Por debajo");
			}
		}
		

	}

}
