package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeros[] = new int[20];
		int num, numSuma = 0;
		
		 for (int i = 0; i <= 19; i++) {
			 System.out.println(i + "_Escribe un numero");
			 num = teclado.nextInt();
			 numeros[i] = num;
			 	
		 }
		 
		 for (int i = 0; i < numeros.length; i++) {
			numSuma += numeros[i];
		 }
		 System.out.println("La suma de todos los numeros es: " + numSuma);

	}

}
