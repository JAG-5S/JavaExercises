/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Secuencia de numeros hasta 10 pero usando fill.
 * Fecha: 13/11/25
 */

package ejercicio16;
import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		int totalElementos = 0;
		
        for (int i = 1; i <= 10; i++) {
            totalElementos += i;
        }
      
        int[] secuencia = new int[totalElementos];
        int index = 0;
        
        for (int i = 1; i <= 10; i++) {
            	Arrays.fill(secuencia, index, index + i, i);
                index += i;
        }
        System.out.println("Secuencia generada:");
        for (int num : secuencia) {
            System.out.print(num + " ");
        
        }     
       
	}

}
