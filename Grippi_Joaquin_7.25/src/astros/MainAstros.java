package astros;

public class MainAstros {

	public static void main(String[] args) {
		Planetas tierra = new Planetas(5000.0, 2.0, 500.40, 20.0, 50.0, 5, true );
		System.out.println(tierra.muestra());
		
		Satelites luna = new Satelites(5000.0, 2.0, 500.40, 20.0, 50.0, 5, 2, tierra);
		System.out.println(luna.muestra());
		
		Satelites luna2 = new Satelites(5000.0, 2.0, 500.40, 20.0, 50.0, 5, 2, tierra);
		
		tierra.agregarSatelite(luna);
		tierra.agregarSatelite(luna2);
		
		System.out.println(tierra.muestra());
	}

}
