package bucles6;

import java.util.Scanner;
public class Bucles6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numI, numF, numMultiplo ;
		
		
		System.out.print("Escribe un numero: ");
		numI = teclado.nextInt();
		

		System.out.print("Escribe un numero: ");
		numF = teclado.nextInt();
		
		System.out.print("Escribe un numero: ");
		numMultiplo = teclado.nextInt();
		
		System.out.println("Los multiplos entre " + numI + " y " + numF + " son:");
		
		for (int i = numI; i <= numF; i++) {
			
			if (i % numMultiplo == 0) {
				System.out.println(i);
			}
			
		}
	
	}

}
