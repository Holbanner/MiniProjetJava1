import java.util.Calendar;

/**
 * Cette classe sert � l'archivage, on veut garder la notion de client ratach� a une location donc on extends de location et on rajoute un attribut client.
 * @author Adrien
 *
 */
public class LocationSauvegarde extends Location{

	private Client client;

	public LocationSauvegarde(Calendar dateDebut, Calendar dateFin) {
		super(dateDebut, dateFin);
		// TODO Auto-generated constructor stub
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
