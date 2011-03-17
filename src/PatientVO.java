import java.util.GregorianCalendar;

/**
 * 
 * @author Sven Hornberg
 *
 */
public class PatientVO {

	private String nachname;
	private String vorname;
	private String geschlecht;
	private GregorianCalendar geburtsdatum;
	

	/**
	 * 
	 * @param nachname Nachname des Patienten
	 * @param vorname Vorname des Patienten
	 * @param geschlecht Geschlecht vom Patienten
	 * @param geburtsdatum Geburtstag des Patienten
	 */
	public PatientVO(String nachname, String vorname, String geschlecht, GregorianCalendar geburtsdatum) {
		
		this(nachname,vorname,geschlecht);
		this.setGeburtsdatum(geburtsdatum);
	}
	
	/**
	 * 
	 * @param nachname Nachname des Patienten
	 * @param vorname Vorname des Patienten
	 * @param geschlecht Geburtstag des Patienten
	 */
	public PatientVO(String nachname, String vorname, String geschlecht) {
		
		this(nachname, vorname);
		this.setGeschlecht(geschlecht);
	}
	
	/**
	 * 
	 * @param nachname Nachname des Patienten
	 * @param vorname Vorname des Patienten
	 */
	public PatientVO(String nachname, String vorname) {
	
		this.setNachname(nachname);
		this.setVorname(vorname);
	}
	
	public PatientVO() {
		
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getGeschlecht() {
		return this.geschlecht;
	}

	public void setGeburtsdatum(GregorianCalendar geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public GregorianCalendar getGeburtsdatum() {
		return this.geburtsdatum;
	}
	
	
	
}
