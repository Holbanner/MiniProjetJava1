import java.util.Comparator;
/**
 * 
 * Permet de comparer un article via son prix
 *
 */
public class ArticlePrixComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return ((int)pArticle1.getPrixParJour() - (int)pArticle2.getPrixParJour());
    }
 
}