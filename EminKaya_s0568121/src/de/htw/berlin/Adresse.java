package de.htw.berlin;
/**
 * @author kayae
 *In dieser Klasse werden die Eigenschaften der Adresse beschrieben.
 */
public class Adresse {
	
	private String strasse, hausnummer, plz, ort;
	/**
	 * Konstruktor der Klasse Adresse um neues Objekt zu erstellen
	 * 
	 * @param strasse 	 Strasse der Adresse
	 * @param hausnummer Hausnummer der Adresse
	 * @param plz   	 Postleitzahl der Adresse
	 * @param ort      	 Ort der Adresse
	 */
	public Adresse(String strasse, String hausnummer, String plz, String ort) {
		this.strasse = strasse;
		this.hausnummer= hausnummer;
		this.plz = plz;
		this.ort = ort;
	}
	/**
	 * Methode um Adresse in String zu wandeln und diesen String zurück zu geben
	 * 
	 * @return gibt die Adresse als einzigen String wieder
	 */
	@Override
	public String toString() {
		return "Adresse [Strasse=" + strasse + ", Hausnummer=" + hausnummer + ", Plz=" + plz + ", Ort=" + ort + "]";
	}

}//end of class
