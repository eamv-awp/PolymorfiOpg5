package lokaler;

public abstract class Lokale {
	
	private int areal;
	private int strøm;
	
	public Lokale(int areal, int strøm) {
		this.areal = areal;
		this.strøm = strøm;
	}
	
	public Lokale (Lokale other) {
		this.areal = other.areal;
		this.strøm = other.strøm;
	}
	
	public abstract int kapacitet();
	
	protected int getAreal() {
		return this.areal;
	}
	
	protected int getStrøm() {
		return this.strøm;
	}
	
	@Override
	public String toString() {
		return "Lokalet er på " + getAreal() + " m2 og med et maksimalt strømudtag på " + getStrøm() + " enheder.\n" 
			 + "Lokalet har en maksimal kapacitet på " + kapacitet() + " studerende.";
	}

}
