/**
 * 
 * @author Sven Hornberg
 *
 */
public class ArztVO {
	
	private String nachname;
	private String vorname;
	
	public ArztVO(String nachname, String vorname) {
		
		this.setNachname(nachname);
		this.setVorname(vorname);
	}
	
	public ArztVO() {
		
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
}
