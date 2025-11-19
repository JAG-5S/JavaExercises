package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, elNum;
		System.out.print("Introduzca un numero: ");
		num = teclado.nextInt();
		elNum = dimeSigno(num);
		
		if (elNum < 0) {
			System.out.println("El numero es negativo");
		}else if (elNum == 0) {
			System.out.println("El numero es cero");
		}else {
			System.out.println("El numero es positivo");
		}
		
	
	}
	public static int dimeSigno(int a) {
		
		
		if (a < 0) {
			a = -1;
		}else if (a == 0) {
			a = 0;
		}else {
			a = 1;
		}
		return a;
	} 
	
}
