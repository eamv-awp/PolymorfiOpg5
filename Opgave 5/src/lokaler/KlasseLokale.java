package lokaler;

public class KlasseLokale extends Lokale {

	public KlasseLokale(int areal, int strøm) {
		super(areal, strøm);
	}
	
	public KlasseLokale(KlasseLokale other) {
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
