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

public class Sauvegarde {

	private ArrayList<Location> Locations;
	private Calendar cal;

	public Sauvegarde(Calendar cal){
		this.setCal(cal);		
	}
	
	public static Sauvegarde getSauvegarde(Calendar cal){
		Sauvegarde sauvegarde;
		try {//si on arrive à trouver le fichier on le charge
			FileInputStream fileIn = new FileInputStream(cal.get(Calendar.YEAR)+""+cal.get(Calendar.MONTH)+".loc");

			ObjectInputStream in = new ObjectInputStream(fileIn);
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
	
	public void addLocation(Location location, Client client){
		LocationSauvegarde locationSauvegarde = (LocationSauvegarde)location;
		locationSauvegarde.setClient(client);
		this.Locations.add(locationSauvegarde);
		this.save();
	}
	
	public void removeLocation(Location location){
		this.Locations.remove(location);
		this.save();
	}
	
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
	
	public static void main(String[] args) {
		
	}
}
