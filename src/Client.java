import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

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

	/**
	 * constructeur, avec deux possibilit�s. Le second est une surcharge du
	 * 
	 * @param nom
	 *            :nom client
	 * @param pr�nom
	 *            : pr�nom client
	 * @param coordonn�
	 *            : coordonn�s client
	 * @param numero
	 *            : numero client
	 * @param locations
	 *            : ArrayList des locations du client
	 */
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
	/**
	 * Methode qui stock les locations dans un fichier binaire.
	 * 
	 * @param sauvegarde
	 * @throws IOException
	 */
	// public void saveCommande(String sauvegarde, Location lSave) throws
	// IOException {
	//
	//
	// Sauvegarde.getSauvegarde(lSave.getDateFin());
	//
	// }
<<<<<<< HEAD

		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		Sauvegarde.getSauvegarde(lSave.getDateFin().get(Calendar.MONTH));
		
	}
=======
>>>>>>> branch 'master' of https://github.com/Holbanner/MiniProjetJava1.git

	/**
	 * Methode qui permet de r�cuperer les commandes archiv�es
	 * 
	 * @param sauvegarde
	 *            :nom du fichier
	 * @throws IOException
	 */
	public Location loadCommande(String sauvegarde) throws IOException {
		Location loci = null;
		// for (Location loc : this.locations) {
		try {
			FileInputStream fileIn = new FileInputStream(sauvegarde);
			System.out.printf("Hallo");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			loci = (Location) in.readObject();
			in.close();
			fileIn.close();
			return loci;
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("Location class not found");
			c.printStackTrace();
			// }
		}
		return loci;
	}

	/**
	 * ajouter un location dans la liste
	 * 
	 * @param location
	 *            : objet de type Location
	 */
	public void ajouterLocation(Location location) {
		locations.add(location);
	}

	/**
	 * ajouter un location dans la liste
	 * 
	 * @param location
	 *            ; objet de type Location
	 */
	public void supprimerLocation(Location location) {
		locations.remove(location);
	}

	/**
	 * Affiche les locations en cours dans la console
	 */
	public String AfficherLocationsEnCours(){
		//pour chaque location
		String res ="";
		for (Location loc : this.locations){
			//si la date de d�but est ant�rieur � la date actuel et la date de fin post�rieur � maintenant
			if( ((loc.getDateDebut().compareTo(new GregorianCalendar())) < 1) &&
				((loc.getDateFin().compareTo(new GregorianCalendar())) > 0 ) ){
				//afficher la location
				res += loc.toString() +"\n\n";
			}
		}
		return res;

	}
}
