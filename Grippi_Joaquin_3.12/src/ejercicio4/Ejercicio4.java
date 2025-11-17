/*
 * Autor: Joaquin Grippi
 * descripcion: programa que calcula la media de una serie de alumnos
 * Fecha: 13/11/25
 */
package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [][] notas = new int[4][5];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Notas del alumno " + i +" ");
			for (int j = 0; j < 5; j++) {
				System.out.print("Introduce un valor: ");
				notas[i][j] = teclado.nextInt();
			}
		}
		
	
		for(int i = 0; i< notas.length; i++) {
			int media=0,mediaTotal=0;
			int notaMax=0, notaMin=5;
			System.out.println("El alumno numero " + i + " tiene las siguentes calificaciones: ");
			for (int j = 0; j< 5; j++) {
				media +=notas[i][j];
				mediaTotal= media / 5;
				if (notas[i][j] > notaMax) {
					notaMax = notas [i][j];
				}else if(notas[i][j] < notaMin) {
					notaMin=notas[i][j];
				}
			}
			System.out.println("Una media de: " + mediaTotal+"\nUna nota Maxima de: " +notaMax+"\nUna nota minima de: " +notaMin);
		}
		
		System.out.print("");
		
	}
}