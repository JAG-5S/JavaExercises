/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion: Secuencia de numeros hasta el 10.
 * Fecha: 13/11/25
 */

package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		int totalElementos = 0;
		
        for (int i = 1; i <= 10; i++) {
            totalElementos += i;
        }
      
        int[] secuencia = new int[totalElementos];
        int index = 0;
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                secuencia[index] = i;
                index++;
            }
        }
        System.out.println("Secuencia generada:");
        for (int num : secuencia) {
            System.out.print(num + " ");
        
        }       
	}

}
