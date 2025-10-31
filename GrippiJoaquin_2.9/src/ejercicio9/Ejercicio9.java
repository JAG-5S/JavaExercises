/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribe un programa Java que calcula y escribe la suma y el producto de los 10 primeros números naturales.
 * Fecha: 24/10/25
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int producto = 1, suma = 0;
		
		for (int i = 1; i <= 10; i++) {
			suma = suma + i;
			producto = producto * i;
		}
		
		System.out.println("La Suma de los primeros 10 numeros naturales es: " + suma + "\nEl producto de los primeros 10 numeros naturales es: " + producto);
	}

}
