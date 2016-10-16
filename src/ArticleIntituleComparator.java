import java.util.Comparator;
 /**
  * 
  * Permet de comparer un article via son Intitule
  *
  */
public class ArticleIntituleComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return pArticle1.getIntitulé().compareTo(pArticle2.getIntitulé());
    }
}