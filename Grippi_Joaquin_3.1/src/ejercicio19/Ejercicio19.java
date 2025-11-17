/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Ranking de puntuaciones
 * Fecha: 13/11/25
 */
package ejercicio19;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Integer[] puntuaciones = new Integer[8];

        System.out.println("Introduce las puntuaciones de los 8 jugadores:");

        // Leer las puntuaciones
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            puntuaciones[i] = scanner.nextInt();
        }

        // Ordenar en orden descendente
        Arrays.sort(puntuaciones, Collections.reverseOrder());

        // Mostrar el ranking
        System.out.println("\nRanking de puntuaciones (de mayor a menor):");
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("Puesto " + (i + 1) + ": " + puntuaciones[i]);
        }

	}

}
