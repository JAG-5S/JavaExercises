/*
 * Autor: Joaquin Grippi
 * descripcion: Programa que regsitra sueldos de hombres y mujeres y calcula is hay brecha salarial.
 * Fecha: 13/11/25
 */
package ejercicio5;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);

	      
	        System.out.print("Introduce el número de personas: ");
	        int N = teclado.nextInt();

	    
	        double[][] datos = new double[N][2];


	        double sumaHombres = 0;
	        double sumaMujeres = 0;
	        int contadorHombres = 0;
	        int contadorMujeres = 0;

	     
	        for (int i = 0; i < N; i++) {
	            System.out.println("Persona " + (i + 1) + ":");
	            System.out.print("Introduce género (0=varón, 1=mujer): ");
	            int genero = teclado.nextInt();
	            System.out.print("Introduce sueldo: ");
	            double sueldo = teclado.nextDouble();

	      
	            datos[i][0] = genero;
	            datos[i][1] = sueldo;

	         
	            if (genero == 0) {
	                sumaHombres += sueldo;
	                contadorHombres++;
	            } else if (genero == 1) {
	                sumaMujeres += sueldo;
	                contadorMujeres++;
	            } else {
	                System.out.println("⚠️ Género inválido, se ignora este registro.");
	            }
	        }

	  
	        double mediaHombres = (contadorHombres > 0) ? sumaHombres / contadorHombres : 0;
	        double mediaMujeres = (contadorMujeres > 0) ? sumaMujeres / contadorMujeres : 0;

	        
	        System.out.println("\n--- RESULTADOS ---");
	        System.out.println("Sueldo medio hombres: " + mediaHombres);
	        System.out.println("Sueldo medio mujeres: " + mediaMujeres);

	       
	        if (mediaHombres > mediaMujeres) {
	            System.out.println("Existe brecha salarial: los hombres ganan más de media.");
	        } else if (mediaMujeres > mediaHombres) {
	            System.out.println("Existe brecha salarial: las mujeres ganan más de media.");
	        } else {
	            System.out.println("No existe brecha salarial: ambos géneros ganan lo mismo de media.");
	        }

	}

}
