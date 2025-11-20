package ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, sumatorio, producto;
		double intermedio;
		System.out.print("Introduce un numero: ");
		numero = teclado.nextInt();
		if (numero <= 1) {
			while (numero < 1) {
				System.out.println("El numero no puede ser menor a 1 o igual a 1");
				System.out.print("Introduce un numero de nuevo: ");
				numero = teclado.nextInt();
			}
		}
		sumatorio = suma1aN(numero);
		producto = producto1aN(numero);
		intermedio = intermedio1aN(numero);
		System.out.println("El sumatorio es: " + sumatorio + "\nEl producto es: " + producto + "\nEl Valor intermedio es: " + intermedio);
		
		
	}
	
	public static int suma1aN(int n) {
		int suma = 0;
		for (int i=1; i < n; i++) {
			suma = suma + i;
		}
		return suma;
	}

	public static int producto1aN(int n) {
		int productos = 1;
		for (int i=1; i < n; i++) {
			productos = productos * i;
		}
		return productos;
	}
	public static double intermedio1aN(int n) {
		double valorIntermedio = (1 + n) /2;
		return valorIntermedio;
		
	}

}
