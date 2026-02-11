package humanoCiudadano;

public class MainHumano {

	public static void main(String[] args) {
		Humano humano1 = new Humano();
		
		Ciudadano ciudadano1 = new Ciudadano(humano1.nombre, humano1.apellido,"02341FD");
		
		Ciudadano ciudadano2 = new Ciudadano(humano1.nombre, humano1.apellido,"000001FD");

		System.out.println(humano1);
		
		System.out.println(ciudadano1);
		
		System.out.println(ciudadano2);
	}

}
