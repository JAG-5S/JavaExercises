/*
 * Autor: Joaquin Grippi
 * Descripcion: Programa que nos da todas la s tablas de multiplicar del 1 al 10.
 * Fecha: 24/11/25
 */
package ejercicio20;

public class Ejercicio20 {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            imprimirTabla(i);
        }
    }  
	
	//Funcion para imprimir las tablas de multiplicar
	public static void imprimirTabla(int numero) {
	        System.out.println("Tabla del " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	        System.out.println();
	    }

	    
}
