import java.util.ArrayList;

/**
 * @author kayae In dieser Klasse werden die Eigenschaften des Kunden
 *         beschrieben.
 */
public class Kunde {

	private String kundennummer;
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private String telefonnummer;
	private String eMail;
	private Adresse privatadresse;
	private Adresse geschaeftlicheadresse;
	private ArrayList<Bezahlmethode> bezahlmethode = new ArrayList<Bezahlmethode>();

	/*
	 * Konstruktor der Klasse Kunde um neues Objekt (Kunden) anzulegen
	 * Konstruktor mit den Parametern:
	 * @param kundennummer  kundennummer des Kunden
	 * @param vorname des Kunden
	 * @param nachname des Kunden
	 * @param geburtsdatum des Kunden
	 * @param privatadresse des Kunden
	 * @param geschaeftlicheadresse des Kunden
	 * @param telefonnummer des Kunden
	 * @param eMail des Kunden
	 * @param setBezahlmethode Liste mit allen Bezahlmethoden des Kundens
	 */
	public Kunde(String kundennummer, String vorname, String nachname, String geburtsdatumd, Adresse privatadresse,
			Adresse geschaeftlicheadresse, String telefonnummer, String email, Bezahlmethode... bezahlmethode) {
		this.kundennummer = kundennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatumd;
		this.privatadresse = privatadresse;
		this.geschaeftlicheadresse = geschaeftlicheadresse;
		this.telefonnummer = telefonnummer;
		this.eMail = email;
		setBezahlmethode(bezahlmethode);

	}
	/*
	 * 	@param Setter für Bezahlmethode
	 */
	private void setBezahlmethode(Bezahlmethode[] bezahlmethode) {
		for (Bezahlmethode bzlmthde : bezahlmethode) {
			this.bezahlmethode.add(bzlmthde);
		}
	}

	/**
	 * Methode um Objekte aus der Klasse Kunde in String zu wandeln und diesen
	 * String zurück zu geben
	 * 
	 * @return Kunde als String mit jeweiliger kundennummer, vorname, nachname,
	 *         geburtsdatum, privatadresse, geschaeftlicheadresse, telefonnummer,
	 *         eMail, bezahlmethode1,2 und oder 3.
	 */
	@Override
	public String toString() {
		return "Guest [Kundennummer=" + kundennummer + ", Vorname=" + vorname + ", Nachname=" + nachname
				+ ", Geburtsdatum=" + geburtsdatum + ", Privatadresse=" + privatadresse + ", Geschaeflicheadresse="
				+ geschaeftlicheadresse + ", Telefonnummer=" + telefonnummer + ", E-Mail=" + eMail + ", \nBezahlmethode= "
				+ bezahlmethode + "]\n";
	}

	/**
	 * Methode zur Rückgabe der Kundennummer eines Kunden
	 * 
	 * @return Kundennummer als String
	 */
	public String getKundennummer() {
		return kundennummer;
	}

	/**
	 * Setter für Kundennummer des Kundens
	 * @param kundennummer 
	 */
	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}

	/**
	 * Methode die der ArrayListe Bezahlmethode Bezahlmethoden hinzufügt
	 * @param bezahlmethode
	 */

	public void addBezahlmethode(Bezahlmethode bezahlmethode) {
		this.bezahlmethode.add(bezahlmethode);
	}
/**
 *  Such-Alghorithmmus der Bezahlmethoden nach Bezeichnung sucht
 * @param index eingegbene Bezeichnung nach der Bezahlmethode gesucht wird 
 * @return gefundener Kunde
 */
	public Bezahlmethode getBezahlmethode(Object index) {

		if (index instanceof String) {
			for (int i = 0; i < bezahlmethode.size(); i++) {

				if ((bezahlmethode.get(i).getBezeichnung()).equals((String) index)) {
					return bezahlmethode.get(i);

				}

			}

		}
		return bezahlmethode.get((Integer) index);

	}

}
