/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que comprueba si los numeros colocados cumplen con la ecuacion de pitagoras 
 * Fecha: 24/11/25
 */
package ejercicio19;
import java.util.Scanner;
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el valor de x: ");
        int x = teclado.nextInt();

        System.out.print("Introduce el valor de y: ");
        int y = teclado.nextInt();

        System.out.print("Introduce el valor de z: ");
        int z = teclado.nextInt();

        // Comprobar si cumplen la ecuación
        if (cumplePitagoras(x, y, z)) {
            System.out.println("La terna (" + x + ", " + y + ", " + z + ") cumple la ecuación de Pitágoras.");
        } else {
            System.out.println("La terna (" + x + ", " + y + ", " + z + ") NO cumple la ecuación de Pitágoras.");
        }

    }
    
 // Función que comprueba si se cumple la ecuación de Pitágoras
    public static boolean cumplePitagoras(int x, int y, int z) {
        return (x * x + y * y) == (z * z);
    }


}
