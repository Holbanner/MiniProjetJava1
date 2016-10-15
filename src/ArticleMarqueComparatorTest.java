

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class ArticleMarqueComparatorTest{

	private ArticleMarqueComparator createTestSubject()  {
	 return new ArticleMarqueComparator();
	}

	@Test
	public void testCompare() throws Exception {
	ArticleMarqueComparator testSubject;Article pArticle1 = null;
	Article pArticle2 = null;
	int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.compare(pArticle1, pArticle2);
	} 
}