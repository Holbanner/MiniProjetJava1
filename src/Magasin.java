import java.util.ArrayList;

public class Magasin {
	/*
	 * Attribut
	 * */
	private String nom;
	//liste de client
	private ArrayList<Client> clients;
	//liste d'article
	private ArrayList<Article> articles;

	/*
	 * Getter & Setter
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> Clients) {
		clients = Clients;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> Articles) {
		articles = Articles;
	}
	
}
