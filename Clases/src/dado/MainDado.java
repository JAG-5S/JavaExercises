package dado;

public class MainDado {

	public static void main(String[] args) {
		Dado dado1 = new Dado();
		Dado dado2 = new Dado((byte)12);
		
		
		Dado.lanzar(dado1);
		System.out.println(dado1);
	
		System.out.println(dado2);
		try {
		Dado dado3 = new Dado((byte)5);
		}catch (IllegalArgumentException ex1) {
			System.out.print(ex1.getMessage());
		}
		
	}

}
