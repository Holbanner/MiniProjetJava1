
public class DispositifAcquisition extends Article{
	/*
	 * Attributs
	 * */
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
	
	/*
	 * Constructeur
	 */
	
	/**
	 * Constructreur
	 * @param ref
	 * @param marque
	 * @param intitul�
	 * @param prixParJour
	 * @param disponnibilit�
	 * @param nbPixel
	 * @param resolution
	 * @param typeObjectif
	 */
	public DispositifAcquisition(String ref, String marque, String intitul�, float prixParJour, int disponnibilit�, int nbPixel, Resolution resolution, TypeObjectif typeObjectif) {
		super(ref, marque, intitul�, prixParJour, disponnibilit�);
		this.setResolution(resolution);
		this.setNbPixel(nbPixel);
		this.setTypeObjectif(typeObjectif);
	}
	
	/**
	 * Retourne les info
	 */
	public String toString(){
		String res="";
		res += super.toString();
		res += "			Nombre de pixel : "+this.getNbPixel()+"\n";
		res += "		"+this.getResolution().toString()+"\n";
		res += "		"+this.getTypeObjectif().toString()+"\n";

		return res;
	}
}
