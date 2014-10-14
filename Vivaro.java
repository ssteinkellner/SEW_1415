package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public class Vivaro extends Opel{
	private int wheelSize;
	private boolean isVan;
	
	/**
	 * erstellt ein neues Auto der Marke Opel vom Typ Vivaro (Kastenwagen)
	 * @param wheelSize größe der Reifen (in Zoll)
	 * @param speakerCount Anzahl der Lautsprecher
	 * @param hasRadio information über das vorhandensein eines Radios
	 * @param color farbe der Außenhaut
	 * @param isVan information, ob Lasten- oder Personentransporter
	 */
	public Vivaro(int wheelSize, boolean isVan, int speakerCount, boolean hasRadio, Color color){
		super(speakerCount, hasRadio, color);
		
		this.wheelSize = wheelSize;
		this.isVan = isVan;
	}
	
	/**
	 * gibt die Größe der Räder zurück
	 * @return größe der Räder
	 */
	public int getWheelSize(){
		return wheelSize;
	}
	
	/**
	 * gibt true zurück, wenn das Auto ein Last ist
	 * @return information, ob Lasten- oder Personentransporter
	 */
	public boolean isVan(){
		return isVan;
	}
}
