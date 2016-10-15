

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ArticleReferenceComparatorTest{

	private ArticleReferenceComparator createTestSubject()  {
	 return new ArticleReferenceComparator();
	}

	@Test
	public void testCompare() throws Exception {
	ArticleReferenceComparator testSubject;Article pArticle1 = null;
	Article pArticle2 = null;
	int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.compare(pArticle1, pArticle2);
	} 
}