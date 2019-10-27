import java.util.ArrayList;

/**
 * @author kayae In dieser Klasse werden die Eigenschaften der Reiseagentur
 *         beschrieben.
 */
public class Reiseagentur {
	private String name, usridnr;
	private Adresse adresse;
	private ArrayList<Kunde> kunde = new ArrayList<Kunde>();

	/**
	 * Konstruktor f�r Objekte der Klasse Reiseagentur um neues Objekt zu erstellen.
	 * 
	 * @param name    Name der Reiseagentur
	 * @param usridnr USTID Nr. einer Reiseagentur
	 * @param adresse Adresse der Reiseagentur
	 * @param setKunde Liste mit allen Kunden der Reiseagentur
	 */

	public Reiseagentur(String name, String usridnr, Adresse adresse,Kunde... kunde) {
		this.name = name;
		this.usridnr = usridnr;
		this.adresse = adresse;
		setKunde(kunde);

	}
	
	/*
	 * 	@param Setter f�r Kunde
	 */
	private void setKunde(Kunde[] kunde) {
		for (Kunde knd : kunde) {
			this.kunde.add(knd);
		}
	}

	/**
	 * Methode um Objekte aus der Klasse Reiseagentur in einen String umzuwandeln
	 * und diesen zur�ck zu geben
	 * 
	 * @return gibt Reiseagenturinformationen als String zur�ck
	 */
	@Override
	public String toString() {
		return "Reiseagentur [Name=" + name + ", USR-IDNR=" + usridnr + ", adresse=" + adresse + "]\n" + kunde;
	}

/**
 * Methode die der ArrayListe Kunde Kunden hinzuf�gt
 * @param kunde
 */
	public void addKunde(Kunde kunde) {
		this.kunde.add(kunde);
	}

	/**
	 * Such-Alghorithmmus der Kunde nach Kundennummer sucht
	 * @param index eingegebene Kunndennummer nach der Kunden gesucht werden soll
	 * @return gefundener Kunde
	 */
	public Kunde getKunde(String index) {
		Kunde kunde = null;

		for (int i = 0; i < this.kunde.size(); i++) {

			if (this.kunde.get(i).getKundennummer().equals(index))
				kunde = this.kunde.get(i);
		}
		return kunde;

	}

}
