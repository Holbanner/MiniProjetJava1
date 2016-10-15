

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest{

	private Client createTestSubject()  {
	 return new Client("", "", "", 0, null);
	}

	/*@Test
	public void testSaveCommande() throws Exception {
	Client testSubject;String sauvegarde = "";
	Location lSave = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.saveCommande(sauvegarde, lSave);
	}*/

	@Test
	public void testLoadCommande() throws Exception {
	Client testSubject;String sauvegarde = "";
	Location result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.loadCommande(sauvegarde);
	}

}