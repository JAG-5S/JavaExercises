/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que calcula el perimetro y el area de un rectangulo
 * Fecha: 24/11/25
 */

package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double alto, ancho, perimetro, area;
		System.out.print("Ingresa el alto del rectangulo: ");
		alto = teclado.nextDouble();
		System.out.print("Ingresa el ancho del rectangulo: ");
		ancho = teclado.nextDouble();
		
		perimetro = perimetroRectangulo(ancho, alto);
		area = areaRectangulo(ancho, alto);
		
		System.out.println("El perimetro es:  " + perimetro);
		System.out.println("El area es: " + area);

	}
	
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro = (ancho*ancho)+(alto*alto);
		return perimetro;
	}
	
	public static double areaRectangulo(double ancho, double alto) {
		double area = ancho*alto;
		return area;
	}
	
	

}
