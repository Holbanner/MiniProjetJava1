

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ArticlePrixComparatorTest{

	private ArticlePrixComparator createTestSubject()  {
	 return new ArticlePrixComparator();
	}

	@Test
	public void testCompare() throws Exception {
	ArticlePrixComparator testSubject;Article pArticle1 = null;
	Article pArticle2 = null;
	int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.compare(pArticle1, pArticle2);
	} 
}