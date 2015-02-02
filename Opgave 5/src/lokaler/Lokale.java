package lokaler;

public abstract class Lokale {
	
	private int areal;
	private int strøm;
	
	public abstract int kapacitet();
	
	public Lokale(int areal, int strøm) {
		
	}
	
	public Lokale (Lokale other) {
		
	}
	
	@Override
	public String toString() {
		return null;
	}

}
