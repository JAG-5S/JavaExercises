/*
 * Autor: Joaquin Grippi
 * Descripcion: programa que suma y media arrays 
 * Fecha: 24/11/25
 */
package ejercicio15;
import java.util.Arrays;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		double num[] = new double[50];
		double suma, media;
		for (int i = 0; i < 50; i++) {
			int j = 50 + i;
			num[i] = j;
		}
		suma = sumaArray(num);
		media = mediaArray(num);
		System.out.print("La suma total es: " + suma + "\nLa media total es: " + media);
	}
	public static double sumaArray (double[] a) {
		double suma = Arrays.stream(a).sum();
		return suma;
	}
	public static double mediaArray (double[] a) {
		double media = Arrays.stream(a).average().orElse(-1);
		return media;
	}
}
