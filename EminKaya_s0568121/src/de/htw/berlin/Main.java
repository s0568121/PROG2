package de.htw.berlin;
/**
 * @author kayae
 *
 */
public class Main {
	/**
	 * Main-Methode zum Anlegen der einzelnen Objekte und aufrufen der Methode die
	 * das Reisebüro mit den jeweiligen Kunden und ihren Bezahlmethoden auf der Konsole ausgibt
	 *
	 * @param args Kommandozeilenparameter
	 */
	public static void main(String[] args) {
		Adresse privatAdresse1 = new Adresse("Naunynstrasse", "8", "10997", "Berlin");
		Adresse privatAdresse2 = new Adresse("Diffenbachstrasse", "66", "10967", "Berlin");
		Adresse privatAdresse3 = new Adresse("Dresdenerstrasse", "12", "10999", "Berlin");
		Adresse geschaeftlicheAdresse1 = new Adresse("Treskowalle", "8a", "10318", "Berlin");
		Adresse geschaeftlicheAdresse2 = new Adresse("Wilhelminenhofstrasse", "75A", "12459 ", "Berlin");
		Adresse reiseagenturadresse = new Adresse("Hauptstraße", "5a", "10559", "Berlin");

		Bezahlmethode bezahlmethodekunde1 = new Bezahlmethode("PayPall", "kayaemin@gmail.com");
		Bezahlmethode bezahlmethodekunde2 = new Bezahlmethode("PayBack", "demirsüleyman@gmail.com");
		Bezahlmethode bezahlmethodekunde3 = new Bezahlmethode("Lastschrift", "TahaGenel");
		Bezahlmethode bezahlmethode2kunde2 = new Bezahlmethode("Klarna", "demirsüleyman@gmail.com");
		Bezahlmethode bezahlmethode2kunde3 = new Bezahlmethode("Mastercard", "geneltaha@gmail.com");
		Bezahlmethode bezahlmethode3kunde3 = new Bezahlmethode("Giropay", "geneltaha@gmail.com");

		Kunde kunde1 = new Kunde("012345", "Emin", "Kaya", "10.09.2000", privatAdresse1, null, "017683027937",
				"kayaemin@gmail.com", bezahlmethodekunde1);
		Kunde kunde2 = new Kunde("012346", "Süleyman", "Demir", "17.03.2001", privatAdresse2, geschaeftlicheAdresse1,
				"017632162530", "demirsüleyman@gmail.com", bezahlmethodekunde2,bezahlmethode2kunde2);
		Kunde kunde3 = new Kunde("012347", "Taha", "Genel", "28.04.2001", privatAdresse3, geschaeftlicheAdresse2,
				"017630392873", "geneltaha@gmail.com", bezahlmethodekunde3, bezahlmethode2kunde3, bezahlmethode3kunde3);
		Reiseagentur reiseagentur = new Reiseagentur("Magic Holidays Reiseagentur", "DE812524001", reiseagenturadresse,kunde1,kunde2,kunde3);

		System.out.println(reiseagentur);
		

	}

}
