import java.util.ArrayList;
import java.util.Collections;
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

	public Client getClient(int index){
		return this.clients.get(index);
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
			menuP1();
			break;
		case 2:
			//choix deux la vie de moi
			System.out.println("2 : ");
			
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
	
	public void menuP1() {
		System.out.println("\n\n-------------------------------------");
		System.out.println("|        Liste des Articles         |");
		System.out.println("|-----------------------------------|");
		System.out.println("|                                   |");
		System.out.println("| 1.) Trier par référence           |");
		System.out.println("| 2.) Trier par marque              |");
		System.out.println("| 3.) Trier par intitulé            |");
		System.out.println("| 4.) Trier par prix par jour       |");
		System.out.println("| 5.) Retour                        |");
		System.out.println("|                             v 1.0 |");
		System.out.println("-------------------------------------");

		String selection = input.next();
		input.nextLine();
		// Chaque case correspond à une selection
		switch (selection) {
		case "1":
			//ici faire la magie choix 1 ex: client.sauvegarde();
			AfficherArticlesReference();
			System.out.println("Appuyer sur une touche pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "2":
			//choix deux la vie de moi
			AfficherArticlesMarque();
			System.out.println("Appuyer sur une touche pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "3":
			AfficherArticlesIntitule();
			System.out.println("Appuyer sur une touche pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "4":
			AfficherArticlesPrix();
			System.out.println("Appuyer sur une touche pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "5":
			menuP();
			break;
		default:
			// quand on choisie pas un bon chiffre
			System.out.println("Selection invalide.");
			menuP1();
			break;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new DispositifAcquisition("A123", "Adiddas", "EnormeAppareil", 20, 20, 2000000, new Resolution(1000, 2000), new TypeObjectif(100,500)));
		articles.add(new Fond("A1253", "Adiddas", "LeFondvert", 1, 10, 100, 200));

		Magasin magasin = new Magasin("carouf");
		magasin.setArticles(articles);
			while (true){
				magasin.menuP();
			}
	}
	
	public void AfficherClients(){
		int i =0;
		for(Client client : this.getClients()){
			System.out.println(i + " - " + client.toString());
			i++;
		}
	}
	
	public void AfficherArticlesIntitule(){
		Collections.sort(this.articles, new ArticleIntituleComparator());
		AfficherTousLesArticles();
	}
	
	public void AfficherArticlesMarque(){
		Collections.sort(this.articles, new ArticleMarqueComparator());
		AfficherTousLesArticles();
	}
	
	public void AfficherArticlesPrix(){
		Collections.sort(this.articles, new ArticlePrixComparator());
		AfficherTousLesArticles();
	}
	
	public void AfficherArticlesReference(){
		Collections.sort(this.articles, new ArticleReferenceComparator());	
		AfficherTousLesArticles();
	}

	public void AfficherTousLesArticles(){
		for(Article article : this.getArticles()){
			System.out.println(article.toString());
		}
	}
}
