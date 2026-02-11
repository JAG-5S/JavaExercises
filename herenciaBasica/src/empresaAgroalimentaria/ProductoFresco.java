package empresaAgroalimentaria;

import java.time.LocalDate;

public class ProductoFresco extends Productos {

	private LocalDate fechaCaducidad;
	private String paisOrigen;
	
	public ProductoFresco(int codigoProducto, String nombre, LocalDate fechaCaducidad, int numeroLote, LocalDate fechaEnvasado, String paisOrigen) {
		super(codigoProducto, nombre, fechaCaducidad, numeroLote);
		this.fechaCaducidad = fechaCaducidad;
		this.paisOrigen = paisOrigen;
		
	}
	
	@Override
	public String toString() {
		return 	super.toString()+", FechaCaducidad"+fechaCaducidad;
	}
	
	
}
