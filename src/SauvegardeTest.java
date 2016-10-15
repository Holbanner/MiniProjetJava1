

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class SauvegardeTest{

	private Sauvegarde createTestSubject()  {
	 return new Sauvegarde(0);
	}

	@Test
	public void testGetSauvegarde() throws Exception {
	int mois = 0;
	Sauvegarde result;
	
	// default test
	result=Sauvegarde.getSauvegarde(mois);
	}

	@Test
	public void testGetLocations() throws Exception {
	Sauvegarde testSubject;ArrayList<Location> result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getLocations();
	}

	@Test
	public void testSetLocations() throws Exception {
	Sauvegarde testSubject;ArrayList<Location> locations = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setLocations(locations);
	}

	@Test
	public void testGetMois() throws Exception {
	Sauvegarde testSubject;int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getMois();
	}

	@Test
	public void testSetMois() throws Exception {
	Sauvegarde testSubject;int mois = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setMois(mois);
	}

	@Test
	public void testAddLocation() throws Exception {
	Sauvegarde testSubject;Location location = null;
	Client client = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.addLocation(location, client);
	}

	@Test
	public void testRemoveLocation() throws Exception {
	Sauvegarde testSubject;Location location = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.removeLocation(location);
	}

	@Test
	public void testSave() throws Exception {
	Sauvegarde testSubject;
	
	// default test
	testSubject=createTestSubject();testSubject.save();
	}

	@Test
	public void testMain() throws Exception {
	String[] args = new String[]{""};
	
	
	// default test
	Sauvegarde.main(args);
	} 
}