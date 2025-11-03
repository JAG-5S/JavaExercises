package formatoDeArrays;

public class FormatoDeArrays {

	public static void main(String[] args) {
		String nombre = "Juan";
		int edad = 34;
		double altura = 1.87;
		double peso = 75.4;
		double alturaCuadrado = Math.pow(altura, 2) ;
		double imc = peso / alturaCuadrado;
		String cadena = String.format("Numbre: %s ** edad: %d ** altura: %.2f ** peso: %.3f", nombre,edad,altura,peso);
		System.out.println(cadena);
		
		System.out.printf("Numbre: %s ** edad: %d ** altura: %.2f ** peso: %.3f ** IMC: %.2f Bajo peso", nombre,edad,altura,peso,imc);
		
	
	}

}
