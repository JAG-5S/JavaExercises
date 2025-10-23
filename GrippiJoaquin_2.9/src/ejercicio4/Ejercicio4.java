package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Introduce un numero: ");
		num = teclado.nextInt();
		
		for (int i = 0;i <= num; i++) {
			System.out.println(i);
		}

	}

}
