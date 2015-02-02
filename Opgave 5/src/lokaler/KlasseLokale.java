package lokaler;

public class KlasseLokale extends Lokale {
	private final double arealPerStuderende = 2.5;

	public KlasseLokale(int areal, int strøm) {
		super(areal, strøm);
	}
	
	public KlasseLokale(KlasseLokale other) {
		super(other);
	}

	@Override
	public int kapacitet() {
		return (int) (getAreal() / arealPerStuderende);
	}
	
	@Override
	public String toString() {
		return "Lokalet er et klasselokale.\n" + super.toString();
	}

}
