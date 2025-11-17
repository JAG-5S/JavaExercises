/*
 * Autor: Joaquin Adrian Grippi
 * Descripcion:programa donde se debe mostrar un array y su orden inverso
 * Fecha: 13/11/25
 */


package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int primerArray[] = new int[100];
		int segundoArray[] = new int[100];
		
        for (int i = 0; i < primerArray.length; i++) {
            primerArray[i] = i + 1;
        }

        for (int i = 0; i < segundoArray.length; i++) {
            segundoArray[i] = primerArray[primerArray.length - 1 - i];
        }

        System.out.println("Primer Array:");
        for (int i = 0; i < primerArray.length; i++) {
            System.out.print(primerArray[i] + " ");
        }

        System.out.println("\n\nSegundo Array (inverso):");
        for (int i = 0; i < segundoArray.length; i++) {
            System.out.print(segundoArray[i] + " ");
        }
		
	}

}
