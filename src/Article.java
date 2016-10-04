
public class Article {
	/*
	 * Attribut
	 */

	// reference du produit. Numéro de produit
	private String ref;
	// Marque du constructeur
	private String marque;
	// Nom du produit
	private String intitulé;
	// Prix de la location du produit par jour de location
	private float prixParJour;
	// Produit diponnible en stock
	private int disponnibilité;

	/*
	 * Getter & Setter
	 */
	public int getDisponnibilité() {
		return disponnibilité;
	}

	public void setDisponnibilité(int disponnibilité) {
		this.disponnibilité = disponnibilité;
	}

	public float getPrixParJour() {
		return prixParJour;
	}

	public void setPrixParJour(float prixParJour) {
		this.prixParJour = prixParJour;
	}

	public String getIntitulé() {
		return intitulé;
	}

	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
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
	public Article(String ref, String marque, String intitulé, float prixParJour, int disponnibilité) {
		super();
		this.ref = ref;
		this.marque = marque;
		this.intitulé = intitulé;
		this.prixParJour = prixParJour;
		this.disponnibilité = disponnibilité;
	}

	// Methodes

}
