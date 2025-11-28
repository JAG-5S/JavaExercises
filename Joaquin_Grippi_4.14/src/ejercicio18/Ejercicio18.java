/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que nos da la letra asociada a un DNI
 * Fecha: 24/11/25
 */
package ejercicio18;
import java.util.Scanner;
public class Ejercicio18 {
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu número de DNI (sin letra): ");
        int dni = teclado.nextInt();

        char letra = obtenerLetraNIF(dni);

        System.out.println("El NIF completo es: " + dni + letra);
    }
    
 // Función que devuelve la letra asociada al DNI
    public static char obtenerLetraNIF(int dni) {
        char[] letras = {
            'T','R','W','A','G','M','Y','F','P','D',
            'X','B','N','J','Z','S','Q','V','H','L',
            'C','K','E'
        };

        int resto = dni % 23; 
        return letras[resto]; 
    }
}
