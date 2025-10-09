/*
 * autor: Joaquin Grippi
 * Descripcion: Usar switch para obtener una calificacion
 * Fecha:09/10/2025
 * 
 */



package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int  nota ;
		System.out.print("Introduce una nota (0-10): ");
		nota = teclado.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Calificación: Insuficiente");
                break;
            case 5:
                System.out.println("Calificación: Suficiente");
                break;
            case 6:
                System.out.println("Calificación: Bien");
                break;
            case 7:
            case 8:
                System.out.println("Calificación: Notable");
                break;
            case 9:
            case 10:
                System.out.println("Calificación: Sobresaliente");
                break;
            default:
                System.out.println("La nota introducida es incorrecta.");
        }

	}

}
