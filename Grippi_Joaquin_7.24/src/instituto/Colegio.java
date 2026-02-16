package instituto;

public class Colegio {

	public static void main(String[] args) {
		
		try {
		Personal persona1 = new Personal("123456789Z", 20, "Pablo", "Sanchez", "Masculino", 1000.20, "920348590", "HelloPepe@Pepe.com");
		}catch(IllegalArgumentException  ex1) {
			System.out.print("DNI ERROR " + ex1.getLocalizedMessage());
		}
		Personal persona1 = new Personal("12345678 Z", 20, "Pablo", "Sanchez", "Masculino", 1000.20, "920348590", "HelloPepe@Pepe.com");
		
		System.out.println();
		persona1.aumentoSalario(10);
		System.out.println();
		persona1.anyosJubilacion();
		System.out.println(persona1);

	}

}
