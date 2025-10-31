/*
 * Autor:Joaquin Grippi
 * Descripcion:Escribe un programa Java que lea 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.
 * Fecha: 24/10/25
 */
package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, contador = 1;
		int numNegativo = 0;
		
		do {
			System.out.print(contador + "_Introduce un numero: ");
			num = teclado.nextInt();
			if (num == 0) {
			System.out.println("Numero no valido introduce otro");
			}else if (num < 0) {
			numNegativo++;	
			contador++;
			} else {contador++;}
			
			
		}while(contador != 101);
		
		if (numNegativo > 0) {
			System.out.print("Si hubo un numero negativo");
		}
		
	}

}
