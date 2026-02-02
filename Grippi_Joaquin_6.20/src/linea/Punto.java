package linea;

public class Punto {

	public static final double PUNTO_PREDETERMINADOX= 0;	//Valor predeterminado de punto en x
	public static final double PUNTO_PREDETERMINADOY= 0;	//Valor predeterminado de punto en y
	public double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Punto() {
		this.x = PUNTO_PREDETERMINADOX;
		this.y = PUNTO_PREDETERMINADOY;
	}
	
	public String toString() {
		return "("+this.x+", "+this.y+")";
	}
	
	public void modCordX (double x)  {
		this.x += x;
	}
	public void modCordY (double y)  {
		this.y += y;
	}
	
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
}
