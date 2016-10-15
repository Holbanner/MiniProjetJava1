

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ResolutionTest{

	private Resolution createTestSubject()  {
	 return new Resolution();
	}

	@Test
	public void testGetX() throws Exception {
	Resolution testSubject;float result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getX();
	}

	@Test
	public void testSetX() throws Exception {
	Resolution testSubject;float x = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setX(x);
	}

	@Test
	public void testGetY() throws Exception {
	Resolution testSubject;float result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getY();
	}

	@Test
	public void testSetY() throws Exception {
	Resolution testSubject;float y = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setY(y);
	}

	@Test
	public void testToString() throws Exception {
	Resolution testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	} 
}