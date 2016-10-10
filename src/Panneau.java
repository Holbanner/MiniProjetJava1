public class Panneau extends Article{
	public Panneau(String ref, String marque, String intitul�,
			float prixParJour, int disponnibilit�, int nbLed) {
		super(ref, marque, intitul�, prixParJour, disponnibilit�);
		this.setNbLed(nbLed);
		// TODO Auto-generated constructor stub
	}

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
	
	//methodes
	
	public String toString(){
		String res="";
		res += super.toString()+"\n";
		res += "		Nombre de Led : " + this.getNbLed() + "\n";

		return res;
	}
}
