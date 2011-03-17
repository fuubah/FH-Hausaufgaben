/**
 * 
 * @author Sven Hornberg
 *
 */
public class PulsOxiVO {

	private short puls;
	private short spO2;
	
	public PulsOxiVO() {
		
	}
	
	/**
	 * 
	 * @param spO2 Sauerstoffsättigung im Blut
	 * @param puls Puls 
	 * @throws InvalidValue 
	 */
	public PulsOxiVO(short spO2, short puls) {
		this.setSpO2(spO2);
		this.setPuls(puls);
	}

	public void setPuls(short puls) {
		
		if(puls > 200 || puls < 20) {
			//Exception ausgeben
		}
		
		this.puls = puls;
	}

	public short getPuls() {
		return this.puls;
	}
	
	public void setSpO2(short spO2) {
		
		if(spO2 > 100 || spO2 < 50) {
			//Exception ausgeben
		}
		
		this.spO2 = spO2;
	}

	public short getSpO2() {
		return this.spO2;
	}	
}
