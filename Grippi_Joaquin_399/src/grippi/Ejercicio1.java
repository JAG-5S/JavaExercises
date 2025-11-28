package grippi;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String contraseña = "terminar";
		int contador = 0, contador2 = 0;
		
		//Inicio del Bucle
		while(contador != 1){
		System.out.print("Ingresa el Nombre del Producto: ");
		String nombre = teclado.next();
		
		
		if(contraseña.equals(nombre) == true){
			contador++;
		}else {
			//En caso de que no se ingrese la clave secreta
			contador2++;
			System.out.print("Ingresa el numero de unidades: ");
			int unidades = teclado.nextInt();
			
			//Bucle si las unidades son mas o menos de las que deberia
			while (unidades < 1 || unidades > 100) {
			System.out.println("Unidades erroneas repita" );
			System.out.print("Ingresa el numero de unidades: ");
			unidades = teclado.nextInt();
			}
			
			System.out.print("Ingresa el precio de las unidades: ");
			double precio = teclado.nextDouble();
			
			//Calculo Final porcentual segun numero de unidades
			if (unidades >= 1 && unidades <= 15) {
				System.out.println("Por la Compra de esta cantidad se aplicara un descuento del 5%");
				double precioFinal = unidades*(precio - (precio/100*5));
				System.out.println("El nombre del producto es: " + nombre + "\nEl numero de unidades es: " + unidades + "\nEl precio es: " + precio + "\nEl precio Total con descuento final es: " + precioFinal);
				
			}else if (unidades >= 11 && unidades <= 50 ) {
				System.out.println("Por la Compra de esta cantidad se aplicara un descuento del 10%");
				double precioFinal = unidades*(precio - (precio/100*10));
				System.out.println("El nombre del producto es: " + nombre + "\nEl numero de unidades es: " + unidades + "\nEl precio es: " + precio + "\nEl precio total con descuento es final es: " + precioFinal);
			}else {
				System.out.println("Por la Compra de esta cantidad se aplicara un descuento del 20%");
				double precioFinal = unidades*(precio - (precio/100*20));
				System.out.println("El nombre del producto es: " + nombre + "\nEl numero de unidades es: " + unidades + "\nEl precio es: " + precio + "\nEl precio total con descuento es final es: " + precioFinal);
			}	
			
			}
				
		}
		
		System.out.println("Bucle Finalizado");
		System.out.println("Se proceso un total de: " + contador2);


	}

}
