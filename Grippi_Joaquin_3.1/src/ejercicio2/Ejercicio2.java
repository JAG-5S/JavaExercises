/*
 * Autor:Joaquin Grippi
 * Descripcion:Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores.
 * Fecha:27/10/25
 */

package ejercicio2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 int numeros[] = new int[10];
		 int num, suma = 0; 
		 for (int i = 0; i <= 9; i++) {
			 System.out.println(i + "_Escribe un numero");
			 num = teclado.nextInt();
			 numeros[i] = num;
		 }
		 for (int i = 0; i <= 9; i++) {
			 suma += numeros[i];
		 }
		 System.out.println("La Suma es: " + suma);
	}

}
