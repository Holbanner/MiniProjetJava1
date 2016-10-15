

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MatérielTournageTest{

	private MatérielTournage createTestSubject()  {
	 return new MatérielTournage("", "", "", 0, 0, 0, 0);
	}

	@Test
	public void testGetX() throws Exception {
	MatérielTournage testSubject;int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getX();
	}

	@Test
	public void testSetX() throws Exception {
	MatérielTournage testSubject;int x = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setX(x);
	}

	@Test
	public void testGetY() throws Exception {
	MatérielTournage testSubject;int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getY();
	}

	@Test
	public void testSetY() throws Exception {
	MatérielTournage testSubject;int y = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setY(y);
	}

	@Test
	public void testToString() throws Exception {
	MatérielTournage testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	} 
}