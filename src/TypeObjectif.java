import java.io.Serializable;


public class TypeObjectif implements Serializable{
	/*
	 * Attribut
	 * */
	private int min;
	
	/*
	 * Getter & Setter
	 */
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	private int max;
	
	public TypeObjectif(int min, int max){
		this.setMax(max);
		this.setMin(min);
	}
	
	//m�thodes
	
	/**
	 * retourne les infos
	 */
	public String toString(){
		return "	maximum => "+ this.getMax() + " minimum => "+ this.getMax(); 
	}
}