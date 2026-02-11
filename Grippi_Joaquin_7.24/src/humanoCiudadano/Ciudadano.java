package humanoCiudadano;

public class Ciudadano extends Humano {

	
		protected String documento;
		
		Ciudadano(String nombre, String apellido, String documento){
			super(nombre, apellido);
			this.documento = documento;
		}

		public String toString() {
			return super.getNombreCompleto()+ ", Documento: "+ this.documento;
		}
	}


