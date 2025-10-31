/*
 * Autor:Joaquin Grippi
 * Descripcion:Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 * Fecha:27/10/25
 */

package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 int numeros[] = new int[10];
		 int num ; 
		 for (int i = 0; i <= 9; i++) {
			 System.out.println(i + "_Escribe un numero");
			 num = teclado.nextInt();
			 numeros[i] = num;
			 	
		 }
		 int numMenor= numeros[5], numMayor = numeros[5];
		 for (int i = 0; i < numeros.length; i++) {
			
			 if (numeros[i] > numMayor) {
			 		numMayor = numeros[i];
			 	}else if (numMenor > numeros[i]) {
			 		numMenor = numeros[i];
			 	}
		 }
		 System.out.println("El numero mayor es " + numMayor + " y el numero menor es " + numMenor);

	}

}
