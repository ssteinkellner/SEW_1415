package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public class Astra extends Opel{
	private int wheelSize;
	private boolean isCabrio;
	
	/**
	 * erstellt ein neues Auto der Marke Opel vom Typ Astra
	 * @param wheelSize gr��e der Reifen (in Zoll)
	 * @param speakerCount Anzahl der Lautsprecher
	 * @param hasRadio information �ber das vorhandensein eines Radios
	 * @param color farbe der Au�enhaut
	 * @param isCabrio information, ob Cabrio- oder Fix-dach
	 */
	public Astra(int wheelSize, int speakerCount, boolean hasRadio, Color color, boolean isCabrio){
		super(speakerCount, hasRadio, color);

		this.isCabrio = isCabrio;
		this.wheelSize = wheelSize;
	}
	
	/**
	 * gibt die Gr��e der R�der zur�ck
	 * @return gr��e der R�der
	 */
	public int getWheelSize(){
		return wheelSize;
	}

	/**
	 * gibt true zur�ck, wenn das Auto ein Cabrio ist
	 * @return information ob Cabrio- oder Fix-dach
	 */
	public boolean isCabrio(){
		return isCabrio;
	}
}
