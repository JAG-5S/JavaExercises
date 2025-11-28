/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que calcula el porcentaje de descuento. 
 * Fecha: 24/11/25
 */
package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double sinDescuento, conDescuento, porcentaje;
		
		System.out.print("Introduce el precio sin descuento: ");
		sinDescuento = teclado.nextDouble();
		System.out.print("Introduce el precio con descuento: ");
		conDescuento = teclado.nextDouble();
		
		
		while(sinDescuento <= conDescuento){
			System.out.println("No se puede Introducir un precio sin descuento inferior al que tiene descuento." + "\nVuelve a introducir el precio: ");
			System.out.print("Introduce el precio sin descuento: ");
			sinDescuento = teclado.nextDouble();
			System.out.print("Introduce el precio con descuento: ");
			conDescuento = teclado.nextDouble();
		}
		//-
		porcentaje = descuentoPorcentual(sinDescuento, conDescuento);
		System.out.println("El descuento es del: " + porcentaje + "%");

	}

	//Calculador de porcentaje de Descuento
	public static double descuentoPorcentual(double precio, double descuento) {
		double elDescuentoEs = ((precio - descuento)/precio)*100;
		return elDescuentoEs;
	}
	
}
