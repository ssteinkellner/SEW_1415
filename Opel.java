package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public class Opel extends Auto{
	private int speakerCount;
	private boolean hasRadio;
	
	/**
	 * erstellt ein neues Auto der Marke Opel
	 * @param speakerCount Anzahl der Lautsprecher
	 * @param hasRadio information über das vorhandensein eines Radios
	 * @param color farbe der Außenhaut
	 */
	public Opel(int speakerCount, boolean hasRadio, Color color){
		super(4, color);
		
		this.speakerCount = speakerCount;
		this.hasRadio = hasRadio;
	}
	
	/**
	 * gibt die Anzahl der Lautsprecher zurück
	 * @return Anzahl der Lautsprecher
	 */
	public int getSpeakerCount(){
		return speakerCount;
	}
	
	/**
	 * gibt zurück, ob das Auto mit einem Radio ausgestattet ist
	 * @return vorhandensein eines Radios
	 */
	public boolean hasRadio(){
		return hasRadio;
	}
}
