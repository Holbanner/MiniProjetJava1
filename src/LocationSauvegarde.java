import java.util.Calendar;

/**
 * Cette classe sert à l'archivage, on veut garder la notion de client rataché a une location donc on extends de location et on rajoute un attribut client.
 * @author Adrien
 *
 */
public class LocationSauvegarde extends Location{

	private Client client;

	public LocationSauvegarde(Location location) {
		super(location.getDateDebut(), location.getDateFin(), location.getArticles());
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
