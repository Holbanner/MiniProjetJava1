

import javax.annotation.Generated;

import org.junit.Assert;
import org.junit.Test;

@Generated(value="org.junit-tools-1.0.3")
public class ArticleIntituleComparatorTest{

	private ArticleIntituleComparator createTestSubject()  {
	 return new ArticleIntituleComparator();
	}

	@Test
	public void testCompare() throws Exception {
	ArticleIntituleComparator testSubject;Article pArticle1 = null;
	Article pArticle2 = null;
	int result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.compare(pArticle1, pArticle2);
	} 
}