import lokaler.KlasseLokale;

public class Test {

	public static void main(String[] args) {
		testKlasseLokalePå40Kvm();
//		testKlasseLokalePå30Kvm();
//		testKopiAfKlasseLokalePå40Kvm();
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
		
	}
	
	private static void testKopiAfKlasseLokalePå40Kvm() {
		
	}
	
	private static void testEDB_LokalePå20KvmMed25EnhederStrøm() {
		
	}
	
	private static void testEDB_LokalePå60KvmMed70EnhederStrøm() {
		
	}

}