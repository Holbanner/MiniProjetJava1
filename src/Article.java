import java.io.Serializable;

public class Article implements Serializable{
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

	/** 
	 *  Constructeur
	 * @param ref : r�f�rence de l'article
	 * @param marque : marque de l'article
	 * @param intitul� : nom de l'article
	 * @param prixParJour : prix � la location par jour
	 * @param disponnibilit� : quantit� disponnible
	 */

	public Article(String ref, String marque, String intitul�, float prixParJour, int disponnibilit�) {
		super();
		this.ref = ref;
		this.marque = marque;
		this.intitul� = intitul�;
		this.prixParJour = prixParJour;
		this.disponnibilit� = disponnibilit�;
	}
	
	// Methodes
	/**
	 * Retourne les infos de l'article
	 * @return String :les infos
	 */
	public String toString() {
		String res = "			R�f�rence : "+this.getRef()+"\n";
		res += "			Intitul� : "+this.getIntitul�()+"\n";
		res += "			Marque : "+this.getMarque()+"\n";
		res += "			Prix par jour : "+this.getPrixParJour()+"�\n";
		res += "			Nombre disponible : "+this.getDisponnibilit�()+"\n";
		return res;
	}

}
