import java.sql.Date;
import java.util.GregorianCalendar;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Location {
	/*
	 * Attribut
	 */
	// dates de début et de fin de location au format date
	private GregorianCalendar dateDebut;
	private GregorianCalendar dateFin;
	// montant total facturé au client
	private float montant;
	// liste d'articles
	private ArrayList<Article> articles;

	/*
	 * Getter & Setter
	 */
	public GregorianCalendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(GregorianCalendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public GregorianCalendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(GregorianCalendar dateFin) {
		this.dateFin = dateFin;
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

	public Location(GregorianCalendar dateDebut, GregorianCalendar dateFin, float montant, ArrayList<Article> articles) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montant = montant;
		this.articles = articles;

	}

	public Location(GregorianCalendar dateDebut, GregorianCalendar dateFin, float montant) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
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
}
