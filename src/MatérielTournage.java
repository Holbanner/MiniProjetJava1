
public class Mat�rielTournage extends Article {

	/*
	 * Attribut
	 */
	// taille d�fini par l'axe X et Y
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
	 * @param intitul�
	 * @param prixParJour
	 * @param disponnibilit�
	 * @param x
	 * @param y
	 */
	public Mat�rielTournage(String ref, String marque, String intitul�, float prixParJour, int disponnibilit�, int x,
			int y) {
		super(ref, marque, intitul�, prixParJour, disponnibilit�);
		this.setX(x);
		this.setY(y);
		// TODO Auto-generated constructor stub
	}

	// m�thodes
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
