public class Panneau extends Article{
	public Panneau(String ref, String marque, String intitulé,
			float prixParJour, int disponnibilité, int nbLed) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
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
