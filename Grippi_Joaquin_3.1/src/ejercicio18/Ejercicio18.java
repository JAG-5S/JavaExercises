/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: array de tamaño 30 con valores alaeatorios entre 0 y 9, posteriormente ordenarlos
 * Fecha: 13/11/25
 */
package ejercicio18;
import java.util.Arrays;

public class Ejercicio18 {

		public class ArrayAleatorioOrdenado {
		    public static void main(String[] args) {
		        int[] array = new int[30];

		        // Rellenar el array con valores aleatorios entre 0 y 9
		        for (int i = 0; i < array.length; i++) {
		            array[i] = (int)(Math.random() * 10);
		        }

		        // Mostrar el array antes de ordenar
		        System.out.println("Array original:");
		        System.out.println(Arrays.toString(array));

		        // Ordenar el array
		        Arrays.sort(array);

		        // Mostrar el array ordenado
		        System.out.println("Array ordenado:");
		        System.out.println(Arrays.toString(array));
		    

		    }

		}
}