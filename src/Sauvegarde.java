import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Classe d'archivage, pour chaque fichier archive on instancie une sauvegarde, et on charge/enregistre ce même objet dans le fichier
 * @author Adrien
 *
 */
public class Sauvegarde {

	private ArrayList<Location> Locations;
	private Calendar cal;

	public Sauvegarde(Calendar cal){
		this.setCal(cal);		
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
		} catch (FileNotFoundException e) {//sinon on créé une nouvelle sauvegarde
			sauvegarde = new Sauvegarde(cal);
		} catch (ClassNotFoundException e) {
			sauvegarde = new Sauvegarde(cal);
			e.printStackTrace();
		} catch (IOException e) {
			sauvegarde = new Sauvegarde(cal);
			e.printStackTrace();
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
			FileInputStream fileIn = new FileInputStream(file+".loc");

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
	
	
	public ArrayList<Location> getLocations() {
		return Locations;
	}
	public void setLocations(ArrayList<Location> locations) {
		Locations = locations;
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
		LocationSauvegarde locationSauvegarde = (LocationSauvegarde)location;
		locationSauvegarde.setClient(client);
		this.Locations.add(locationSauvegarde);
		this.save();
	}
	/**
	 * Dé-archive une location
	 * @param location
	 */
	public void removeLocation(Location location){
		this.Locations.remove(location);
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
