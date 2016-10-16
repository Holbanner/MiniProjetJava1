import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Cette classe sert à l'archivage, on veut garder la notion de client rataché a une location donc on extends de location et on rajoute un attribut client.
 * @author Adrien
 *
 */
public class MagasinSauvegarde implements Serializable{

	private String nom;
	// liste de client
	private ArrayList<Client> clients;
	// liste d'article
	private ArrayList<Article> articles;
	
	public MagasinSauvegarde(String nom2, ArrayList<Client> clients2, ArrayList<Article> articles2) {
		this.setArticles(articles2);
		this.setClients(clients2);
		this.setNom(nom2);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	public ArrayList<Article> getArticles() {
		return articles;
	}
	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}

	
}
