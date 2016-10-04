import java.util.ArrayList;

public class Magasin {
	/*
	 * Attribut
	 */
	private String nom;
	// liste de client
	private ArrayList<Client> clients;
	// liste d'article
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

	// constructeur, avec deux possibilités. Le second est une surcharge du
	// premier permettant d'ajouter des clients et des articles un par un au
	// besoin

	public Magasin(String nom, ArrayList<Client> clients, ArrayList<Article> articles) {
		super();
		this.nom = nom;
		this.clients = clients;
		this.articles = articles;
	}

	public Magasin(String nom) {
		super();
		this.nom = nom;
		this.clients = new ArrayList<Client>();
		this.articles = new ArrayList<Article>();
	}

	// Methodes

	// ajouter un client dans la liste
	public void ajouterClient(Client client) {
		clients.add(client);
	}

	// Supprimer un client dans la liste
	public void supprimerClient(Client client) {
		clients.remove(client);
	}

	// ajouter un Article dans la liste
	public void ajouterArticle(Article article) {
		articles.add(article);
	}

	// Supprimer un Article dans la liste
	public void supprimerArticle(Article article) {
		articles.remove(article);
	}

}
