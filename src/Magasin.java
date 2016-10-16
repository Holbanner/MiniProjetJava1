import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Magasin implements Serializable{
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
	
	public Article getArticle(int index){
		return this.articles.get(index);
	}
	
	/**
	 * methode permetant de quitter le menu
	 */
	private void exit() {
		System.out.println("Exiting...");
		this.save("jeuDeTest");
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
		System.out.println("| 3.) Lister locations en cours     |");
		System.out.println("| 4.) Terminer une location         |");
		System.out.println("| 5.) Recette d'une période         |");
		System.out.println("| 6.) Quitter!                      |");
		System.out.println("|                             v 1.0 |");
		System.out.println("-------------------------------------");

		String selection = input.next();
		input.nextLine();
		// Chaque case correspond à une selection
		switch (selection) {
		case "1":
			//ici faire la magie choix 1 ex: client.sauvegarde();
			menuP1();
			break;
		case "2":
			//choix deux la vie de moi
			menuP2();
			
			break;
		case "3":
			menuP3();
			break;
		case "4":
			menuP4();
			break;
		case "5":
			menuP5();
			break;
		case "6":
			//pour faire appel à la méthode exit qui ferme le programme
			this.exit();
			break;
		default:
			// quand on choisie pas un bon chiffre
			System.out.println("Selection invalide.");
			menuP();
			break;
		}
	}
	/**
	 * créer et afficher le menu pour lister les articles
	 */
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
			AfficherArticlesReference();
			System.out.println("Appuyer sur une entrer pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "2":
			AfficherArticlesMarque();
			System.out.println("Appuyer sur une entrer pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "3":
			AfficherArticlesIntitule();
			System.out.println("Appuyer sur une entrer pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "4":
			AfficherArticlesPrix();
			System.out.println("Appuyer sur une entrer pour continuer...");
			input.nextLine();
			menuP1();
			break;
		case "5":
			//retour au menu principal
			menuP();
			break;
		default:
			// quand on choisie pas un bon chiffre
			System.out.println("Selection invalide.");
			menuP1();
			break;
		}
	}
	/**
	 * créer et afficher le menu d'enregistrement d'une location
	 */
	public void menuP2() {
		System.out.println("\n\n-------------------------------------");
		System.out.println("|      Enregistrer une location     |");
		System.out.println("|-----------------------------------|");
		System.out.println("|                                   |");
		System.out.println("| 1.) Selectionner un client        |");
		System.out.println("| 2.) Créer un client               |");
		System.out.println("| 3.) Retour                        |");
		System.out.println("|                             v 1.0 |");
		System.out.println("-------------------------------------");

		String selection = input.next();
		input.nextLine();

		//une location appartient à un client on doit donc créer un client ou bien le choisir dans une liste
		switch (selection) {
		case "1":
			
			//on va au sous menu pour enregistrer la location
			menuP22();
			break;
		case "2":
			//on créer le client
			ajouterClientPrompt();
			break;
		case "3":
			//le retour au menu principal
			menuP();
			break;
		default:
			// quand on choisie pas un bon chiffre
			System.out.println("Selection invalide.");
			menuP2();
			break;
		}
	}
	/**
	 * Permet d'afficher les consignes pour créer un client, puis le créer
	 */
	private void ajouterClientPrompt() {
		
		System.out.println("Saissisez nom,prénom,coordonné,numéro de tel du client dans cet ordre séparé de virgule :");
		String selection = input.next();
		String tab[] = selection.split(",");
		try{
			this.ajouterClient(new Client(tab[0],tab[1],tab[2],tab[3]));
			System.out.println("Client créer.");
		}catch(Exception e){
			System.out.println("Selection invalide.");
			
		}
		//on retourne au menu d'enregistrement d'une location
		this.menuP2();
	}

	/**
	 * Permet d'afficher les consignes et d'enregistrer une location.
	 */
	private void menuP22() {
		//on affiche les client pour pouvoir les selectionner
		AfficherClients();
		System.out.println("Saissisez le client par son n° :");
		String selection = input.next();
		Client client = new Client();
		try{
			client = this.getClient(Integer.parseInt(selection));
		}catch(Exception e){
			System.out.println("Saisie invalide.");
			menuP2();
		}
			//on essaye de récupérer le client
			
			Calendar dateDebut = new GregorianCalendar();

			//on demande la date de début
			System.out.println("Saissisez la date de début au format jj/MM/aaaa");
			input.nextLine();
			selection = input.next();
			String tab[] = selection.split("/");
			int j,M,a;
			try{
				//on essaye de créer la date demandé
				j = Integer.parseInt(tab[0]);
				M = Integer.parseInt(tab[1]);
				a = Integer.parseInt(tab[2]);
				dateDebut = new GregorianCalendar(a,M-1,j);
			}catch(NumberFormatException e){
				//si la saisie est mauvaise
				System.out.println("Saisie invalide.");
				this.menuP2();
			}catch (Exception e) {
				//si la saisie est mauvaise
				System.out.println("Saisie invalide.");
				this.menuP2();
			}
			
			//on récupère la date de fin
			Calendar dateFin = new GregorianCalendar();
			System.out.println("Saissisez la date de fin au format jj/MM/aaaa");
			input.nextLine();
			selection = input.next();
			tab = selection.split("/");
			try{
				//on essaye de la créer
				j = Integer.parseInt(tab[0]);
				M = Integer.parseInt(tab[1]);
				a = Integer.parseInt(tab[2]);
				dateFin = new GregorianCalendar(a,M-1,j);
			}catch(NumberFormatException e){
				//si la saisie est mauvaise retour à la case départ
				System.out.println("Saisie invalide.");
				this.menuP2();
			}catch (Exception e) {
				//si la saisie est mauvaise
				System.out.println("Saisie invalide.");
				this.menuP2();
			}
			
			//on affiche les articles avec un n° pour pouvoir les choisir 
			this.AfficherChoixArticles();
			System.out.println("Séléctionner les articles de la location en utilisant leur numéro et en les séparent d'une virgule ex:1,12,3");
			input.nextLine();
			selection = input.next();
			ArrayList<Article> listeArticle = new ArrayList<Article>();
			tab = selection.split(",");
			//on récupère les articles un a un si il n'y a pas d'erreur
			for(String numArticle : tab){
				try{
					listeArticle.add(this.getArticle(Integer.parseInt(numArticle)));
				}catch(Exception e){
					//Mauvaise saisie on retourne au menu précédent
					System.out.println("Saisie invalide.");
					this.menuP2();
				}
			}
			
			//on créer la location
			Location loc = new Location(dateDebut, dateFin, listeArticle);
			//on l'ajoute au client
			client.ajouterLocation(loc);
			System.out.println("Location ajouté.");
			//on retourne le montant
			System.out.println("Montant de la location : " + loc.calculerMontant());
			
		//on retourne au précédent menu
		menuP2();
	}

	/**
	 * Liste les locations en cours pour un client
	 */
	public void menuP3() {
		//on a besoin de savoir quel client est en question, on les propose
		AfficherClients();
		System.out.println("\n\n" + "Saissisez le n° du client dont vous voulez voir les locations.");

		String selection = input.next();

		
		try{
			//on trouve le client et on affiche ses locations en cours
			System.out.println(this.getClient(Integer.parseInt(selection)).AfficherLocationsEnCours());
		}catch(Exception e){
			System.out.println("Selection invalide.");
		}
		//on retourne au menu principal
		System.out.println("Appuyer sur entrer pour continuer");
		input.nextLine();
		input.nextLine();

		menuP();
	}
	
	/**
	 * Permet d'archiver une location (lorsque le client rend les Articles)
	 */
	public void menuP4() {
		//on a besoin de savoir qui est le client, on propose donc de le séléctionner dans la liste
		AfficherClients();
		System.out.println("\n\n" + "Saissisez le n° du client dont vous voulez archiver la locations.");

		String selection = input.next();
		input.nextLine();
		
		Client client = new Client();
		try{
			//on essaye de le recupérer
			client = this.getClient(Integer.parseInt(selection));
		}catch(Exception e){
			System.out.println("Selection invalide.");
			menuP();
		}
		
	
		int i = 0;
		for(Location loc : client.getLocations()){
			System.out.println("N° " + i + loc.toString());
			i++;
		}
		System.out.println("\n\n" + "Saissisez le n° de la location que vous voulez archiver.");
		selection = input.next();
		input.nextLine();
		try{
			//on éssaye de recupérer la location
			Location loc = client.getLocation(Integer.parseInt(selection));
			try{
				//puis on l'archive
				client.saveLocation(loc);
			}catch(Exception e){
				System.out.println("\n\n" + "Location passs archivé.");

			}
			System.out.println("\n\n" + "Location archivé.");
		}catch(Exception e){
			System.out.println("Selection invalide.");
			menuP();

		}

		
		menuP();
	}
	/**
	 * Affiche les recettes entre deux dates
	 */
	public void menuP5() {
		//on demande la 1ère date
		System.out.println("\n\n" + "Saissisez une date de début au format jj/MM/yyyy.");
		String selection = input.next();
		String cal1txt = selection;
		input.nextLine();
		String tab[];
		Calendar dateDebut = new GregorianCalendar();
		Calendar dateFin = new GregorianCalendar();
		try{
			//on éssaye de parser la première date
			tab = selection.split("/");
			dateDebut = new GregorianCalendar(Integer.parseInt(tab[2]), Integer.parseInt(tab[1])-1, Integer.parseInt(tab[0]));
		}catch(Exception e){
			System.out.println("Saisie invalide.");
			menuP();
		}
		
		//on demande la 2ème date
		System.out.println("\n\n" + "Saissisez une date de fin au format jj/MM/yyyy.");
		selection = input.next();
		String cal2txt = selection;
		input.nextLine();
		try{
			//on éssaye de parser la première date
			tab = selection.split("/");
			dateFin = new GregorianCalendar(Integer.parseInt(tab[2]), Integer.parseInt(tab[1])-1, Integer.parseInt(tab[0]));
			
			if(dateFin.getTimeInMillis() <= dateDebut.getTimeInMillis()){
				//si la date de fin est plus petite que la date de début c'est une mauvaise saisie donc on retourne au menu principal
				System.out.println("Saisie invalide.");
				menuP();
			}
		}catch(Exception e){
			System.out.println("Saisie invalide.");
			menuP();
		}
		
		float res = 0;
		//on calcul le montant entre ces deux date pour chaque location de chaque client 
		for(Client client : this.clients){
			res += client.getMontantTotalEntre(dateDebut, dateFin);
		}
		
		//on calcul le montant entre ces deux date pour chaque location de chaque fichier de sauvegarde (les location archivé)
		
		File f = new File(".");
		//on veut tous les fichier de sauvegarde
		Pattern pattern = Pattern.compile("[0-9]{6}");
	    Matcher matcher;
		for(String s : f.list()){
			//pour chaque fichier de sauvegarde 
			matcher = pattern.matcher(s);
			if(matcher.find()){
				for(Location loc : Sauvegarde.getSauvegarde(s).getLocations()){
					//on récupère ou pas le montant de chaque location contenue dans le fichier
					if(loc.estEntre(dateDebut, dateFin)){
						res += loc.calculerMontant();
					}
				}
			}
		}
		
		
		//on affiche le résultat
		System.out.println("\n\n" + "Chiffre d'affaire entre " + cal1txt + " et " + cal2txt + " est de " + res +"€");
		input.nextLine();
		menuP();
	}
	
	public static void main(String[] args) {
		
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new DispositifAcquisition("A123", "Adiddas", "EnormeAppareil", 20, 20, 2000000, new Resolution(1000, 2000), new TypeObjectif(100,500)));
		articles.add(new Fond("A1253", "Adiddas", "LeFondvert", 1, 10, 100, 200));
		articles.add(new DispositifAcquisition("OSS117", "Levis", "Jean-dj", 20, 20, 2000000, new Resolution(1000, 2000), new TypeObjectif(100,500)));
		articles.add(new Fond("A1153", "Airness", "LeFondBleu", 1, 10, 100, 200));
		articles.add(new Panneau("SA1212", "Mairie de Rennes", "STOP", 20, 50, 50));
		articles.add(new Panneau("SA1212", "Mairie de Rennes", "Kenavo", 20, 50, 50));
		articles.add(new Reflecteur("S2154115", "Arlequin", "boom-blanc", 1000, 2, 200, 200));

		Client platini = new Client("Platini", "Michou","20 rue jean", "12132132");
		
		Location location = new Location(new GregorianCalendar(2016,9,10), new GregorianCalendar(2016,9,25), articles);
		platini.ajouterLocation(location);
		location = new Location(new GregorianCalendar(2016,9,1), new GregorianCalendar(2016,9,20), articles);
		platini.ajouterLocation(location);

		ArrayList<Client> client = new ArrayList<Client>();
		client.add(platini);
		client.add(new Client("Yves", "Zenelse","20 rue anne", "12132132"));
		client.add(new Client("Bambelle", "Larry","2 rue jean", "12132132"));
		client.add(new Client("Kan", "Jerry","20 rue je", "12132132"));
		client.add(new Client("Bon", "Jean","20 rue an", "12132132"));
		client.add(new Client("Raid", "Aldo","20 rue janne", "12132132"));
		
		Magasin magasin = new Magasin("carouf");
		
		magasin.setArticles(articles);
		magasin.setClients(client);
		
		magasin.load("jeuDeTest");
		while (true){
			magasin.menuP();
		}
	}
	
	/**
	 * Affiche tous les clients du magasin avec un n° associé à leur place dans l'arraylist
	 */
	public void AfficherClients(){
		int i = 0;
		for(Client client : this.getClients()){
			System.out.println(i + " - " + client.toString());
			i++;
		}
	}
	/**
	 * Affiche les article après les avoir trié par Intitulé
	 */
	public void AfficherArticlesIntitule(){
		Collections.sort(this.articles, new ArticleIntituleComparator());
		AfficherTousLesArticles();
	}
	/**
	 * Affiche les article après les avoir trié par Marque
	 */
	public void AfficherArticlesMarque(){
		Collections.sort(this.articles, new ArticleMarqueComparator());
		AfficherTousLesArticles();
	}
	/**
	 * Affiche les article après les avoir trié par Prix par jour
	 */
	public void AfficherArticlesPrix(){
		Collections.sort(this.articles, new ArticlePrixComparator());
		AfficherTousLesArticles();
	}
	
	/**
	 * Affiche les article après les avoir trié par Référence
	 */
	public void AfficherArticlesReference(){
		Collections.sort(this.articles, new ArticleReferenceComparator());	
		AfficherTousLesArticles();
	}

	/**
	 * Affiche les article après les articles
	 */
	public void AfficherTousLesArticles(){
		for(Article article : this.getArticles()){
			System.out.println(article.toString());
		}
	}
	
	/**
	 * Affiche les article en leur associant un n° correspondant à leur index dans l'arrylist
	 */
	public void AfficherChoixArticles(){
		Collections.sort(this.articles, new ArticleIntituleComparator());
		int i=0;
		for(Article article : this.getArticles()){
			System.out.println("N°"+i+"\n"+article.toString());
			i++;
		}
	}
	
	/**
	 * charge un jeu de donné test enregistré dans le fichier
	 * @param file fichier ou est enregistré le jeu de données
	 */
	public void load(String file){
		
		try {//si on arrive à trouver le fichier on le charge
			FileInputStream fileIn = new FileInputStream(file);

			ObjectInputStream in = new ObjectInputStream(fileIn);
			Magasin mag = (Magasin)in.readObject();
			this.setArticles(mag.getArticles());
			this.setClients(mag.getClients());
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {} catch (ClassNotFoundException e) {} catch (IOException e) {}
		
	}
	
	/**
	 * Sauvegarde le jeu de donnée dans un fichier
	 * @param file fichier ou l'on sauvegarde le jeu de donnée
	 */
	public void save(String file){
		try {
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			//on écrit dans le fichier le magasin 
			out.writeObject(this);
			out.close();
			fileOut.close();			
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
