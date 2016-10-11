
public class Resolution {
	/*
	 * Attribut
	 * */
	//axes de la résolution
	private float x;
	
	/*
	 * Getter & Setter
	 */
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	private float y;
	
	//méthodes
	
	public String toString(){
		return "Résolution :  x => " + this.getX() + " y => " + this.getY();
	}
}
