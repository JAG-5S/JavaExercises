package instituto;

public class Pas extends Personal {

	private boolean aleman;
	private boolean chino;
	private boolean ingles;
	private String areaAtencion;
	
	public Pas(String dni,int edad, String nombre, String apellido, String genero, double salario
			, String telefono, String email, boolean aleman, boolean chino, boolean ingles, String areaAtencion) {
		super(dni, edad, nombre, apellido, genero, salario, telefono, email);
		
		this.aleman = aleman;
		this.chino = chino;
		this.ingles = ingles;
		this.areaAtencion = areaAtencion;
	}
	
	/**
	 * @return the aleman
	 */
	protected boolean isAleman() {
		return aleman;
	}

	/**
	 * @param aleman the aleman to set
	 */
	protected void setAleman(boolean aleman) {
		this.aleman = aleman;
	}

	/**
	 * @return the chino
	 */
	protected boolean isChino() {
		return chino;
	}

	/**
	 * @param chino the chino to set
	 */
	protected void setChino(boolean chino) {
		this.chino = chino;
	}

	/**
	 * @return the ingles
	 */
	protected boolean isIngles() {
		return ingles;
	}

	/**
	 * @param ingles the ingles to set
	 */
	protected void setIngles(boolean ingles) {
		this.ingles = ingles;
	}

	/**
	 * @return the areaAtencion
	 */
	protected String getAreaAtencion() {
		return areaAtencion;
	}

	/**
	 * @param areaAtencion the areaAtencion to set
	 */
	protected void setAreaAtencion(String areaAtencion) {
		this.areaAtencion = areaAtencion;
	}
	
	public void numIdiomas() {
		int contadorIdiomas = 0;
		if (aleman = true) {
			contadorIdiomas ++;
		}
		if (chino = true) {
			contadorIdiomas ++;
		}
		if (ingles = true) {
			contadorIdiomas ++;
		}
		
		System.out.print("Habla un total de: "+contadorIdiomas+" idiomas");
	}
	
	public void cambioIdioma(boolean idioma) {
		if (idioma = true) {
			idioma = false;
		}else if(idioma = false) {
			idioma = true;
		}
		
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Pas [aleman=" + aleman + ", chino=" + chino + ", ingles=" + ingles + ", areaAtencion=" + areaAtencion
				+ "]";
	}
	
	
	
	
}
