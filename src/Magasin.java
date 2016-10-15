import java.util.ArrayList;
import java.util.Scanner;

public class Magasin {
	/*
	 * Attribut
	 */
	private String nom;
	// liste de client
	private ArrayList<Client> clients;
	// liste d'article
	private ArrayList<Article> articles;
	//utiliser pour le menu afin de récuperer les input
	private Scanner input = new Scanner(System.in);

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

	/** 
	 *  constructeur, avec deux possibilités. Le second est une surcharge du
	 * @param nom
	 * @param clients
	 * @param articles
	 */
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

	/** 
	 *  ajouter un client dans la liste
	 * @param client  
	 */
	public void ajouterClient(Client client) {
		clients.add(client);
	}

	/** 
	 * Supprimer un client dans la liste
	 * @param client
	 */
	public void supprimerClient(Client client) {
		clients.remove(client);
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
	 * methode permetant de quitter le menu
	 */
	private void exit() {
		System.out.println("Exiting...");
		System.exit(1);
	}
	
	/**
	 * créer et afficher le menu principale
	 */
	public void menuP() {
		System.out.println("\n\n-------------------------------------");
		System.out.println("|    Bienvenu dans le gestionnaire  |");
		System.out.println("|-----------------------------------|");
		System.out.println("|                                   |");
		System.out.println("|          Menu principal:          |");
		System.out.println("| 		 	----------              |");
		System.out.println("|                                   |");
		System.out.println("| 1.) Lister les articles           |");
		System.out.println("| 2.) Enregistrer une location      |");
		System.out.println("| 3.) Afficher les locations client |");
		System.out.println("| 4.) Terminer une location         |");
		System.out.println("| 5.) Calculer la recette mensuel   |");
		System.out.println("| 6.) Quitter!                      |");
		System.out.println("|                             v 1.0 |");
		System.out.println("-------------------------------------");

		int selection = input.nextInt();
		input.nextLine();
		// Chaque case correspond à une selection
		switch (selection) {
		case 1:
			//ici faire la magie choix 1 ex: client.sauvegarde();
			System.out.println("choix 1");
			break;
		case 2:
			//choix deux la vie de moi
			System.out.println("choix 2");
			break;
		case 3:
			System.out.println("choix 3");
			break;
		case 4:
			System.out.println("choix 4");
			break;
		case 5:
			System.out.println("choix 5");
			break;
		case 6:
			//pour faire appel à la méthode exit qui ferme le programme
			this.exit();
			break;
		default:
			// quand on choisie pas un bon chiffre
			System.out.println("Selection invalide.");
			break;
		}
	}
	
	public static void main(String[] args) {
		 Magasin magasin = new Magasin("carouf");
		  while (true)
		    magasin.menuP();
	}

}
