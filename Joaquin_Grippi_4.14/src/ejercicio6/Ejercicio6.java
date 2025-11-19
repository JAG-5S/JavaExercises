package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Me di cuenta que era mucho mas eficiente usar un vector.
		//----------------
		//double productoUno, productoDos, productoTres, productoCuatro, productoCinco;
		//System.out.print("Introduce el precio del primer producto");
		//productoUno = teclado.nextDouble();
		//System.out.print("Introduce el precio del segundo producto");
		//productoDos = teclado.nextDouble();
		//System.out.print("Introduce el precio del tercer producto");
		//productoTres = teclado.nextDouble();
		//System.out.print("Introduce el precio del cuarto producto");
		//productoCuatro = teclado.nextDouble();
		//System.out.print("Introduce el precio del quinto producto");
		//productoCinco = teclado.nextDouble();
		//--------------
		double precio;
		double[] precios = new double[5];
		for (int i=0;i<precios.length;i++) {
			System.out.print("Introduce el precio del "+ i + " producto: ");
			precio = teclado.nextDouble();
			precios[i] = precio;
		}
		double valor;
		double[] preciosIVA = new double[5];
		for (int i = 0; i<precios.length;i++) {
			valor = precioConIVA(precios[i]);
			preciosIVA[i] = valor;
		}
		
		
		
		for (int i = 0; i<precios.length;i++) {
			System.out.print(precios[i] + " ");
		}
		System.out.println();
		for (int i = 0; i<precios.length;i++) {
			System.out.print(preciosIVA[i] + " ");
		}
		
	}
	
	public static double precioConIVA(double precio) {
		double ivaAplicado = (precio + (precio / 100 * 21));
		return ivaAplicado;
	}

}
