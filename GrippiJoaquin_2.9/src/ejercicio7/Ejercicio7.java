package ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, contador = 1;
		int numNegativo = 0, numPositivo = 0;
		
		do {
			System.out.print(contador + "_Introduce un numero: ");
			num = teclado.nextInt();
			if (num == 0) {
			System.out.println("Numero no valido introduce otro");
			}else if (num < 0) {
			numNegativo++;	
			contador++;
			} else {
				numPositivo++;
				contador++;
				}
			
			
		}while(contador != 101);
		
		System.out.println("Hubo un total de " + numPositivo + " Numeros Positivos" + " y un total de " + numNegativo + " Numeros Negativos");

	}

}
