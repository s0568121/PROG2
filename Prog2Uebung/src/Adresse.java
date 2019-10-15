
public class Adresse {
	//Teil1
	private String strasse;
	private String hausnummer;
	private String plz;
	private String Ort;
	//Teil2
	public Adresse(String strasse, String hausnummer, String plz, String ort) {
		this.strasse = strasse;
		this.hausnummer= hausnummer;
		this.plz = plz;
		this.Ort = ort;
	}
	//Teil3
	public String getHausnummer() {
		return hausnummer;
	}

	@Override
	public String toString() {
		return "Adresse [strasse=" + strasse + ", hausnummer=" + hausnummer + ", plz=" + plz + ", Ort=" + Ort + "]";
	}
	
	
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return Ort;
	}

	public void setOrt(String ort) {
		Ort = ort;
	}
	
	
	
}
