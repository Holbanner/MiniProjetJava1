import java.util.Comparator;
/**
 * 
 * Permet de comparer un article via sa référence
 *
 */
public class ArticleReferenceComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return pArticle1.getRef().compareToIgnoreCase(pArticle2.getRef());
    }
 
}