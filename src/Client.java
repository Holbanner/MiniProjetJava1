import java.util.ArrayList;

public class Client {
	/*
	 * Attribut
	 */
	// liste des infos sur le client
	private String nom;
	private String pr�nom;
	private String coordonn�;
	private int numero;
	// liste de locations
	private ArrayList<Location> locations;

	/*
	 * Getter & Setter
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public String getCoordonn�() {
		return coordonn�;
	}

	public void setCoordonn�(String coordonn�) {
		this.coordonn� = coordonn�;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}

	// constructeur, avec deux possibilit�s. Le second est une surcharge du
	// premier permettant d'ajouter des Locations une par une au besoin

	public Client(String nom, String pr�nom, String coordonn�, int numero, ArrayList<Location> locations) {
		super();
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.coordonn� = coordonn�;
		this.numero = numero;
		this.locations = locations;
	}

	public Client(String nom, String pr�nom, String coordonn�, int numero) {
		super();
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.coordonn� = coordonn�;
		this.numero = numero;
		this.locations = new ArrayList<Location>();
	}

	// methode

	// ajouter un location dans la liste
	public void ajouterLocation(Location location) {
		locations.add(location);
	}

	// ajouter un location dans la liste
	public void supprimerLocation(Location location) {
		locations.remove(location);
	}
}
