package lokaler;

/**
 * Man kan argumentere for at EDB_Lokale burde nedarve fra {@link KlasseLokale} 
 * fordi et EDB-lokale netop er et specialiseret klasselokale. 
 * Nedarving fra KlasseLokale vil tillade at EDB_Lokale kan 
 * genbruge resultatet af beregningen af kapacitet fra KlasseLokale.
 * 
 * @see KlasseLokale#kapacitet()
 * @see EDB_Lokale#kapacitet()
 * 
 * @author awp
 */
public class EDB_Lokale extends Lokale {
	private final double arealPerStuderende = 2.5;
	private final double strømPerPC = 3.0;
	private final double pcerPerStuderende = 1.0;

	public EDB_Lokale(int areal, int strøm) {
		super(areal, strøm);
	}
	
	public EDB_Lokale(EDB_Lokale other) {
		super(other);
	}

	@Override
	public int kapacitet() {
		return Math.min((int) (getAreal() / arealPerStuderende), (int) (getStrøm() / strømPerPC / pcerPerStuderende));
	}
	
	@Override
	public String toString() {
		return null;
	}

}
