import java.util.Comparator;
 
public class ArticleReferenceComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return pArticle1.getRef().compareToIgnoreCase(pArticle2.getRef());
    }
 
}