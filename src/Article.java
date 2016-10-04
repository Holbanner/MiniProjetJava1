
public class Article {
	/*
	 * Attribut
	 * */
	
	//reference du produit. Numéro de produit
	private int ref;
	//Marque du constructeur
	private String marque;
	//Nom du produit
	private String intitulé;
	//Prix de la location du produit par jour de location
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
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}

}
