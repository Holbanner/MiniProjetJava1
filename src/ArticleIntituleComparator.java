import java.util.Comparator;
 
public class ArticleIntituleComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return pArticle1.getIntitul�().compareTo(pArticle2.getIntitul�());
    }
}