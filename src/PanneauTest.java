

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class PanneauTest{

	private Panneau createTestSubject()  {
	 return new Panneau("", "", "", 0, 0, 0);
	}

	@Test
	public void testGetNbLed() throws Exception {
	Panneau testSubject;int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getNbLed();
	}

	@Test
	public void testSetNbLed() throws Exception {
	Panneau testSubject;int nbLed = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setNbLed(nbLed);
	}

	@Test
	public void testToString() throws Exception {
	Panneau testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	} 
}