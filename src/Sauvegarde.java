import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Sauvegarde {

	private ArrayList<Location> Locations;
	private int mois;

	public Sauvegarde(int mois){
		this.setMois(mois);
		
//		try {
//			FileInputStream fileIn = new FileInputStream( this.FICHIER);
//			System.out.printf("Hallo");
//			ObjectInputStream in = new ObjectInputStream(fileIn);
//			loci = (Location) in.readObject();
//			in.close();
//			fileIn.close();
//			return loci;
//		} catch (IOException i) {
//			i.printStackTrace();
//		} catch (ClassNotFoundException c) {
//			System.out.println("Location class not found");
//			c.printStackTrace();
////		}
		
	}
	
	public static Sauvegarde getSauvegarde(int mois){
		Sauvegarde sauvegarde;
		try {//si on arrive à trouver le fichier on le charge
			FileInputStream fileIn = new FileInputStream( "fichier");

			ObjectInputStream in = new ObjectInputStream(fileIn);
			sauvegarde = (Sauvegarde) in.readObject();
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {//sinon on créé une nouvelle sauvegarde
			sauvegarde = new Sauvegarde(mois);
		} catch (ClassNotFoundException e) {
			sauvegarde = new Sauvegarde(0);
			e.printStackTrace();
		} catch (IOException e) {
			sauvegarde = new Sauvegarde(0);
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
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
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
			FileOutputStream fileOut = new FileOutputStream("fichier");
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
