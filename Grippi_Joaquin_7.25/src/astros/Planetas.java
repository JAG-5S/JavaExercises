package astros;

import java.util.Arrays;

public class Planetas extends Astros {
	private int distanciaSol;
	private boolean orbitaAlSol;
	private Satelites [] tieneSatelites = new Satelites[10];
	private int contadorSatelites;
	
	public Planetas(double radioEcutorial, double rotacionSobreSuEje, double masa
			, double temperaturaMedia, double gravedad, int distanciaSol, boolean orbitaAlSol) {
		super(radioEcutorial, rotacionSobreSuEje, masa, temperaturaMedia, gravedad);
		
		this.distanciaSol = distanciaSol;
		this.orbitaAlSol = orbitaAlSol;
		this.contadorSatelites = 0;
	}
	
	/**
	 * @return the distanciaSol
	 */
	protected int getDistanciaSol() {
		return distanciaSol;
	}

	/**
	 * @param distanciaSol the distanciaSol to set
	 */
	protected void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	/**
	 * @return the orbitaAlSol
	 */
	protected boolean isOrbitaAlSol() {
		return orbitaAlSol;
	}

	/**
	 * @param orbitaAlSol the orbitaAlSol to set
	 */
	protected void setOrbitaAlSol(boolean orbitaAlSol) {
		this.orbitaAlSol = orbitaAlSol;
	}

	/**
	 * @return the tieneSatelites
	 */
	protected Satelites[] getTieneSatelites() {
		return tieneSatelites;
	}

	/**
	 * @param tieneSatelites the tieneSatelites to set
	 */
	protected void setTieneSatelites(Satelites[] tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}
	
	public void agregarSatelite(Satelites satelite) {
		tieneSatelites [contadorSatelites] = satelite;
		this.contadorSatelites ++;
	}
	
	@Override
	public String muestra() {
		return super.muestra() + "Planetas [distanciaSol=" + distanciaSol + ", orbitaAlSol=" + orbitaAlSol + ", tieneSatelites="
				+ Arrays.toString(tieneSatelites) + ", contadorSatelites=" + contadorSatelites + "]";
	}
	
}
