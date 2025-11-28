package tratarExepciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TratamientoExecpciones {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Dame un entero");
			int entero;
			boolean error = false;
			do {
				try {		
					teclado.close();
					error = false;
					entero = teclado.nextInt();
				} catch (InputMismatchException exTipoDiferente){
					System.out.println("Te has equivocado. Dame un entero");
					error = true;
					teclado.nextLine();
					entero = 0;
				} catch (Exception ex1) {
					error = true;
					teclado.nextLine();
					System.out.println("No se puede accder a la consola");
					entero = 0;
				}
			}while (error == true);
			
			System.out.print("El numero es: " + entero);
			
		}
}
