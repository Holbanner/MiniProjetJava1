
public class Article {
	/*
	 * Attribut
	 * */
	
	//reference du produit. Num�ro de produit
	private int ref;
	//Marque du constructeur
	private String marque;
	//Nom du produit
	private String intitul�;
	//Prix de la location du produit par jour de location
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
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}

}
