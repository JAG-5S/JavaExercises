package arraysBidimensionales;
import java.util.Scanner;
public class EjerciciosChart {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce la primera cadena: ");
	        String cad1 = sc.nextLine();
	        System.out.print("Introduce la segunda cadena: ");
	        String cad2 = sc.nextLine();

	        if (cad1.equals(cad2)) {
	            System.out.println("Las cadenas son exactamente iguales.");
	        } else {
	            System.out.println("Las cadenas son diferentes.");
	        }

	        if (cad1.equalsIgnoreCase(cad2)) {
	            System.out.println("Las cadenas son iguales ignorando mayúsculas/minúsculas.");
	        } else {
	            System.out.println("Las cadenas son diferentes incluso ignorando mayúsculas/minúsculas.");
	        }
	        
	        //--------------------------------
	        
	        System.out.print("Introduce tu nombre: ");
	        String nombre = sc.nextLine();
	        System.out.print("Introduce tu primer apellido: ");
	        String apellido1 = sc.nextLine();
	        System.out.print("Introduce tu segundo apellido: ");
	        String apellido2 = sc.nextLine();

	        String codigo = nombre.substring(0, 3) +
	                        apellido1.substring(0, 3) +
	                        apellido2.substring(0, 3);

	        System.out.println("Código de usuario: " + codigo.toUpperCase());
	        
	        //------------------------------
	        System.out.print("Introduce la primera cadena: ");
	        String cad1 = sc.nextLine();
	        System.out.print("Introduce la segunda cadena: ");
	        String cad2 = sc.nextLine();

	        if (cad1.equals(cad2)) {
	            System.out.println("Las cadenas son exactamente iguales.");
	        } else {
	            System.out.println("Las cadenas son diferentes.");
	        }

	        if (cad1.equalsIgnoreCase(cad2)) {
	            System.out.println("Las cadenas son iguales ignorando mayúsculas/minúsculas.");
	        } else {
	            System.out.println("Las cadenas son diferentes incluso ignorando mayúsculas/minúsculas.");
	        }
	        
	        //----------------------------------------
	        
	        System.out.print("Introduce una frase: ");
	        String frase = sc.nextLine().toLowerCase();

	        int a = 0, e = 0, i = 0, o = 0, u = 0;

	        for (char c : frase.toCharArray()) {
	            switch (c) {
	                case 'a': a++; break;
	                case 'e': e++; break;
	                case 'i': i++; break;
	                case 'o': o++; break;
	                case 'u': u++; break;
	            }
	        }

	        System.out.println("Nº de A's: " + a);
	        System.out.println("Nº de E's: " + e);
	        System.out.println("Nº de I's: " + i);
	        System.out.println("Nº de O's: " + o);
	        System.out.println("Nº de U's: " + u);
	        
	        //-----------------------------------
	        
	        System.out.print("Introduce una frase: ");
	        String frase = sc.nextLine();

	        // Normalizar: quitar espacios y pasar a minúsculas
	        String limpia = frase.replaceAll(" ", "").toLowerCase();

	        // Invertir la cadena
	        String invertida = new StringBuilder(limpia).reverse().toString();

	        if (limpia.equals(invertida)) {
	            System.out.println("La frase es un palíndromo.");
	        } else {
	            System.out.println("La frase NO es un palíndromo.");
	        }
	        
	        
	}

}
