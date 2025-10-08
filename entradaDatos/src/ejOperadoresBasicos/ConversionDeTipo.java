package ejOperadoresBasicos;

public class ConversionDeTipo {

	public static void main(String[] args) {
		
		byte monederoPequenyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 1000000001;
		
		monederoGrande = monederoMediano; // conversion automatica
		
		monederoMediano = monederoPequenyo; 
		
		monederoPequenyo = (byte) monederoMediano; //cast
		
		System.out.println("Monedero Pequeño: " + monederoPequenyo);
		
		System.out.println("Monedero Mediano: " + monederoMediano);
		
		System.out.println("Monedero Grande: " + monederoGrande);

	}

}
