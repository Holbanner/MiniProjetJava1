
public class MatérielTournage extends Article {

	/*
	 * Attribut
	 */
	// taille défini par l'axe X et Y
	private int x;
	private int y;

	/*
	 * Getter & Setter
	 */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 
	 * @param ref
	 * @param marque
	 * @param intitulé
	 * @param prixParJour
	 * @param disponnibilité
	 * @param x
	 * @param y
	 */
	public MatérielTournage(String ref, String marque, String intitulé, float prixParJour, int disponnibilité, int x,
			int y) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
		this.setX(x);
		this.setY(y);
		// TODO Auto-generated constructor stub
	}

	// méthodes
	/**
	 * Retourne les infos
	 */
	public String toString() {
		String res = "";
		res += super.toString();
		res += "			Dimension : largeur =>" + this.getX() + " hauteur => " + this.getY() + "\n";

		return res;
	}

}
