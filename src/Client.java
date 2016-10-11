import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.FileNotFoundException;
import java.io.IOException;


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

	/**
	 * constructeur, avec deux possibilités. Le second est une surcharge du
	 * 
	 * @param nom
	 * @param prénom
	 * @param coordonné
	 * @param numero
	 * @param locations
	 */
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
	/**
	 * Methode qui stock les locations dans un fichier binaire.
	 * 
	 * @param sauvegarde
	 * @throws IOException
	 */
	public void saveCommande(String sauvegarde) throws IOException {
		DataOutputStream fluxSortieBinaire = new DataOutputStream(new FileOutputStream(sauvegarde));
		// parcour la liste "locations" et écrit ses attributs
		for (Location loc : this.locations) {
			fluxSortieBinaire.writeFloat(loc.getMontant());
//			fluxSortieBinaire.writeChars(loc.getMontant());
		}
		// fermeture du flux
		fluxSortieBinaire.close();
	}

	/**
	 * Methode qui permet de récuperer les commandes archivées
	 * 
	 * @param sauvegarde
	 * @throws IOException
	 */
	public float loadCommande(String sauvegarde) throws IOException {
		// Lit le fichier binaire généré par saveCommande
		DataInputStream fluxEBinaire = new DataInputStream(new FileInputStream("sauvegarde.dat"));
		Float Opt = fluxEBinaire.readFloat();
		fluxEBinaire.close();
		return Opt;
	}

	/**
	 * ajouter un location dans la liste
	 * 
	 * @param location
	 */
	public void ajouterLocation(Location location) {
		locations.add(location);
	}

	/**
	 * ajouter un location dans la liste
	 * 
	 * @param location
	 */
	public void supprimerLocation(Location location) {
		locations.remove(location);
	}
	/**
	 * Affiche les locations en cours dans la console
	 */
	public void AfficherLocationsEnCours(){
		//pour chaque location 
		for (Location loc : this.locations){
			//si la date de début est antérieur à la date actuel et la date de fin postérieur à maintenant
			if(	((loc.getDateDebut().compareTo(new GregorianCalendar())) < 1) && ((loc.getDateFin().compareTo(new GregorianCalendar())) > 0 ) ){
				//afficher la location
				System.out.println(loc.toString());
			}
		}
	}

	public static void main(String[] args) {
		Article A1 = new Article("12", "rebook", "tropcool", 12, 7);
		ArrayList<Article> Ar1 = new ArrayList<Article>();
		Ar1.add(A1);
		Location l1 = new Location(new GregorianCalendar(2012, Calendar.FEBRUARY, 17),
				new GregorianCalendar(2012, Calendar.FEBRUARY, 17), 123, Ar1);

		ArrayList<Location> ArL1 = new ArrayList<Location>();
		ArL1.add(l1);
		Client c1 = new Client("jean", "caca", "pipi", 129, ArL1);

		try {
			c1.saveCommande("sauvegarde.dat");
		} catch (IOException e) {
			System.out.println("Error d'E/S" + e.getMessage());
		}

		try {
			Float yo = c1.loadCommande("sauvegarde.dat");
			System.out.println(yo);
		} catch (IOException e) {
			System.out.println("Error d'E/S" + e.getMessage());
		}
		
	}
}
