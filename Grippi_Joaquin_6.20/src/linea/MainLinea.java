package linea;

public class MainLinea {

	public static void main(String[] args) {
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto();
		
		Linea l1 = new Linea(p1,p2);
		System.out.println("El valor de los puntos es: ");
		System.out.println(l1.getPuntoA());
		System.out.println(l1.getPuntoB());
		System.out.println("El valor de los puntos intercambiados es: ");
		l1.setPuntoA(p2);
		l1.setPuntoB(p1);
		System.out.println(l1);
		System.out.println("Movemos la linea hacia la derecha y arriba");
		l1.mueveDerecha(3);
		l1.mueveArriba(2);
		System.out.println(l1);
		System.out.println("Movemos la linea hacia la izquierda y abajo");
		l1.mueveIzquierda(-5);
		l1.mueveAbajo(-2);
		System.out.println(l1);
	}

}
