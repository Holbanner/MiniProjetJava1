import java.util.HashSet;

public class Objectif extends Article{
	public Objectif(String ref, String marque, String intitulé,
			float prixParJour, int disponnibilité) {
		super(ref, marque, intitulé, prixParJour, disponnibilité);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Attribut
	 * */
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
	
}
