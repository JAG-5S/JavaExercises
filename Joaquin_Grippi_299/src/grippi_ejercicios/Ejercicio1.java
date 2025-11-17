package grippi_ejercicios;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n,m, k=0, mult1, mult2 = 0, mult3 = 0;
		
		
		// Introducimos los valores
		do {
		System.out.print("Asigna un valor para valor N: ");
		n = teclado.nextInt();
		System.out.print("Asigna un valor para valor M: ");
		m = teclado.nextInt();
			if (n < m) {
				k++;
			}else {
				System.out.println("El valor de n debe ser menor al de M");
			}
		}while(k == 1);
		
		
		// Mostramos los numeros comunes
		System.out.print("Los multiplos de 3 y 5 comunes entre " + n + " y " + m + " son ");
		for (int i = n; i <= m; i++ ) {
			mult1 = i;
				if(mult1 % 3 == 0 && mult1 % 5 == 0) {
					System.out.print(mult1 + " ");
				}
		}
		
	
		
		
	}

}
