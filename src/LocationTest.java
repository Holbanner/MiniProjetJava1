

import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class LocationTest{

	private Location createTestSubject()  {
	 return new Location(new GregorianCalendar(), new GregorianCalendar(), 0, null);
	}


	@Test
	public void testGetArticlesBy() throws Exception {
	Location testSubject;String arg = "";
	
	
	// default test
	testSubject=createTestSubject();testSubject.getArticlesBy(arg);
	}

	@Test
	public void testToString() throws Exception {
	Location testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	}

}