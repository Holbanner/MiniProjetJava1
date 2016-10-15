

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class DispositifAcquisitionTest{

	private DispositifAcquisition createTestSubject()  {
	 return new DispositifAcquisition("", "", "", 0, 0, 0, null, null);
	}

	@Test
	public void testToString() throws Exception {
	DispositifAcquisition testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	} 
}