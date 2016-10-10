
public class DispositifAcquisition extends Article{
	/*
	 * Attribut
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
	
	//contructor
	public DispositifAcquisition(String ref, String marque, String intitulé, float prixParJour, int disponnibilité, int nbPixel, Resolution resolution, TypeObjectif typeObjectif) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
		this.setResolution(resolution);
		this.setNbPixel(nbPixel);
		this.setTypeObjectif(typeObjectif);
	}
	
	public String toString(){
		String res="";
		res += super.toString()+"\n";
		res += "		"+this.getNbPixel()+"\n";
		res += "		"+this.getResolution().toString()+"\n";
		res += "		"+this.getTypeObjectif().toString()+"\n";

		return res;
	}
}
