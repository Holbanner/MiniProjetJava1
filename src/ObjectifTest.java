

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ObjectifTest{

	private Objectif createTestSubject()  {
	 return new Objectif("", "", "", 0, 0);
	}

	@Test
	public void testGetDispositifAcquisitions() throws Exception {
	Objectif testSubject;HashSet<DispositifAcquisition> result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getDispositifAcquisitions();
	}

	@Test
	public void testSetDispositifAcquisitions() throws Exception {
	Objectif testSubject;HashSet<DispositifAcquisition> dispositifAcquisitions = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setDispositifAcquisitions(dispositifAcquisitions);
	}

	@Test
	public void testGetTypeObjectif() throws Exception {
	Objectif testSubject;TypeObjectif result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getTypeObjectif();
	}

	@Test
	public void testSetTypeObjectif() throws Exception {
	Objectif testSubject;TypeObjectif typeObjectif = null;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setTypeObjectif(typeObjectif);
	} 
}