package linea;

public class Linea {
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public Linea() {
		this.puntoA = new Punto();
		this.puntoB = new Punto();
	}
	
	//Getters y setters.
	
	public Punto getPuntoA() {
	    return puntoA;
	}

	public Punto getPuntoB() {
	    return puntoB;
	}

	public void setPuntoA(Punto puntoA) {
	    this.puntoA = puntoA;
	}

	public void setPuntoB(Punto puntoB) {
	    this.puntoB = puntoB;
	}

	//Metodos
	
	public void mueveDerecha(double x) throws IllegalArgumentException {
		if (x < 0) {
			throw new IllegalArgumentException("El valor debe ser positivo para mover a la derecha");
		}
		puntoA.modCordX(x);
		puntoB.modCordX(x);
	}
	public void mueveIzquierda(double x) throws IllegalArgumentException {
		if (x > 0) {
			throw new IllegalArgumentException("El valor debe ser negativo para mover a la izquierda");
		}
		puntoA.modCordX(x);
		puntoB.modCordX(x);
	}
	public void mueveAbajo(double y) throws IllegalArgumentException {
		if (y > 0) {
			throw new IllegalArgumentException("El valor debe ser negativo para mover a abajo");
		}
		puntoA.modCordY(y);
		puntoB.modCordY(y);
	}
	public void mueveArriba(double y) throws IllegalArgumentException {
		if (y < 0) {
			throw new IllegalArgumentException("El valor debe ser positivo para mover a la Arriba");
		}
		puntoA.modCordY(y);
		puntoB.modCordY(y);
	}
		
	public String toString() {
		 return "[" + puntoA.getX() +","+puntoA.getY() + "," + puntoB.getX()+","+puntoB.getY() + "]";
	}
	
}

