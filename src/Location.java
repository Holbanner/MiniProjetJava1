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
	// dates de début et de fin de location au format date
	private DateUtils dateDebut;
	private DateUtils dateFin;
	// montant total facturé au client
	private float montant;
	// liste d'articles
	private ArrayList<Article> articles;

	/*
	 * Getter & Setter
	 */
	public DateUtils getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(DateUtils dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	public void setDateDebut(String dateDebut) {
		try {
			this.dateDebut.parseDate(dateDebut, "dd/mm/yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DateUtils getDateFin() {
		return dateFin;
	}

	public void setDateFin(DateUtils dateFin) {
		this.dateFin = dateFin;
	}

	public void setDateFin(String dateFin) {
		try {
			this.dateFin.parseDate(dateFin, "dd/mm/yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	/** 
	 *  constructeur, avec deux possibilités. Le second est une surcharge du
	 * @param dateDebut
	 * @param dateFin
	 * @param montant
	 * @param articles
	 */
	// premier permettant d'ajouter des articles un par un au besoin

	public Location(DateUtils dateDebut, DateUtils dateFin, float montant, ArrayList<Article> articles) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montant = montant;
		this.articles = articles;

	}
	
	public Location(String dateDebut, String dateFin, float montant, ArrayList<Article> articles) {
		super();
		try {
			this.dateDebut.parseDate(dateDebut, "dd/mm/yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.dateFin.parseDate(dateFin, "dd/mm/yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.montant = montant;
		this.articles = articles;

	}

	public Location(DateUtils dateDebut, DateUtils dateFin, float montant) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montant = montant;
		this.articles = new ArrayList<Article>();

	}
	
	public Location(String dateDebut, String dateFin, float montant) {
		super();
		try {
			this.dateDebut.parseDate(dateDebut, "dd/mm/yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.dateFin.parseDate(dateFin, "dd/mm/yyyy");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.montant = montant;
		this.articles = new ArrayList<Article>();

	}

	// methodes

	/** 
	 * calculer montant Location
	 */
	public void calculerMontant(){
		
	}
		
	/** 
	 *  ajouter un Article dans la liste
	 * @param article
	 */
	public void ajouterArticle(Article article) {
		articles.add(article);
	}

	/** 
	 *  Supprimer un Article dans la liste
	 * @param article
	 */
	public void supprimerArticle(Article article) {
		articles.remove(article);
	}
	
	

	/**
	 * Retourne la liste d'articles de la location en triant par l'attribut désiré 
	 * @param arg argument de tri
	 */
	public void getArticlesBy(String arg){
		Comparator comparator;
		switch (arg) {
		case "marque":	
			comparator = new ArticleMarqueComparator();
		break;
			
		case "intitulé":
			comparator = new ArticleIntituleComparator();
		break;
		
		case "prix":
			comparator = new ArticlePrixComparator();
		break;

		case "référence":
			comparator = new ArticleReferenceComparator();
		break;


		default:
			comparator = new ArticleReferenceComparator();
		break;
		}
		Collections.sort(this.articles, comparator);
	}
	
	public String toString(){
		String res="Location : "+"\n";
		res += "	Date début : " + this.dateDebut.toString()+"\n";
		res += "	Date début : " + this.dateFin.toString()+"\n";
		res += "	Articles loué : " + this.dateDebut.toString()+"\n";
		for (Article article : this.articles){
			res += article.toString()+"\n"+"\n";
		}
		return res;

	}

	public int getLastMonth(){
		Calendar cal = Calendar.getInstance();
		cal.setTime((Date)this.getDateFin());
		int month = cal.get(Calendar.MONTH);
	}
}
