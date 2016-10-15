import java.util.HashSet;

public class Objectif extends Article {
	public Objectif(String ref, String marque, String intitulé, float prixParJour, int disponnibilité) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Attribut
	 */
	private TypeObjectif typeObjectif;
	private HashSet<DispositifAcquisition> dispositifAcquisitions;

	/*
	 * Getter & Setter
	 */
	public HashSet<DispositifAcquisition> getDispositifAcquisitions() {
		return dispositifAcquisitions;
	}

	public void setDispositifAcquisitions(HashSet<DispositifAcquisition> dispositifAcquisitions) {
		this.dispositifAcquisitions = dispositifAcquisitions;
	}

	public TypeObjectif getTypeObjectif() {
		return typeObjectif;
	}

	public void setTypeObjectif(TypeObjectif typeObjectif) {
		this.typeObjectif = typeObjectif;
	}

	/**
	 * contructeur
	 * 
	 * @param ref
	 * @param marque
	 * @param intitulé
	 * @param prixParJour
	 * @param disponnibilité
	 * @param typeObjectif
	 * @param dispositifAcquisitions
	 */
	public Objectif(String ref, String marque, String intitulé, float prixParJour, int disponnibilité,
			TypeObjectif typeObjectif, HashSet<DispositifAcquisition> dispositifAcquisitions) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
		this.typeObjectif = typeObjectif;
		this.dispositifAcquisitions = dispositifAcquisitions;
	}
	
	public String toString() {
		String res = "";
		res += super.toString() + "\n";
		res += "		Type objectif : " + this.typeObjectif.toString() + "\n";


		return res;

	}

}
