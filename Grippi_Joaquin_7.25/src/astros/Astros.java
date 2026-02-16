package astros;

public abstract class Astros {

	protected double radioEcuatorial;
	protected double rotacionSobreSuEje;
	protected double masa;
	protected double temperaturaMedia;
	protected double gravedad;
	
	protected Astros(double radioEcutorial, double rotacionSobreSuEje, double masa, double temperaturaMedia, double gravedad ) {
		
		this.radioEcuatorial = radioEcutorial;
		this.rotacionSobreSuEje = rotacionSobreSuEje;
		this.masa = masa;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
	}
	//GETTER Y SETTER
	/**
	 * @return the radioEcuatorial
	 */
	protected double getRadioEcuatorial() {
		return radioEcuatorial;
	}

	/**
	 * @param radioEcuatorial the radioEcuatorial to set
	 */
	protected void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	/**
	 * @return the rotacionSobreSuEje
	 */
	protected double getRotacionSobreSuEje() {
		return rotacionSobreSuEje;
	}

	/**
	 * @param rotacionSobreSuEje the rotacionSobreSuEje to set
	 */
	protected void setRotacionSobreSuEje(double rotacionSobreSuEje) {
		this.rotacionSobreSuEje = rotacionSobreSuEje;
	}

	/**
	 * @return the masa
	 */
	protected double getMasa() {
		return masa;
	}

	/**
	 * @param masa the masa to set
	 */
	protected void setMasa(double masa) {
		this.masa = masa;
	}

	/**
	 * @return the temperaturaMedia
	 */
	protected double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	/**
	 * @param temperaturaMedia the temperaturaMedia to set
	 */
	protected void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	/**
	 * @return the gravedad
	 */
	protected double getGravedad() {
		return gravedad;
	}

	/**
	 * @param gravedad the gravedad to set
	 */
	protected void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}
	
	
	
	public String muestra() {
		return "Astros [radioEcuatorial=" + radioEcuatorial + ", rotacionSobreSuEje=" + rotacionSobreSuEje + ", masa="
				+ masa + ", temperaturaMedia=" + temperaturaMedia + ", gravedad=" + gravedad + "]";
	}
	
}
