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
	public Opel(int speakerCount, Color color){
		super(4, color);
		
		this.speakerCount = speakerCount;
		this.hasRadio = (speakerCount>0);
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
	
	@Override
	public void drive(double kilometer){
		if(super.getFuelLevel()<=0){ return; }
		super.setFuelLevel(super.getFuelLevel()-kilometer/100*6); //6 liter auf 100 kilometer
	}

	@Override
	public void tanken(float liter) {
		if(liter<=0){ return; }
		super.setFuelLevel(super.getFuelLevel()+liter);
	}
}
