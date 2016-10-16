import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

public class Location implements Serializable {
	/*
	 * Attribut
	 */
	// dates de dï¿½but et de fin de location au format date
	private Calendar  dateDebut;
	private Calendar  dateFin;
	// liste d'articles
	private ArrayList<Article> articles;

	/*
	 * Getter & Setter
	 */
	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	/**
	 * constructeur, avec deux possibilitï¿½s. Le second est une surcharge du premier permettant d'ajouter des articles un par un au besoin
	 * 
	 * @param dateDebut
	 * @param dateFin
	 * @param montant
	 * @param articles
	 */
	public Location(Calendar dateDebut, Calendar dateFin, ArrayList<Article> articles) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.articles = articles; 

	}

	public Location(Calendar dateDebut, Calendar dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.articles = new ArrayList<Article>();

	}
	/*
	 *  Méthodes
	 */

	/**
	 * calcule le montant de la Location
	 */
	public float calculerMontant() {

		long millisA = this.getDateDebut().getTimeInMillis();
        long millisB = this.getDateFin().getTimeInMillis();

        long difMillis = millisB -millisA;

        float resultat;
        float prix = 0;
        
        long difEnJour = difMillis / (24*60*60*1000);
        resultat = (int) difEnJour;
        
        for (Article article : this.getArticles()){
        	prix += article.getPrixParJour();
        }
        return resultat*prix;
		
	}

	/**
	 * ajouter un Article dans la liste
	 * 
	 * @param article
	 */
	public void ajouterArticle(Article article) {
		articles.add(article);
	}

	/**
	 * Supprimer un Article dans la liste
	 * 
	 * @param article
	 */
	public void supprimerArticle(Article article) {
		articles.remove(article);
	}

	/**
	 * Test si la location est entre les deux dates demandé (on regarde la date de début)
	 * @param date1
	 * @param date2
	 * @return
	 */
	public boolean estEntre(Calendar date1, Calendar date2){
		//on considère que le paiment s'éffectue lors de la date de début de la location
		//si le timestamp est entre les deux autres on renvoie true
		if(this.getDateDebut().getTimeInMillis() > date1.getTimeInMillis() && this.getDateDebut().getTimeInMillis() < date2.getTimeInMillis()){
			return true;
		}
		return false;
		
		
	}
	/**
	 * Retourne les infos
	 */
	public String toString() {
		String res = "Location : " + "\n";
		res += "	Date dï¿½but : " + this.dateDebut.toString() + "\n";
		res += "	Date dï¿½but : " + this.dateFin.toString() + "\n";
		res += "	Articles louï¿½ : " + this.dateDebut.toString() + "\n";
		for (Article article : this.articles) {
			res += article.toString() + "\n" + "\n";
		}
		return res;
	}
}
