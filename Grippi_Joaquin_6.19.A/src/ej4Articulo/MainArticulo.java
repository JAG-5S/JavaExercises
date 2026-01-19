package ej4Articulo;

public class MainArticulo {

	public static void main(String[] args) {
		
		Articulo producto1 = new Articulo();
		
		producto1.nombre = "teclado";
		producto1.precio = 10;
		producto1.cuantosQuedan = 8;
		
		System.out.println("Producto: " + producto1.nombre + " Precio: "+producto1.precio+" IVA: "+producto1.iva+"% PVP: "+ (producto1.precio+(producto1.precio*producto1.iva/100)));
		producto1.precio = 15;
		System.out.println("Producto: " + producto1.nombre + " Precio: "+producto1.precio+" IVA: "+producto1.iva+"% PVP: "+ (producto1.precio+(producto1.precio*producto1.iva/100)));

	}

}
