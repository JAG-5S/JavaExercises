package ej3rectangulo;

public class MainRectangulo {

	public static void main(String[] args) {
		
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();
		
		
		rec1.x1 = 0;
		rec1.y1 = 0;
		rec1.x2 = 5;
		rec1.y2 = 5;
		System.out.println("Rectangulo 1------");
		muestraCordenadas(rec1);
		rec1.perimetro = calculaPerimetro(rec1);
		rec1.area = calcularArea(rec1);
		muestraCordenadas(rec1);
		
		rec2.x1 = 7;
		rec2.y1 = 9;
		rec2.x2 = 2;
		rec2.y2 = 3;
		System.out.println("Rectangulo 2------");
		muestraCordenadas(rec2);
		rec2.perimetro = calculaPerimetro(rec2);
		rec2.area = calcularArea(rec2);
		muestraCordenadas(rec2);
	}
	
	static void muestraCordenadas(Rectangulo nombre) {
		
		System.out.println("cordenadas: " + "(" +nombre.x1 + nombre.y1+ ")" + " (" +nombre.x2 + nombre.y2 + ")");
		System.out.println("Perimetros: " + nombre.perimetro + " Area: " + nombre.area);
		
	}
	
	static int calculaPerimetro(Rectangulo nombre) {
		int perimetro1 = nombre.x1 + nombre.y1 + nombre.x2 + nombre.y2;
		return perimetro1;
	}
	
	static int calcularArea(Rectangulo nombre) {
		int area1 = nombre.x1 * nombre.y2;
		return area1;
	}
	

}
