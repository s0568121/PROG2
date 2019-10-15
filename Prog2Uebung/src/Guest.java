
public class Guest {
	//Teil1
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private Adresse privatadresse;
	private Adresse geschaeflicheadresse;
	private String telefonnummer;
	private String eMail;
	//Teil2
	public Guest(String vorname, String nachname, String geburtsdatumd, Adresse privatadresse,Adresse geschaeflicheadresse, String telefonnummer, String email)
	{	
		this.vorname=vorname;
		this.nachname=nachname;
		this.geburtsdatum=geburtsdatumd;
		this.privatadresse=privatadresse;
		this.geschaeflicheadresse=geschaeflicheadresse;
		this.telefonnummer=telefonnummer;
		this.eMail=email;	
	}
	//Teil3
	public String getVorname() {
		return vorname;
	}
	@Override
	public String toString() {
		return "Guest [vorname=" + vorname + ", nachname=" + nachname + ", geburtsdatum=" + geburtsdatum
				+ ", privatadresse=" + privatadresse + ", geschaeflicheadresse=" + geschaeflicheadresse
				+ ", telefonnummer=" + telefonnummer + ", eMail=" + eMail + "]";
	}
	public void setVorname(String vorname) {
		vorname= vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		nachname = nachname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		geburtsdatum = geburtsdatum;
	}

	public Adresse getPrivatadresse() {
		return privatadresse;
	}

	public void setPrivatadresse(Adresse privatadresse) {
		privatadresse = privatadresse;
	}
	
	public Adresse getGeschaeflicheadresse() {
		return geschaeflicheadresse;
	}
	public void setGeschaeflicheadresse(Adresse geschaeflicheadresse) {
		geschaeflicheadresse=geschaeflicheadresse;
	}

 	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		telefonnummer = telefonnummer;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		eMail = eMail;
	}
	
	
}
