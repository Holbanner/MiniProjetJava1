
public class Article {
	/*
	 * Attribut
	 */

	// reference du produit. Num�ro de produit
	private String ref;
	// Marque du constructeur
	private String marque;
	// Nom du produit
	private String intitul�;
	// Prix de la location du produit par jour de location
	private float prixParJour;
	// Produit diponnible en stock
	private int disponnibilit�;

	/*
	 * Getter & Setter
	 */
	public int getDisponnibilit�() {
		return disponnibilit�;
	}

	public void setDisponnibilit�(int disponnibilit�) {
		this.disponnibilit� = disponnibilit�;
	}

	public float getPrixParJour() {
		return prixParJour;
	}

	public void setPrixParJour(float prixParJour) {
		this.prixParJour = prixParJour;
	}

	public String getIntitul�() {
		return intitul�;
	}

	public void setIntitul�(String intitul�) {
		this.intitul� = intitul�;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	// Constructeur
	public Article(String ref, String marque, String intitul�, float prixParJour, int disponnibilit�) {
		super();
		this.ref = ref;
		this.marque = marque;
		this.intitul� = intitul�;
		this.prixParJour = prixParJour;
		this.disponnibilit� = disponnibilit�;
	}

	// Methodes

}
