/*
 * Autor:Joaquin Grippi
 * Descripcion:Hacer un juego de adivinar numeros aleatorios con bucles
 * Fecha:20/10/25
 */
package ejercicio7;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 Random aleatorio = new Random();

	        int numeroSecreto = aleatorio.nextInt(51); // Número entre 0 y 50
	        int intento;

	        System.out.println("Juego de adivinar el numero");
	        System.out.println("adivina el numero entre 0 y 50...");

	        do {
	            System.out.print("Introduce tu intento: ");
	            intento = teclado.nextInt();

	            if (intento < numeroSecreto) {
	                System.out.println("Mayor");
	            } else if (intento > numeroSecreto) {
	                System.out.println("Menor");
	            } else {
	                System.out.println("¡Correcto! Has adivinado el numero.");
	            }
	        } while (intento != numeroSecreto);
	}

}
