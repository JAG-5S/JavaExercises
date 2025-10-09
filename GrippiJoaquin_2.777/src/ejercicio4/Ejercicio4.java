/*
 * autor: Joaquin Grippi
 * Descripcion:Pedir una serie de Datos y calcular una media con redondeo hacia abajo y hacia arriba y finalmente si la media supera el 8 se mostrara un mensaje de acceso a educacion superior
 * Fecha:09/10/2025
 * 
 */



package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double nota1 ;
		double nota2 ;
		double nota3 ;
		double nota4 ;
		
		System.out.print("Dame la nota 1: ");
		nota1 = teclado.nextInt();
		System.out.print("Dame la nota 2: ");
		nota2 = teclado.nextInt();
		System.out.print("Dame la nota 3: ");
		nota3 = teclado.nextInt();
		System.out.print("Dame la nota 4: ");
		nota4 = teclado.nextInt();
		
		double notaMedia = ((nota1 + nota2 + nota3 + nota4 )/4);
		
		System.out.println("Tu nota media es: " + notaMedia);
		double notaMediaFloor = Math.floor(notaMedia);
		System.out.println("Tu nota media redondeadad hacia abajo: " + notaMediaFloor);
		double notaMediaCeil = Math.ceil(notaMedia);
		System.out.println("Tu nota media redondeada hacia arriba: " + notaMediaCeil);
		
		if (notaMedia > 8) {
			System.out.print("Puedes acceder a formacion superior");
		}
		
		else {
			System.out.print("nota media insuficiente");
		}
	}

}
