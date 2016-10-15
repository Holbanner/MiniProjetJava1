public class Panneau extends Article {

	/*
	 * Attribut
	 */
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
	 * 
	 * @param ref
	 * @param marque
	 * @param intitul�
	 * @param prixParJour
	 * @param disponnibilit�
	 * @param nbLed
	 */
	public Panneau(String ref, String marque, String intitul�, float prixParJour, int disponnibilit�, int nbLed) {
		super(ref, marque, intitul�, prixParJour, disponnibilit�);
		this.nbLed = nbLed;
	}

	// methodes

	public String toString() {
		String res = "";
		res += super.toString();
		res += "		Nombre de Led : " + this.getNbLed() + "\n";

		return res;

	}
}
