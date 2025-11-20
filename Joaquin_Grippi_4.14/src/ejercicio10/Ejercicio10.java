package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anyo;
		boolean laFechaEs;
		System.out.print("Introduce el dia: ");
		dia = teclado.nextInt();
		System.out.print("Introduce el mes: ");
		mes = teclado.nextInt();
		System.out.print("Introduce el año: ");
		anyo = teclado.nextInt();
		laFechaEs = esLaFechaCorrecta(dia, mes, anyo);
		System.out.print("La fecha es: " + laFechaEs);
	}
	
	public static boolean esLaFechaCorrecta (int dia, int mes, int anyo) {
		boolean esFecha;
		if (dia > 0 && dia < 30) {
			if(mes > 0 && mes < 12) {
				if (anyo < 2027) {
					esFecha = true;
				}else {
					esFecha = false;
				}	
			}else {
				esFecha = false;
			}
		}else {
			esFecha = false;
		}
		return esFecha;
	}

}
