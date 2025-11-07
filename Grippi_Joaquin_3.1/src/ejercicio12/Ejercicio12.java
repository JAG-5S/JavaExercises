package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valores[] = new int[10];
		char caracter;
		
		do {
			System.out.println("Elige una opcion: " + "\na.Mostrar valores. \nb.Introducir valor. \nc.Salir.");
			caracter = teclado.next().toLowerCase().charAt(0);
			
			
			if (caracter == 'a') {
                System.out.println("Valores del array:");
                for (int i = 0; i < valores.length; i++) {
                    System.out.println("Posición " + i + ": " + valores[i]);
                }
            } else if (caracter == 'b') {
                System.out.print("Introduce la posición (0-9): ");
                int posicion = teclado.nextInt();
                if (posicion >= 0 && posicion < valores.length) {
                    System.out.print("Introduce el valor: ");
                    int valor = teclado.nextInt();
                    valores[posicion] = valor;
                    System.out.println("Valor actualizado.");
                } else {
                    System.out.println("Posición inválida.");
                }
            } else if (caracter == 'c') {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida.");
            }
			
		}while (caracter != 'c');
		
		
		
	}

}
