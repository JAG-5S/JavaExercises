package ejOperadoresBasicos;

import java.util.Scanner;

public class OperadoresBsicos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		int dato1, dato3;
		double dato2 ; 
		
		dato1 = 5;
		System.out.println("Escribe un numero decimal: ");
		dato2 = teclado.nextDouble();
		
		System.out.println("Escribe un numero entero: ");
		
		dato3 = teclado2.nextInt();
		
		double suma;
		
		suma = dato1+dato2;
		System.out.println("La  suma es: " + suma);
		
		double resta = dato1-dato2;
		System.out.println("La resta es: " + resta);
		
		double division = dato1 / dato2;
		System.out.println("La division es: " + division );
		
		double resto = dato1%dato2; 
		
		System.out.println("El resto es: " + resto);
		
		double multiplicacion = dato1 * dato2;
		System.out.println("La multiplicacion es: " + multiplicacion);
		
		double porcentaje = (dato1 * dato2) / 100;
		System.out.println("El porcentaje es: " + porcentaje);
		
		int dato1mas = dato1; // dato1mas = dato1 + 1; a su vez dato1mas = dato1-- /= dato1 - 1;
		System.out.println("El incremental es: " + ++dato1); // El incremetal es (++) = +1
		
		
		double elevado = Math.pow(dato1, dato3);
		System.out.println("El elevado es: " + elevado);
		
		double raiz = Math.sqrt(dato1);
		System.out.println("La  Raiz Cuadrada es: " + raiz);
		//Ecuaciones Complejas Area de un Triangulo
		
		int a = 5;
		int b = 5;
		int areaDelTriangulo = a*b/2;
		System.out.println("El Area del Triangulo es: " + areaDelTriangulo);
		
		
		
		
		//Buleanos
		System.out.println(dato1 != dato2);
		
		
		
		
		

		
		
		
		
		
	}

}
