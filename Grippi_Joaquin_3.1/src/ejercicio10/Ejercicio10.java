/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Programa para realizar calculos relacionados a la altura.
 * Fecha: 13/11/25
 */



package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double alturaMetros, sumAltura = 0, altMax = 0, altMin = 5 ;
		double alturas[] = new double[10];
		int contadorMenor = 0, contadorMayor = 0;
		for (int i = 0 ; i < alturas.length; i++) {
			System.out.print("Introduce las alturas(" + i + "): ");
			alturaMetros = teclado.nextDouble();
			alturas[i] = alturaMetros;
			sumAltura += alturaMetros;
		}
		double mediaAltura = sumAltura / 10;
		
		for (int i = 0 ; i < alturas.length; i++) {
			
			if (alturas[i] < mediaAltura ) {
				contadorMenor++;
			}else {
				contadorMayor++;
			}
			if (alturas[i] > altMax) {
				altMax = alturas[i];
			}else if (alturas[i] < altMin ) {
				altMin = alturas[i];
			}
			
		}
		System.out.print("La altura media es: " + mediaAltura + "\nLa altura maxima es: " + altMax + "\nLa altura minima es: " + altMin + "\nPor debajo de la media hay " + contadorMenor + "\nPor encima de la media hay: " + contadorMayor);
		
		

	}

}
