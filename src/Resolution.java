import java.io.Serializable;


public class Resolution implements Serializable{
	/*
	 * Attribut
	 * */
	//axes de la résolution
	private int x;
	private int y;
	/*
	 * Getter & Setter
	 */
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public Resolution(int X, int Y){
		this.setX(X);
		this.setY(Y);
	}
	
	//méthodes
	
	/**
	 * retourne les infos
	 */
	public String toString(){
		return "	x => " + this.getX() + " y => " + this.getY();
	}
}
