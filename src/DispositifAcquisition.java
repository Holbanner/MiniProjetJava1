
public class DispositifAcquisition extends Article {
	/*
	 * Attribut
	 */
	private int nbPixel;
	private TypeObjectif typeObjectif;
	private Resolution resolution;

	/*
	 * Getter & Setter
	 */
	public int getNbPixel() {
		return nbPixel;
	}

	public void setNbPixel(int nbPixel) {
		this.nbPixel = nbPixel;
	}

	public TypeObjectif getTypeObjectif() {
		return typeObjectif;
	}

	public void setTypeObjectif(TypeObjectif typeObjectif) {
		this.typeObjectif = typeObjectif;
	}

	public Resolution getResolution() {
		return resolution;
	}

	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}

	/** 
	 *  Constructeur
	 * @param ref
	 * @param marque
	 * @param intitul�
	 * @param prixParJour
	 * @param disponnibilit�
	 * @param nbPixel
	 * @param typeObjectif
	 * @param resolution
	 */

	public DispositifAcquisition(String ref, String marque, String intitul�, float prixParJour, int disponnibilit�,
			int nbPixel, TypeObjectif typeObjectif, Resolution resolution) {
		super(ref, marque, intitul�, prixParJour, disponnibilit�);
		this.nbPixel = nbPixel;
		this.typeObjectif = typeObjectif;
		this.resolution = resolution;
	}

}
