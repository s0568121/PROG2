package de.htw.berlin;

/**
 * @author kayae
 * In dieser Klasse werden die Eigenschaften der Bezahlmethode beschrieben.
 */
public class Bezahlmethode {
	
	private String bezeichnung, konto;

	/**
	 * Konstruktor der Klasse Bezahlmethode um neues Objekt anzulegen
	 * 
	 * @param bezeichnung Bezeichnung der Bezahlmethode 
	 * @param konto       Konto der Bezahlmethode
	 */
	
	public Bezahlmethode(String bezeichnung, String konto) {
		this.bezeichnung=bezeichnung;
		this.konto=konto;
		
	}

	/**
	 * Methode um Objekte aus der Klasse Bezahlmethode in String zu wandeln
	 * und diesen String zurück zu geben
	 * 
	 * @return Bezahlmethode als String mit jeweiliger Bezeichnung und des
	 *         Konto
	 */
	@Override
	public String toString() {
	return "[Bezeichnung=" + bezeichnung + ", Konto=" + konto + "]\n";
	}

	/**
	 * Methode zur Rückgabe der Bezeichnung einer Bezahlmethode
	 * 
	 * @return Bezeichnung als String
	 */
	public String getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * Setter für Bezeichnung der Bezahlmethode
	 * @param bezeichnung 
	 */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	/**
	 * Methode zur Rückgabe des Kontos einer Bezahlmethode
	 * 
	 * @return Konto als String
	 */
	public String getKonto() {
		return konto;
	}

	/**
	 * Setter für Konto der Bezahlmethode
	 * @param konto 
	 */
	public void setKonto(String konto) {
		this.konto = konto;
	}
	
	
	

}
