import java.sql.Date;
import java.util.ArrayList;


public class Location {
	/*
	 * Attribut
	 * */
	// dates de début et de fin de location au format date
	private Date dateDebut;
	private Date dateFin;
	//montant total facturé au client
	private float montant;
	//liste d'articles
	private ArrayList<Article> articles;

	/*
	 * Getter & Setter
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
}
