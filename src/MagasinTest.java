

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MagasinTest{

	private Magasin createTestSubject()  {
	 return new Magasin("", null, null);
	}

	@Test
	public void testGetNom() throws Exception {
	Magasin testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getNom();
	}

	@Test
	public void testSetNom() throws Exception {
	Magasin testSubject;String nom = "";
	
	
	// default test
	testSubject=createTestSubject();testSubject.setNom(nom);
	}

	@Test
	public void testGetClients() throws Exception {
	Magasin testSubject;ArrayList<Client> result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getClients();
	}

	@Test
	public void testSetClients() throws Exception {
	Magasin testSubject;ArrayList<Client> Clients = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setClients(Clients);
	}

	@Test
	public void testGetArticles() throws Exception {
	Magasin testSubject;ArrayList<Article> result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getArticles();
	}

	@Test
	public void testSetArticles() throws Exception {
	Magasin testSubject;ArrayList<Article> Articles = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setArticles(Articles);
	}

	@Test
	public void testAjouterClient() throws Exception {
	Magasin testSubject;Client client = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.ajouterClient(client);
	}

	@Test
	public void testSupprimerClient() throws Exception {
	Magasin testSubject;Client client = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.supprimerClient(client);
	}

	@Test
	public void testAjouterArticle() throws Exception {
	Magasin testSubject;Article article = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.ajouterArticle(article);
	}

	@Test
	public void testSupprimerArticle() throws Exception {
	Magasin testSubject;Article article = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.supprimerArticle(article);
	} 
}