

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class Mat�rielTournageTest{

	private Mat�rielTournage createTestSubject()  {
	 return new Mat�rielTournage("", "", "", 0, 0, 0, 0);
	}

	@Test
	public void testGetX() throws Exception {
	Mat�rielTournage testSubject;int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getX();
	}

	@Test
	public void testSetX() throws Exception {
	Mat�rielTournage testSubject;int x = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setX(x);
	}

	@Test
	public void testGetY() throws Exception {
	Mat�rielTournage testSubject;int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.getY();
	}

	@Test
	public void testSetY() throws Exception {
	Mat�rielTournage testSubject;int y = 0;
	
	
	// default test
	testSubject=createTestSubject();testSubject.setY(y);
	}

	@Test
	public void testToString() throws Exception {
	Mat�rielTournage testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	} 
}