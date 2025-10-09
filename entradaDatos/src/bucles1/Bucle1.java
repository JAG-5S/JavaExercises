package bucles1;

import java.util.Scanner;

public class Bucle1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeros = 1; 
		int num, suma = 0;
		System.out.print("Entrega un numero: ");
		num = teclado.nextInt();
		
		while (num != 0 && numeros <= 8 ) {
			System.out.println("Dame un numero");
			num = teclado.nextInt();
			numeros = numeros + 1  ;
			suma = suma + num;
		}
		System.out.println("La sume es: " + suma);
	}

}
