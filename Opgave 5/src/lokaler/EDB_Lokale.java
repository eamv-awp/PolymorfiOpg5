package lokaler;

public class EDB_Lokale extends Lokale {

	public EDB_Lokale(int areal, int strøm) {
		super(areal, strøm);
	}
	
	public EDB_Lokale(EDB_Lokale other) {
		super(other);
	}

	@Override
	public int kapacitet() {
		return 0;
	}
	
	@Override
	public String toString() {
		return null;
	}

}
