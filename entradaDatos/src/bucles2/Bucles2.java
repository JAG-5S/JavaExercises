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
		do {
			if (numInicial <= numFinal) {
				System.out.println(numInicial);
				numInicial++;
			} else {
				System.out.println(numInicial);
				numInicial--;
			}
		
			
		}while (numInicial != numFinal );
		
		
		
		
		
		
		
	}
}


