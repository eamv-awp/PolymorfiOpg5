import lokaler.KlasseLokale;

public class Test {

	public static void main(String[] args) {
		testKlasseLokalePå40Kvm();
		testKlasseLokalePå30Kvm();
		testKopiAfKlasseLokalePå40Kvm();
//		testEDB_LokalePå20KvmMed25EnhederStrøm();
//		testEDB_LokalePå60KvmMed70EnhederStrøm();
	}
	
	private static void testKlasseLokalePå40Kvm() {
		System.out.println("Forventet output:");
		System.out.println("  Lokaletype: Klasselokale");
		System.out.println("  Areal:      40 m2");
		System.out.println("  Strømudtag: 0 enheder");
		System.out.println("  Kapacitet:  16 studerende");
		System.out.println("Faktisk output:");
		System.out.println(new KlasseLokale(40, 0));
		System.out.println();
	}
	
	private static void testKlasseLokalePå30Kvm() {
		System.out.println("Forventet output:");
		System.out.println("  Lokaletype: Klasselokale");
		System.out.println("  Areal:      30 m2");
		System.out.println("  Strømudtag: 0 enheder");
		System.out.println("  Kapacitet:  12 studerende");
		System.out.println("Faktisk output:");
		System.out.println(new KlasseLokale(30, 0));
		System.out.println();
	}
	
	private static void testKopiAfKlasseLokalePå40Kvm() {
		System.out.println("Forventet output:");
		System.out.println("  Lokaletype: Klasselokale");
		System.out.println("  Areal:      40 m2");
		System.out.println("  Strømudtag: 0 enheder");
		System.out.println("  Kapacitet:  16 studerende");
		System.out.println("Faktisk output:");
		System.out.println(new KlasseLokale(new KlasseLokale(40, 0)));
		System.out.println();
	}
	
	private static void testEDB_LokalePå20KvmMed25EnhederStrøm() {
		
	}
	
	private static void testEDB_LokalePå60KvmMed70EnhederStrøm() {
		
	}

}
