package bucles2;
import java.util.Scanner;
public class Bucles2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numInicial;
		int numFinal;
		
		System.out.print("Introduce el numero inicial: ");
		numInicial = teclado.nextInt();
		System.out.print("Introduce el numero Final: ");
		numFinal = teclado.nextInt();
		
		
		if (numInicial < numFinal) {
			System.out.println("Secuencia del " + numInicial + " al " + numFinal);
			while (numInicial <= numFinal) {
				
				System.out.print(numInicial + " ");
				numInicial = numInicial + 1 ;
			}
			
			
		}
		
		else {
			System.out.println("Secuencia del " + numFinal + " al " + numInicial);
			while (numFinal <= numInicial) {
				
				System.out.print(numInicial + " ");
				numInicial = numInicial - 1 ;
			}
		}
	}

}
