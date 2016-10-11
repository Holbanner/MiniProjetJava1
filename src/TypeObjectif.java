
public class TypeObjectif {
	/*
	 * Attribut
	 * */
	private float min;
	
	/*
	 * Getter & Setter
	 */
	public float getMin() {
		return min;
	}
	public void setMin(float min) {
		this.min = min;
	}
	public float getMax() {
		return max;
	}
	public void setMax(float max) {
		this.max = max;
	}
	private float max;
	
	//méthodes
	public String toString(){
		return "Type d'objectif : maximum => "+ this.getMax() + "minimum => "+ this.getMax(); 
	}
}
