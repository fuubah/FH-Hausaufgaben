import java.util.GregorianCalendar;

/**
 * 
 * @author Sven Hornberg
 *
 */
public class TestdriverDatum {
	
	public static void main(String[] args) {
		
		//Testdaten erstellen
		GregorianCalendar heute = new GregorianCalendar();
		GregorianCalendar datum = new GregorianCalendar(1970,3,3);
		
		//Objekte erzeugen
		ArztVO meinArzt1 = new ArztVO("Bibber", "Hans");
		ArztVO meinArzt2 = new ArztVO();
		meinArzt2.setNachname("Frankenstein");
		meinArzt2.setVorname("Peter");
		
		PatientVO meinPatient = new PatientVO("Mario", "Hanna", "weiblich", new GregorianCalendar());
		meinPatient.setGeburtsdatum(new GregorianCalendar(1986, 1, 1));
		
		PulsOxiVO meinPulsOxi = new PulsOxiVO((short)66, (short)88);
		meinPulsOxi.setPuls((short)90);
		
		System.out.println("Heute: " +  heute);
		System.out.println("Datum: " +  datum);
		
		System.out.println("meinArzt1: " +  meinArzt1);
		System.out.println("meinArzt2: " +  meinArzt2);
	
		System.out.println("meinPatient: " +  meinPatient);
		System.out.println("Geburtstag: " +  meinPatient.getGeburtsdatum());
		System.out.println("Nachname: " +  meinPatient.getNachname());
	}
}
