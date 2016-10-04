import java.util.ArrayList;

public class Client {
	/*
	 * Attribut
	 */
	// liste des infos sur le client
	private String nom;
	private String prénom;
	private String coordonné;
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

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public String getCoordonné() {
		return coordonné;
	}

	public void setCoordonné(String coordonné) {
		this.coordonné = coordonné;
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

	// constructeur, avec deux possibilités. Le second est une surcharge du
	// premier permettant d'ajouter des Locations une par une au besoin

	public Client(String nom, String prénom, String coordonné, int numero, ArrayList<Location> locations) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.coordonné = coordonné;
		this.numero = numero;
		this.locations = locations;
	}

	public Client(String nom, String prénom, String coordonné, int numero) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.coordonné = coordonné;
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
