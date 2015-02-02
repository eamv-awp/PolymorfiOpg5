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
