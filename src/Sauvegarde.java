import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Classe d'archivage, pour chaque fichier archive on instancie une sauvegarde, et on charge/enregistre ce même objet dans le fichier
 * @author Adrien
 *
 */
public class Sauvegarde implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<LocationSauvegarde> locations;
	private Calendar cal;

	public void addLocationList(LocationSauvegarde loc){
		ArrayList<LocationSauvegarde> liste = this.getLocations();
		liste.add(loc);
	}
	
	public Sauvegarde(Calendar cal){
		this.setCal(cal);
		this.setLocations(new ArrayList<LocationSauvegarde>());
	}
	/**
	 * Permet de récuperer une instante de Sauvegarde correspondant à un moi et une année (une date) ; et enregistré dans un fichier
	 * @param cal la date 
	 * @return
	 */
	public static Sauvegarde getSauvegarde(Calendar cal){
		Sauvegarde sauvegarde;
		try {//si on arrive à trouver le fichier on le charge
			FileInputStream fileIn = new FileInputStream(cal.get(Calendar.YEAR)+""+cal.get(Calendar.MONTH)+".loc");

			ObjectInputStream in = new ObjectInputStream(fileIn);
			//on récupère l'objet
			sauvegarde = (Sauvegarde) in.readObject();
			in.close();
			fileIn.close();
		} catch (Exception e) {
			sauvegarde = new Sauvegarde(cal);
		}
		
		return sauvegarde;
	}
	
	/**
	 *	Permet de récuperer une instante de Sauvegarde correspondant à un fichier
	 * @param file
	 * @return
	 */
	public static Sauvegarde getSauvegarde(String file){
		Sauvegarde sauvegarde;
		try {//si on arrive à trouver le fichier on le charge
			FileInputStream fileIn = new FileInputStream(file);

			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			sauvegarde = (Sauvegarde) in.readObject();
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {//sinon on créé une nouvelle sauvegarde
			Calendar cal = new GregorianCalendar();
			sauvegarde = new Sauvegarde(cal);
		} catch (ClassNotFoundException e) {
			Calendar cal = new GregorianCalendar();
			sauvegarde = new Sauvegarde(cal);
			e.printStackTrace();
		} catch (IOException e) {
			Calendar cal = new GregorianCalendar();
			sauvegarde = new Sauvegarde(cal);
			e.printStackTrace();
		}
		
		return sauvegarde;
	}
	
	
	public ArrayList<LocationSauvegarde> getLocations() {
		return this.locations;
	}
	public void setLocations(ArrayList<LocationSauvegarde> locations) {
		this.locations = locations;
	}
	public Calendar getCal() {
		return cal;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	/**
	 * Archive une location
	 * @param location
	 * @param client
	 */
	public void addLocation(Location location, Client client){
		LocationSauvegarde locationSauvegarde = new LocationSauvegarde(location);
		locationSauvegarde.setClient(client);
		this.addLocationList(locationSauvegarde);
		
		this.save();
	}
	/**
	 * Dé-archive une location
	 * @param location
	 */
	public void removeLocation(Location location){
		this.locations.remove(location);
		this.save();
	}
	
	/**
	 * Archive (écrit le fichier)
	 */
	public void save(){
		try {
			FileOutputStream fileOut = new FileOutputStream(cal.get(Calendar.YEAR)+""+cal.get(Calendar.MONTH)+".loc");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
			fileOut.close();			
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

}
