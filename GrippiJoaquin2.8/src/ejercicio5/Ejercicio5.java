package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        int positivos = 0, negativos = 0, ceros = 0;
        int sumaPositivos = 0, sumaNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int num = teclado.nextInt(); 

            if (num > 0) {
                sumaPositivos += num;
                positivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                negativos++;
            } else {
                ceros++;
            }
        }

        if (positivos > 0) {
            System.out.println("Media de positivos: " + (double)sumaPositivos / positivos);
        } else  {
            System.out.println("No se introdujeron números positivos.");
        }

        if (negativos > 0) {
            System.out.println("Media de negativos: " + (double)sumaNegativos / negativos);
        } else {
            System.out.println("No se introdujeron números negativos.");
        }

        System.out.println("Cantidad de ceros: " + ceros);
			
			
	
	}

}
