/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.
 * Fecha: 27/10/25
 */

package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 int numeros[] = new int[10];
		 int num;
		 for (int i = 0; i <= 9; i++) {
			 System.out.println(i + "_Escribe un numero");
			 num = teclado.nextInt();
			 numeros[i] = num;
		 }
		 System.out.println("Los numeros introducidos son: ");
		 for (int i = 0; i <= 9; i++) {
			 System.out.println("El nuemero(" + (i+1) + ") es: " + numeros[i]);
		 }
	}

}
