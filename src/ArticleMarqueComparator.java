import java.util.Comparator;
 
/**
 * 
 * Permet de comparer un article via sa Marque 
 *
 */
public class ArticleMarqueComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return pArticle1.getMarque().compareTo(pArticle2.getMarque());
    }
}