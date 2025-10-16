package bucleDo;
import java.util.Scanner;
public class BucleDo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, sum = 0;
		int numIntro = 0;
		do {
			System.out.println("Dame un numero: (0 para Terminar)");
			num = teclado.nextInt();
			sum = sum + num;
				if (num != 0) {
					numIntro++; 
				}
		}while (num != 0);
		System.out.println("La suma es: " + sum + "\nSe introdujeron la siguente cantidad de numeros: " + numIntro);

	}

}
