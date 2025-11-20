package ejercicio9;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3, elMenorDeNum1YNum2, menor;
		System.out.print("Introduce el primer valor: ");
		num1 = teclado.nextInt();
		System.out.print("Introduce el segundo valor: ");
		num2 = teclado.nextInt();
		System.out.print("Introduce el tercer valor: ");
		num3 = teclado.nextInt();
		if (num1 > num2 ) {
			elMenorDeNum1YNum2 = num2;
		} else {
			elMenorDeNum1YNum2 = num1;
		}
		
		menor = elMenorDeDos(elMenorDeNum1YNum2, num3);
		System.out.println("El menor es: " + menor);
	}
	
	public static int elMenorDeDos(int a, int b) {
		int elMenorEs;
		if (a < b) {
			elMenorEs = a;
		}else {
			elMenorEs = b;
		}
		return elMenorEs;
	}

}
