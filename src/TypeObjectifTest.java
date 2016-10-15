

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class TypeObjectifTest{

	private TypeObjectif createTestSubject()  {
	 return new TypeObjectif();
	}

	@Test
	public void testToString() throws Exception {
	TypeObjectif testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	} 
}