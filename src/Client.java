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
	private String prénom;
	private String coordonné;
	private String numero;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public ArrayList<Location> getLocations() {
		return locations;
	}

	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}
	
	public Location getLocation(int index){
		return this.getLocations().get(index);
	}

	/*
	 * Constructeurs
	 */
	
	/**
	 * constructeur, avec deux possibilités. Le second est une surcharge du premier permettant d'ajouter des Locations une par une au besoin
	 * 
	 * @param nom
	 *            :nom client
	 * @param prénom
	 *            : prénom client
	 * @param coordonné
	 *            : coordonnés client
	 * @param numero
	 *            : numero client
	 * @param locations
	 *            : ArrayList des locations du client
	 */
	public Client(String nom, String prénom, String coordonné, String numero, ArrayList<Location> locations) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.coordonné = coordonné;
		this.numero = numero;
		this.locations = locations;
	}

	public Client(String nom, String prénom, String coordonné, String numero) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.coordonné = coordonné;
		this.numero = numero;
		this.locations = new ArrayList<Location>();
	}

	/* 
	 * Méthodes
	 */
	
	/**
	 * Methode qui stock les locations dans un fichier binaire.
	 * 
	 * @param sauvegarde
	 * @throws IOException
	 */
	 public void saveLocation(Location lSave){
		Sauvegarde.getSauvegarde(lSave.getDateFin()).addLocation(lSave, this);
		this.supprimerLocation(lSave);
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
			//si la date de début est antérieur à la date actuel et la date de fin postérieur à maintenant
			if( ((loc.getDateDebut().compareTo(new GregorianCalendar())) < 1) &&
				((loc.getDateFin().compareTo(new GregorianCalendar())) > 0 ) ){
				//afficher la location
				res += loc.toString() +"\n\n";
			}
		}
		return res;

	}
	
	/**
	 * Retourne une présentation sommaire du client (son nom puis son prénom
	 */
	public String toString(){
		return this.nom +" "+ this.prénom +"\n";
	}
	
	/**
	 * Calcul le montant à payer par le client pour ses location entre deux dates pécise
	 * @param date1
	 * @param date2
	 * @return montant
	 */
	public float getMontantTotalEntre(Calendar date1, Calendar date2){
		float res = 0;
		for( Location loc : locations ){
			if(loc.estEntre(date1, date2)){
				res += loc.calculerMontant();
			}
		}
		return res;
	}
}
