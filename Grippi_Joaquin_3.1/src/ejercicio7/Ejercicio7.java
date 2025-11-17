/*
 * Autor: Joaquin Grippi
 * Descripcion:Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.
 * fecha: 13/11/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
       
        System.out.print("Introduce el valor de P: ");
        int p = teclado.nextInt();

        System.out.print("Introduce el valor de Q: ");
        int q = teclado.nextInt();
		
        int[] rango = new int[q - p + 1];
        for (int i = 0; i < rango.length; i++) {
            rango[i] = p + i;
        }

        System.out.print("Array generado: ");
        for (int num : rango) {
            System.out.print(num + " ");
        }

	}

}
