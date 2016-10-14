
public class LocationSauvegarde extends Location{

	private Client client;

	public LocationSauvegarde(String dateDebut, String dateFin, float montant) {
		super(dateDebut, dateFin, montant);
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
