public class Panneau extends Article{
	/*
	 * Attribut
	 * */
	private int nbLed;
	
	/*
	 * Getter & Setter
	 */
	public int getNbLed() {
		return nbLed;
	}

	public void setNbLed(int nbLed) {
		this.nbLed = nbLed;
	}

	/** 
	 * constructeur
	 * @param ref
	 * @param marque
	 * @param intitulé
	 * @param prixParJour
	 * @param disponnibilité
	 * @param nbLed
	 */
	public Panneau(String ref, String marque, String intitulé, float prixParJour, int disponnibilité, int nbLed) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
		this.nbLed = nbLed;
	}
	
	
}
