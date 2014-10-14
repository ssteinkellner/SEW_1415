package oop;

import java.awt.Color;

/**
 * @author Steinkellner Sebastian
 * @version 141009
 */
public class Auto {
	private int wheelCount;
	private Color color;
	
	/**
	 * erstellt ein neues Auto
	 * @param wheelCount anzahl der Räder
	 * @param color farbe der Außenhaut
	 */
	public Auto(int wheelCount, Color color){
		this.wheelCount = wheelCount;
		this.color = color;
	}
	
	/**
	 * gibt die Anzahl der Räder zurück
	 * @return anzahl der Räder
	 */
	public int getWheelCount(){
		return wheelCount;
	}
	
	/**
	 * gibt die Farbe der Außenhaut zurück
	 * @return farbe der Außenhaut
	 */
	public Color getColor(){
		return color;
	}
}
