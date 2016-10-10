import java.util.Comparator;
 
public class ArticlePrixComparator implements Comparator<Article> {
 
    public int compare(Article pArticle1, Article pArticle2) {
        return ((int)pArticle1.getPrixParJour() - (int)pArticle2.getPrixParJour());
    }
 
}