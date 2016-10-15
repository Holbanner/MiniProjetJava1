

import static org.junit.Assert.*;

import java.util.*;

import javax.annotation.*;

import org.junit.Assert;
import org.junit.Test;

public class ArticleTest{

	private Article createTestSubject()  {
	 return new Article("reffff", "adidas", "chaussure", 10, 20);
	}

	@Test
	public void testToString() throws Exception {
	Article testSubject;String result;
	
	// default test
	testSubject=createTestSubject();result=testSubject.toString();
	
	String res = "			Référence : reffff\n";
	res += "			Intitulé : chaussure\n";
	res += "			Marque : adidas\n";
	res += "			Prix par jour : 10.0\n";
	res += "			Nombre disponible : 20\n";
	assertEquals(res, result);
	} 
}