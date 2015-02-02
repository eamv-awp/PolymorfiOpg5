package lokaler;

public abstract class Lokale {
	
	private int areal;
	private int strøm;
	
	public Lokale(int areal, int strøm) {
		this.areal = areal;
		this.strøm = strøm;
	}
	
	public Lokale (Lokale other) {
		
	}
	
	public abstract int kapacitet();
	
	protected int getAreal() {
		return 0;
	}
	
	protected int getStrøm() {
		return 0;
	}
	
	@Override
	public String toString() {
		return null;
	}

}
