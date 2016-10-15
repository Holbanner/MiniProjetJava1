import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.*;

import org.apache.commons.lang3.time.DateUtils;

public class Location implements Serializable {
	/*
	 * Attribut
	 */
	// dates de d�but et de fin de location au format date
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
	 * constructeur, avec deux possibilit�s. Le second est une surcharge du
	 * 
	 * @param dateDebut
	 * @param dateFin
	 * @param montant
	 * @param articles
	 */
	// premier permettant d'ajouter des articles un par un au besoin

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
	// methodes

	/**
	 * calculer montant Location
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
	 * Retourne la liste d'articles de la location en triant par l'attribut
	 * d�sir�
	 * 
	 * @param arg
	 *            argument de tri
	 */
	public void getArticlesBy(String arg) {
		Comparator comparator;
		switch (arg) {
		case "marque":
			comparator = new ArticleMarqueComparator();
			break;

		case "intitul�":
			comparator = new ArticleIntituleComparator();
			break;

		case "prix":
			comparator = new ArticlePrixComparator();
			break;

		case "r�f�rence":
			comparator = new ArticleReferenceComparator();
			break;

		default:
			comparator = new ArticleReferenceComparator();
			break;
		}
		Collections.sort(this.articles, comparator);
	}

	public String toString() {
		String res = "Location : " + "\n";
		res += "	Date d�but : " + this.dateDebut.toString() + "\n";
		res += "	Date d�but : " + this.dateFin.toString() + "\n";
		res += "	Articles lou� : " + this.dateDebut.toString() + "\n";
		for (Article article : this.articles) {
			res += article.toString() + "\n" + "\n";
		}
		return res;

	}
}
