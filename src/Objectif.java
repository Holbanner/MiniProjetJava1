import java.util.HashSet;

public class Objectif extends Article {
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
	 *  contructeur
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

}
