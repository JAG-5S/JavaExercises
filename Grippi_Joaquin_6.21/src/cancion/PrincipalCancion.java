package cancion;

public class PrincipalCancion {

	public static void main(String[] args) {
		
		Cancion cancionUno = new Cancion();
		//TRY CATH NO OLVIDAR 
		
		
		Cancion cancionDos = new Cancion("The Girl From Ipanema", "Frank Sinatra, Antonio Carlos Jobim");
		
		cancionUno.setTitulo("Fiesta Pagana");
		cancionDos.setTitulo("My Way");
		
		Cancion cancionTres = new Cancion(cancionDos);
		Cancion cancionReferencia = cancionTres;
		
		cancionReferencia.setAutor("Pepito");
		
		System.out.println(cancionUno.toString());
		System.out.println(cancionDos.toString());
		System.out.println(cancionTres.toString());
		
		
		//Objeto CD
		
		System.out.println("-------Objeto CD-------------");
		
		CD unCD = new CD();
		
		unCD.agrega(cancionUno);
		unCD.agrega(cancionDos);
		unCD.agrega(cancionTres);
	
		System.out.println("El numero de canciones es: "+unCD.numeroCanciones());
		
		try {
			unCD.elimina(2);
		}catch (IndexOutOfBoundsException ex1) {
			System.out.println("La posicion no es valida"+ex1.getMessage());
		}
		
		
		CD otroCD = new CD(unCD);
		
		otroCD.agrega(cancionTres);
		
		System.out.println(unCD);
		
		System.out.println(otroCD);
		
		
		
		
	}

}
